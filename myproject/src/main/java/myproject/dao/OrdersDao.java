package myproject.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import myproject.common.utils.BaseDao;
import myproject.entity.OrdersEntity;

import java.util.List;
import java.util.Map;

/**
 * 订单
 */
@Mapper
public interface OrdersDao extends BaseDao<OrdersEntity> {

	List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params, @Param(Constants.WRAPPER) LambdaQueryWrapper<OrdersEntity> wrapper);

	List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params, @Param(Constants.WRAPPER) LambdaQueryWrapper<OrdersEntity> wrapper);

	List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params, @Param(Constants.WRAPPER) LambdaQueryWrapper<OrdersEntity> wrapper);
}