package myproject.service;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import myproject.common.page.PageResult;
import myproject.common.utils.BaseService;
import myproject.entity.OrdersEntity;
import myproject.query.OrdersQuery;
import myproject.vo.OrdersVO;

import java.util.List;
import java.util.Map;

/**
 * 订单
 */
public interface OrdersService extends BaseService<OrdersEntity> {

	PageResult<OrdersVO> page(OrdersQuery query);

	void save(OrdersVO vo);

	void update(OrdersVO vo);

	List<OrdersVO> queryList(OrdersQuery query);

	void delete(List<Long> idList);

	List<Map<String, Object>> selectValue(Map<String, Object> params, LambdaQueryWrapper<OrdersEntity> ew);

	List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, LambdaQueryWrapper<OrdersEntity> ew);

	List<Map<String, Object>> selectGroup(Map<String, Object> params, LambdaQueryWrapper<OrdersEntity> ew);
}