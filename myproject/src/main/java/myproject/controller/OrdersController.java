package myproject.controller;

import cn.dev33.satoken.annotation.SaIgnore;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.NumberUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import myproject.common.exception.ServerException;
import myproject.entity.QicheEntity;
import myproject.service.QicheService;
import org.springframework.web.bind.annotation.*;
import myproject.common.config.AliPay;
import myproject.common.page.PageResult;
import myproject.common.request.RequestSingleParam;
import myproject.common.utils.GloabUtils;
import myproject.common.utils.Result;
import myproject.convert.OrdersConvert;
import myproject.entity.OrdersEntity;
import myproject.entity.UsersEntity;
import myproject.query.OrdersQuery;
import myproject.service.OrdersService;
import myproject.service.UsersService;
import myproject.vo.OrdersVO;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 订单
 */
@RestController
@RequestMapping("orders")
@Tag(name = "订单")
@AllArgsConstructor
public class OrdersController {
	private final OrdersService ordersService;
	private final UsersService usersService;
	private final QicheService qicheService;
	@PostMapping("page")
	@Operation(summary = "分页")
	public Result<PageResult<OrdersVO>> page(@RequestBody @Valid OrdersQuery query) {
		if (!GloabUtils.isAdmin()) {
			query.setUserid(GloabUtils.getUserInfo().getUserid());
		}
		PageResult<OrdersVO> page = ordersService.page(query);

		return Result.ok(page);
	}

	@PostMapping("list")
	@Operation(summary = "列表")
	public Result<List<OrdersVO>> list(@RequestBody @Valid OrdersQuery query) {
		query.setUserid(GloabUtils.getUserId());
		List<OrdersVO> list = ordersService.queryList(query);
		return Result.ok(list);
	}

	@PostMapping("allList")
	@Operation(summary = "列表")
	@SaIgnore
	public Result<List<OrdersVO>> allList(@RequestBody @Valid OrdersQuery query) {
		List<OrdersVO> list = ordersService.queryList(query);
		return Result.ok(list);
	}

	@PostMapping("/info")
	@Operation(summary = "信息")
	public Result<OrdersVO> get(@RequestSingleParam("id") Long id) {
		OrdersEntity entity = ordersService.getById(id);
		return Result.ok(OrdersConvert.INSTANCE.convert(entity));
	}

	@PostMapping("save")
	@Operation(summary = "保存")
	public Result<AliPay> save(@RequestBody List<OrdersVO> ordersVOS) {
		String orderid = IdUtil.getSnowflakeNextIdStr();
		AliPay aliPay = new AliPay();
		aliPay.setTraceNo(orderid);
		Double totalAmount = 0D;
		for (OrdersVO vo : ordersVOS) {
			vo.setUserid(GloabUtils.getUserId());
			vo.setOrderid(orderid);
			totalAmount = NumberUtil.toDouble(NumberUtil.add(totalAmount, vo.getTotal()));
			QicheEntity qicheEntity = qicheService.getById(vo.getGoodid());
			if (qicheEntity.getNum()-vo.getBuynumber()<0) {
				throw new ServerException("库存不足");
			}
			qicheEntity.setNum(qicheEntity.getNum()-vo.getBuynumber());
			qicheService.updateById(qicheEntity);

			ordersService.save(vo);
		}
		aliPay.setTotalAmount(totalAmount);
		aliPay.setSubject(orderid);
		return Result.ok(aliPay);
	}

	@PostMapping("update")
	@Operation(summary = "修改")
	public Result<String> update(@RequestBody @Valid OrdersVO vo) {
		ordersService.update(vo);

		return Result.ok();
	}

	@PostMapping("delete")
	@Operation(summary = "删除")
	public Result<String> delete(@RequestBody List<Long> idList) {
		ordersService.delete(idList);

		return Result.ok();
	}

	@PostMapping("balancePay")
	public void balancePay(@RequestBody AliPay aliPay) {
		UsersEntity usersEntity = usersService.getById(GloabUtils.getUserId());
		double balance = NumberUtil.toDouble(NumberUtil.sub(usersEntity.getMoney(), Double.valueOf(aliPay.getTotalAmount())));
		usersEntity.setMoney(balance);
		usersService.updateById(usersEntity);
		OrdersQuery ordersQuery = new OrdersQuery();
		ordersQuery.setOrderid(aliPay.getTraceNo());
		List<OrdersVO> orders = ordersService.queryList(ordersQuery);
		if (!orders.isEmpty()) {
			for (OrdersVO orderVO : orders) {
				OrdersEntity order = OrdersConvert.INSTANCE.convert(orderVO);
				order.setStatus("已支付");
				order.setType(0);
				ordersService.updateById(order);
			}
		}
	}

	@PostMapping("getAlipay")
	@Operation(summary = "未支付点击支付")
	public Result<AliPay> getAlipay(@RequestBody @RequestSingleParam("id") String orderid) {
		JSONObject jsonObject = JSONUtil.parseObj(orderid);
		orderid = jsonObject.get("id").toString();
		OrdersQuery ordersQuery = new OrdersQuery();
		ordersQuery.setOrderid(orderid);
		List<OrdersVO> ordersVOS = ordersService.queryList(ordersQuery);
		AliPay aliPay = new AliPay();
		aliPay.setTraceNo(orderid);
		Double totalAmount = 0D;
		for (OrdersVO vo : ordersVOS) {
			totalAmount = NumberUtil.toDouble(NumberUtil.add(totalAmount, vo.getTotal()));
		}
		aliPay.setTotalAmount(totalAmount);
		aliPay.setSubject(orderid);
		return Result.ok(aliPay);
	}

	@PostMapping("refund")
	public void refund(@RequestSingleParam("id") Long id) {
		OrdersEntity entity = ordersService.getById(id);
		UsersEntity usersEntity = usersService.getById(GloabUtils.getUserId());
		double balance = NumberUtil.toDouble(NumberUtil.add(usersEntity.getMoney(), Double.valueOf(entity.getTotal())));
		usersEntity.setMoney(balance);
		usersService.updateById(usersEntity);
		OrdersEntity ordersEntity = new OrdersEntity();
		ordersEntity.setId(id);
		ordersEntity.setStatus("已退款");
		ordersService.updateById(ordersEntity);
	}

	/**
	 * （按值统计）
	 */
	@RequestMapping("/value/{xColumnName}/{yColumnName}")
	public Result value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, HttpServletRequest request) {
		Map<String, Object> params = new HashMap<>();
		params.put("xColumn", xColumnName);
		params.put("yColumn", yColumnName);
		LambdaQueryWrapper<OrdersEntity> wrapper = Wrappers.lambdaQuery();
		List<String> status = new ArrayList<>();
		status.add("已支付");
		status.add("已完成");
		status.add("未支付");
		status.add("已退款");
		wrapper.in(OrdersEntity::getStatus, status);
		List<Map<String, Object>> result = ordersService.selectValue(params, wrapper);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Map<String, Object> m : result) {
			for (String k : m.keySet()) {
				if (m.get(k) instanceof Date) {
					m.put(k, sdf.format((Date) m.get(k)));
				}
			}
		}
		return Result.ok(result);
	}

	/**
	 * （按值统计）时间统计类型
	 */
	@RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
	public Result valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType, HttpServletRequest request) {
		Map<String, Object> params = new HashMap<>();
		params.put("xColumn", xColumnName);
		params.put("yColumn", yColumnName);
		params.put("timeStatType", timeStatType);
		LambdaQueryWrapper<OrdersEntity> wrapper = Wrappers.lambdaQuery();
		List<String> status = new ArrayList<>();
		status.add("已支付");
		status.add("已完成");
		status.add("未支付");
		status.add("已退款");
		wrapper.in(OrdersEntity::getStatus, status);
		List<Map<String, Object>> result = ordersService.selectTimeStatValue(params, wrapper);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Map<String, Object> m : result) {
			for (String k : m.keySet()) {
				if (m.get(k) instanceof Date) {
					m.put(k, sdf.format((Date) m.get(k)));
				}
			}
		}
		return Result.ok(result);
	}

	/**
	 * 分组统计
	 */
	@RequestMapping("/group/{columnName}")
	public Result group(@PathVariable("columnName") String columnName, HttpServletRequest request) {
		Map<String, Object> params = new HashMap<>();
		params.put("column", columnName);
		LambdaQueryWrapper<OrdersEntity> wrapper = Wrappers.lambdaQuery();
		List<String> status = new ArrayList<>();
		status.add("已支付");
		status.add("已完成");
		status.add("未支付");
		status.add("已退款");
		wrapper.in(OrdersEntity::getStatus, status);
		List<Map<String, Object>> result = ordersService.selectGroup(params, wrapper);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Map<String, Object> m : result) {
			for (String k : m.keySet()) {
				if (m.get(k) instanceof Date) {
					m.put(k, sdf.format((Date) m.get(k)));
				}
			}
		}
		return Result.ok(result);
	}
}