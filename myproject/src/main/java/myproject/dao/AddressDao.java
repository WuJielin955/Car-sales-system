package myproject.dao;

import myproject.common.utils.BaseDao;
import myproject.entity.AddressEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 地址
*
*/
@Mapper
public interface AddressDao extends BaseDao<AddressEntity> {

}