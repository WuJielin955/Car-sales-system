package myproject.dao;

import myproject.common.utils.BaseDao;
import myproject.entity.StoreupEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 收藏表
*
*/
@Mapper
public interface StoreupDao extends BaseDao<StoreupEntity> {

}