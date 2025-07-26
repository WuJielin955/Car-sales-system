package myproject.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import myproject.entity.OrdersEntity;
import myproject.vo.OrdersVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-10T18:15:11+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
public class OrdersConvertImpl implements OrdersConvert {

    @Override
    public OrdersEntity convert(OrdersVO vo) {
        if ( vo == null ) {
            return null;
        }

        OrdersEntity ordersEntity = new OrdersEntity();

        ordersEntity.setId( vo.getId() );
        ordersEntity.setAddtime( vo.getAddtime() );
        ordersEntity.setOrderid( vo.getOrderid() );
        ordersEntity.setUserid( vo.getUserid() );
        ordersEntity.setGoodid( vo.getGoodid() );
        ordersEntity.setGoodname( vo.getGoodname() );
        ordersEntity.setPicture( vo.getPicture() );
        ordersEntity.setBuynumber( vo.getBuynumber() );
        ordersEntity.setPrice( vo.getPrice() );
        ordersEntity.setDiscountprice( vo.getDiscountprice() );
        ordersEntity.setTotal( vo.getTotal() );
        ordersEntity.setDiscounttotal( vo.getDiscounttotal() );
        ordersEntity.setType( vo.getType() );
        ordersEntity.setStatus( vo.getStatus() );
        ordersEntity.setAddress( vo.getAddress() );
        ordersEntity.setTel( vo.getTel() );
        ordersEntity.setConsignee( vo.getConsignee() );
        ordersEntity.setRemark( vo.getRemark() );
        ordersEntity.setLogistics( vo.getLogistics() );
        ordersEntity.setShangjiazhanghao( vo.getShangjiazhanghao() );
        ordersEntity.setFenlei( vo.getFenlei() );

        return ordersEntity;
    }

    @Override
    public OrdersVO convert(OrdersEntity entity) {
        if ( entity == null ) {
            return null;
        }

        OrdersVO ordersVO = new OrdersVO();

        ordersVO.setId( entity.getId() );
        ordersVO.setAddtime( entity.getAddtime() );
        ordersVO.setOrderid( entity.getOrderid() );
        ordersVO.setUserid( entity.getUserid() );
        ordersVO.setGoodid( entity.getGoodid() );
        ordersVO.setGoodname( entity.getGoodname() );
        ordersVO.setPicture( entity.getPicture() );
        ordersVO.setBuynumber( entity.getBuynumber() );
        ordersVO.setPrice( entity.getPrice() );
        ordersVO.setDiscountprice( entity.getDiscountprice() );
        ordersVO.setTotal( entity.getTotal() );
        ordersVO.setDiscounttotal( entity.getDiscounttotal() );
        ordersVO.setType( entity.getType() );
        ordersVO.setStatus( entity.getStatus() );
        ordersVO.setAddress( entity.getAddress() );
        ordersVO.setTel( entity.getTel() );
        ordersVO.setConsignee( entity.getConsignee() );
        ordersVO.setRemark( entity.getRemark() );
        ordersVO.setLogistics( entity.getLogistics() );
        ordersVO.setShangjiazhanghao( entity.getShangjiazhanghao() );
        ordersVO.setFenlei( entity.getFenlei() );

        return ordersVO;
    }

    @Override
    public List<OrdersVO> convertList(List<OrdersEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<OrdersVO> list1 = new ArrayList<OrdersVO>( list.size() );
        for ( OrdersEntity ordersEntity : list ) {
            list1.add( convert( ordersEntity ) );
        }

        return list1;
    }
}
