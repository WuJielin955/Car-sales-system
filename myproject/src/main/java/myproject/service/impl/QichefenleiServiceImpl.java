package myproject.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import myproject.common.page.PageResult;
import myproject.common.impl.BaseServiceImpl;
import myproject.convert.QichefenleiConvert;
import myproject.entity.QichefenleiEntity;
import myproject.query.QichefenleiQuery;
import myproject.vo.QichefenleiVO;
import myproject.dao.QichefenleiDao;
import myproject.service.QichefenleiService;
import myproject.common.utils.DateUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import myproject.common.utils.ExcelUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;
/**
* 汽车分类
*
*/
@Service
@AllArgsConstructor
public class QichefenleiServiceImpl extends BaseServiceImpl<QichefenleiDao, QichefenleiEntity> implements QichefenleiService {

    @Override
    public PageResult<QichefenleiVO> page(QichefenleiQuery query) {
        IPage<QichefenleiEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));
        return new PageResult<>(QichefenleiConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    @Override
    public List<QichefenleiVO> queryList(QichefenleiQuery query) {
        return QichefenleiConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
    }

    private LambdaQueryWrapper<QichefenleiEntity> getWrapper(QichefenleiQuery query){
        LambdaQueryWrapper<QichefenleiEntity> wrapper = Wrappers.lambdaQuery();
                    wrapper.eq(null!=query.getId(), QichefenleiEntity::getId, query.getId());
                    wrapper.eq(StringUtils.isNotEmpty(query.getName()), QichefenleiEntity::getName, query.getName());
                    wrapper.eq(StringUtils.isNotEmpty(query.getPhoto()), QichefenleiEntity::getPhoto, query.getPhoto());
                    wrapper.between(ArrayUtils.isNotEmpty(query.getAddtime()), QichefenleiEntity::getAddtime, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[0] : null, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[1] : null);
            return wrapper;
    }

    @Override
    public void save(QichefenleiVO vo) {
        QichefenleiEntity entity = QichefenleiConvert.INSTANCE.convert(vo);
        baseMapper.insert(entity);
    }

    @Override
    public void update(QichefenleiVO vo) {
        QichefenleiEntity entity = QichefenleiConvert.INSTANCE.convert(vo);
        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

    @Override
    @SneakyThrows
    public void export(QichefenleiQuery query) {
        List<QichefenleiVO> list = QichefenleiConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
        // 写到浏览器打开
        ExcelUtils.excelExport(QichefenleiVO.class, "汽车分类" + DateUtils.format(new Date()), null, list);
    }
    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, LambdaQueryWrapper<QichefenleiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, LambdaQueryWrapper<QichefenleiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, LambdaQueryWrapper<QichefenleiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }
}