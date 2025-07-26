package myproject.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import myproject.entity.OrdersEntity;
import myproject.vo.OrdersVO;

import java.util.List;

/**
 * 订单
 */
@Mapper
public interface OrdersConvert {
	OrdersConvert INSTANCE = Mappers.getMapper(OrdersConvert.class);

	OrdersEntity convert(OrdersVO vo);

	OrdersVO convert(OrdersEntity entity);

	List<OrdersVO> convertList(List<OrdersEntity> list);

}