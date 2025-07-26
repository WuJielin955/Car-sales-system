package myproject.service;

import myproject.common.page.PageResult;
import myproject.common.utils.BaseService;
import myproject.vo.JinhuoVO;
import myproject.query.JinhuoQuery;
import myproject.entity.JinhuoEntity;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import java.util.List;
import java.util.Map;
/**
* 进货
*
*/
public interface JinhuoService extends BaseService<JinhuoEntity> {

    PageResult<JinhuoVO> page(JinhuoQuery query);

    List<JinhuoVO> queryList(JinhuoQuery query);

    void save(JinhuoVO vo);

    void update(JinhuoVO vo);

    void delete(List<Long> idList);

    void export(JinhuoQuery query);
                
    List<Map<String, Object>> selectValue(Map<String, Object> params, LambdaQueryWrapper<JinhuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, LambdaQueryWrapper<JinhuoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params, LambdaQueryWrapper<JinhuoEntity> wrapper);
}