package myproject.dao;

import org.apache.ibatis.annotations.Mapper;
import myproject.common.utils.BaseDao;
import myproject.entity.SystemintroEntity;

/**
 * 关于我们
 */
@Mapper
public interface SystemintroDao extends BaseDao<SystemintroEntity> {

}