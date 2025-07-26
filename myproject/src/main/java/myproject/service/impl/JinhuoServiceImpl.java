package myproject.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import myproject.common.page.PageResult;
import myproject.common.impl.BaseServiceImpl;
import myproject.convert.JinhuoConvert;
import myproject.entity.JinhuoEntity;
import myproject.query.JinhuoQuery;
import myproject.vo.JinhuoVO;
import myproject.dao.JinhuoDao;
import myproject.service.JinhuoService;
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
* 进货
*
*/
@Service
@AllArgsConstructor
public class JinhuoServiceImpl extends BaseServiceImpl<JinhuoDao, JinhuoEntity> implements JinhuoService {

    @Override
    public PageResult<JinhuoVO> page(JinhuoQuery query) {
        IPage<JinhuoEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));
        return new PageResult<>(JinhuoConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    @Override
    public List<JinhuoVO> queryList(JinhuoQuery query) {
        return JinhuoConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
    }

    private LambdaQueryWrapper<JinhuoEntity> getWrapper(JinhuoQuery query){
        LambdaQueryWrapper<JinhuoEntity> wrapper = Wrappers.lambdaQuery();
                    wrapper.eq(null!=query.getId(), JinhuoEntity::getId, query.getId());
                    wrapper.eq(StringUtils.isNotEmpty(query.getName()), JinhuoEntity::getName, query.getName());
                    wrapper.eq(StringUtils.isNotEmpty(query.getType()), JinhuoEntity::getType, query.getType());
                    wrapper.eq(StringUtils.isNotEmpty(query.getModel()), JinhuoEntity::getModel, query.getModel());
                    wrapper.eq(StringUtils.isNotEmpty(query.getYear()), JinhuoEntity::getYear, query.getYear());
                    wrapper.eq(null!=query.getPrice(), JinhuoEntity::getPrice, query.getPrice());
                    wrapper.eq(StringUtils.isNotEmpty(query.getYinqin()), JinhuoEntity::getYinqin, query.getYinqin());
                    wrapper.eq(StringUtils.isNotEmpty(query.getBianshuqi()), JinhuoEntity::getBianshuqi, query.getBianshuqi());
                    wrapper.eq(StringUtils.isNotEmpty(query.getLichengshu()), JinhuoEntity::getLichengshu, query.getLichengshu());
                    wrapper.eq(StringUtils.isNotEmpty(query.getColor()), JinhuoEntity::getColor, query.getColor());
                    wrapper.eq(StringUtils.isNotEmpty(query.getCheshen()), JinhuoEntity::getCheshen, query.getCheshen());
                    wrapper.eq(null!=query.getNum(), JinhuoEntity::getNum, query.getNum());
                    wrapper.eq(StringUtils.isNotEmpty(query.getDetails()), JinhuoEntity::getDetails, query.getDetails());
                    wrapper.eq(StringUtils.isNotEmpty(query.getPhoto()), JinhuoEntity::getPhoto, query.getPhoto());
                    wrapper.eq(null!=query.getUserid(), JinhuoEntity::getUserid, query.getUserid());
                    wrapper.eq(StringUtils.isNotEmpty(query.getUsername()), JinhuoEntity::getUsername, query.getUsername());
                    wrapper.between(ArrayUtils.isNotEmpty(query.getAddtime()), JinhuoEntity::getAddtime, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[0] : null, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[1] : null);
            return wrapper;
    }

    @Override
    public void save(JinhuoVO vo) {
        JinhuoEntity entity = JinhuoConvert.INSTANCE.convert(vo);
        baseMapper.insert(entity);
    }

    @Override
    public void update(JinhuoVO vo) {
        JinhuoEntity entity = JinhuoConvert.INSTANCE.convert(vo);
        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

    @Override
    @SneakyThrows
    public void export(JinhuoQuery query) {
        List<JinhuoVO> list = JinhuoConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
        // 写到浏览器打开
        ExcelUtils.excelExport(JinhuoVO.class, "进货" + DateUtils.format(new Date()), null, list);
    }
    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, LambdaQueryWrapper<JinhuoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, LambdaQueryWrapper<JinhuoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, LambdaQueryWrapper<JinhuoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }
}