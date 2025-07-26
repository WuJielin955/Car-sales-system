package myproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ArrayUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import myproject.common.impl.BaseServiceImpl;
import myproject.common.page.PageResult;
import myproject.convert.OrdersConvert;
import myproject.dao.OrdersDao;
import myproject.entity.OrdersEntity;
import myproject.query.OrdersQuery;
import myproject.service.OrdersService;
import myproject.vo.OrdersVO;

import java.util.List;
import java.util.Map;

/**
 * 订单
 */
@Service
@AllArgsConstructor
public class OrdersServiceImpl extends BaseServiceImpl<OrdersDao, OrdersEntity> implements OrdersService {

	private final OrdersDao ordersDao;


	@Override
	public PageResult<OrdersVO> page(OrdersQuery query) {
		IPage<OrdersEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));

		return new PageResult<>(OrdersConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
	}

	@Override
	public List<OrdersVO> queryList(OrdersQuery query) {

		return OrdersConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
	}

	private LambdaQueryWrapper<OrdersEntity> getWrapper(OrdersQuery query) {
		LambdaQueryWrapper<OrdersEntity> wrapper = Wrappers.lambdaQuery();
		wrapper.eq(null != query.getId(), OrdersEntity::getId, query.getId());
		wrapper.between(ArrayUtils.isNotEmpty(query.getAddtime()), OrdersEntity::getAddtime, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[0] : null, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[1] : null);
		wrapper.eq(StringUtils.isNotEmpty(query.getOrderid()), OrdersEntity::getOrderid, query.getOrderid());
		wrapper.eq(null != query.getUserid(), OrdersEntity::getUserid, query.getUserid());
		wrapper.eq(null != query.getGoodid(), OrdersEntity::getGoodid, query.getGoodid());
		wrapper.like(StringUtils.isNotEmpty(query.getGoodname()), OrdersEntity::getGoodname, query.getGoodname());
		wrapper.eq(StringUtils.isNotEmpty(query.getPicture()), OrdersEntity::getPicture, query.getPicture());
		wrapper.eq(null != query.getBuynumber(), OrdersEntity::getBuynumber, query.getBuynumber());
		wrapper.eq(null != query.getPrice(), OrdersEntity::getPrice, query.getPrice());
		wrapper.eq(null != query.getDiscountprice(), OrdersEntity::getDiscountprice, query.getDiscountprice());
		wrapper.eq(null != query.getTotal(), OrdersEntity::getTotal, query.getTotal());
		wrapper.eq(null != query.getDiscounttotal(), OrdersEntity::getDiscounttotal, query.getDiscounttotal());
		wrapper.eq(null != query.getType(), OrdersEntity::getType, query.getType());
		wrapper.eq(StringUtils.isNotEmpty(query.getStatus()), OrdersEntity::getStatus, query.getStatus());
		wrapper.eq(StringUtils.isNotEmpty(query.getAddress()), OrdersEntity::getAddress, query.getAddress());
		wrapper.eq(StringUtils.isNotEmpty(query.getTel()), OrdersEntity::getTel, query.getTel());
		wrapper.eq(StringUtils.isNotEmpty(query.getConsignee()), OrdersEntity::getConsignee, query.getConsignee());
		wrapper.eq(StringUtils.isNotEmpty(query.getRemark()), OrdersEntity::getRemark, query.getRemark());
		wrapper.eq(StringUtils.isNotEmpty(query.getLogistics()), OrdersEntity::getLogistics, query.getLogistics());
		wrapper.eq(StringUtils.isNotEmpty(query.getShangjiazhanghao()), OrdersEntity::getShangjiazhanghao, query.getShangjiazhanghao());
		wrapper.eq(StringUtils.isNotEmpty(query.getFenlei()), OrdersEntity::getFenlei, query.getFenlei());
		return wrapper;
	}

	@Override
	@Transactional
	public void save(OrdersVO vo) {
		OrdersEntity entity = OrdersConvert.INSTANCE.convert(vo);
		baseMapper.insert(entity);
	}

	@Override
	public void update(OrdersVO vo) {
		OrdersEntity entity = OrdersConvert.INSTANCE.convert(vo);

		updateById(entity);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delete(List<Long> idList) {
		removeByIds(idList);
	}

	@Override
	public List<Map<String, Object>> selectValue(Map<String, Object> params, LambdaQueryWrapper<OrdersEntity> wrapper) {
		return ordersDao.selectValue(params, wrapper);
	}

	@Override
	public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, LambdaQueryWrapper<OrdersEntity> wrapper) {
		return ordersDao.selectTimeStatValue(params, wrapper);
	}

	@Override
	public List<Map<String, Object>> selectGroup(Map<String, Object> params, LambdaQueryWrapper<OrdersEntity> wrapper) {
		return ordersDao.selectGroup(params, wrapper);
	}

}