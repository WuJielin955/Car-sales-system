package myproject.service;

import myproject.common.page.PageResult;
import myproject.common.utils.BaseService;
import myproject.vo.AddressVO;
import myproject.query.AddressQuery;
import myproject.entity.AddressEntity;

import java.util.List;

/**
* 地址
*
*/
public interface AddressService extends BaseService<AddressEntity> {

    PageResult<AddressVO> page(AddressQuery query);

    List<AddressVO> queryList(AddressQuery query);

    void save(AddressVO vo);

    void update(AddressVO vo);

    void delete(List<Long> idList);

    void export(AddressQuery query);
}