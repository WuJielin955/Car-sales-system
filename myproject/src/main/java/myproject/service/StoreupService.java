package myproject.service;

import myproject.common.page.PageResult;
import myproject.common.utils.BaseService;
import myproject.vo.StoreupVO;
import myproject.query.StoreupQuery;
import myproject.entity.StoreupEntity;

import java.util.List;

/**
* 收藏表
*
*/
public interface StoreupService extends BaseService<StoreupEntity> {

    PageResult<StoreupVO> page(StoreupQuery query);

    List<StoreupVO> queryList(StoreupQuery query);

    void save(StoreupVO vo);

    void update(StoreupVO vo);

    void delete(List<Long> idList);

    void export(StoreupQuery query);
}