package myproject.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import myproject.common.page.PageResult;
import myproject.common.impl.BaseServiceImpl;
import myproject.common.recommend.RecommendService;
import myproject.convert.QicheConvert;
import myproject.entity.QicheEntity;
import myproject.query.QicheQuery;
import myproject.vo.QicheVO;
import myproject.dao.QicheDao;
import myproject.service.QicheService;
import myproject.common.utils.DateUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import myproject.common.utils.ExcelUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
* 汽车
*
*/
@Service
@AllArgsConstructor
public class QicheServiceImpl extends BaseServiceImpl<QicheDao, QicheEntity> implements QicheService {
    private final RecommendService recommendService;
    @Override
    public PageResult<QicheVO> page(QicheQuery query) {
        IPage<QicheEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));
        return new PageResult<>(QicheConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
    }

    @Override
    public List<QicheVO> queryList(QicheQuery query) {
        return QicheConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
    }

    private LambdaQueryWrapper<QicheEntity> getWrapper(QicheQuery query){
        LambdaQueryWrapper<QicheEntity> wrapper = Wrappers.lambdaQuery();
                    wrapper.eq(null!=query.getId(), QicheEntity::getId, query.getId());
                    wrapper.eq(StringUtils.isNotEmpty(query.getName()), QicheEntity::getName, query.getName());
                    wrapper.eq(StringUtils.isNotEmpty(query.getModel()), QicheEntity::getModel, query.getModel());
                    wrapper.eq(StringUtils.isNotEmpty(query.getYear()), QicheEntity::getYear, query.getYear());
                    wrapper.eq(null!=query.getPrice(), QicheEntity::getPrice, query.getPrice());
                    wrapper.eq(StringUtils.isNotEmpty(query.getYinqin()), QicheEntity::getYinqin, query.getYinqin());
                    wrapper.eq(StringUtils.isNotEmpty(query.getBianshuqi()), QicheEntity::getBianshuqi, query.getBianshuqi());
                    wrapper.eq(StringUtils.isNotEmpty(query.getLichengshu()), QicheEntity::getLichengshu, query.getLichengshu());
                    wrapper.eq(StringUtils.isNotEmpty(query.getColor()), QicheEntity::getColor, query.getColor());
                    wrapper.eq(StringUtils.isNotEmpty(query.getCheshen()), QicheEntity::getCheshen, query.getCheshen());
                    wrapper.eq(null!=query.getNum(), QicheEntity::getNum, query.getNum());
                    wrapper.eq(StringUtils.isNotEmpty(query.getDetails()), QicheEntity::getDetails, query.getDetails());
                    wrapper.eq(StringUtils.isNotEmpty(query.getPhoto()), QicheEntity::getPhoto, query.getPhoto());
                    wrapper.eq(StringUtils.isNotEmpty(query.getClassify()), QicheEntity::getClassify, query.getClassify());
                    wrapper.eq(null!=query.getUserid(), QicheEntity::getUserid, query.getUserid());
                    wrapper.eq(StringUtils.isNotEmpty(query.getUsername()), QicheEntity::getUsername, query.getUsername());
                    wrapper.eq(StringUtils.isNotEmpty(query.getPhotos()), QicheEntity::getPhotos, query.getPhotos());
                    wrapper.eq(null!=query.getClicknum(), QicheEntity::getClicknum, query.getClicknum());
                    wrapper.eq(StringUtils.isNotEmpty(query.getNumber()), QicheEntity::getNumber, query.getNumber());
                    wrapper.between(ArrayUtils.isNotEmpty(query.getAddtime()), QicheEntity::getAddtime, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[0] : null, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[1] : null);
            return wrapper;
    }

    @Override
    public void save(QicheVO vo) {
        QicheEntity entity = QicheConvert.INSTANCE.convert(vo);
        baseMapper.insert(entity);
    }

    @Override
    public void update(QicheVO vo) {
        QicheEntity entity = QicheConvert.INSTANCE.convert(vo);
        updateById(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> idList) {
        removeByIds(idList);
    }

    @Override
    @SneakyThrows
    public void export(QicheQuery query) {
        List<QicheVO> list = QicheConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
        // 写到浏览器打开
        ExcelUtils.excelExport(QicheVO.class, "汽车" + DateUtils.format(new Date()), null, list);
    }
    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, LambdaQueryWrapper<QicheEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, LambdaQueryWrapper<QicheEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, LambdaQueryWrapper<QicheEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

    /**
     * @title: userCFRecommend
     * @Description //根据用户行为推荐--基于用户行为
     * @Param [userId]
     **/
    @Override
    public List<QicheVO> userCFRecommend(Long userId) {
        LambdaQueryWrapper<QicheEntity> wrapper = Wrappers.lambdaQuery();
        wrapper.orderByDesc(QicheEntity::getClicknum);
        List<Long> uIds = baseMapper.selectList(wrapper).stream().map(QicheEntity::getId).collect(Collectors.toList());
        List<Long> ids = recommendService.UserCFRecommend(userId, uIds);
        List<QicheEntity> query = baseMapper.selectBatchIds(ids);
        return QicheConvert.INSTANCE.convertList(query);
    }
}