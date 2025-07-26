package myproject.service;

import myproject.common.page.PageResult;
import myproject.common.utils.BaseService;
import myproject.vo.QichefenleiVO;
import myproject.query.QichefenleiQuery;
import myproject.entity.QichefenleiEntity;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import java.util.List;
import java.util.Map;
/**
* 汽车分类
*
*/
public interface QichefenleiService extends BaseService<QichefenleiEntity> {

    PageResult<QichefenleiVO> page(QichefenleiQuery query);

    List<QichefenleiVO> queryList(QichefenleiQuery query);

    void save(QichefenleiVO vo);

    void update(QichefenleiVO vo);

    void delete(List<Long> idList);

    void export(QichefenleiQuery query);
                
    List<Map<String, Object>> selectValue(Map<String, Object> params, LambdaQueryWrapper<QichefenleiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, LambdaQueryWrapper<QichefenleiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params, LambdaQueryWrapper<QichefenleiEntity> wrapper);
}