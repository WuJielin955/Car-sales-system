package myproject.service;

import myproject.common.page.PageResult;
import myproject.common.utils.BaseService;
import myproject.vo.QicheVO;
import myproject.query.QicheQuery;
import myproject.entity.QicheEntity;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import java.util.List;
import java.util.Map;
/**
* 汽车
*
*/
public interface QicheService extends BaseService<QicheEntity> {

    PageResult<QicheVO> page(QicheQuery query);

    List<QicheVO> queryList(QicheQuery query);

    void save(QicheVO vo);

    void update(QicheVO vo);

    void delete(List<Long> idList);

    void export(QicheQuery query);
                
    List<Map<String, Object>> selectValue(Map<String, Object> params, LambdaQueryWrapper<QicheEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, LambdaQueryWrapper<QicheEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params, LambdaQueryWrapper<QicheEntity> wrapper);

    List<QicheVO> userCFRecommend(Long id);
}