package myproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import myproject.common.impl.BaseServiceImpl;
import myproject.common.page.PageResult;
import myproject.common.utils.DateUtils;
import myproject.common.utils.ExcelUtils;
import myproject.convert.ImageContentConvert;
import myproject.dao.ImageContentDao;
import myproject.entity.ImageContentEntity;
import myproject.query.ImageContentQuery;
import myproject.service.ImageContentService;
import myproject.vo.ImageContentVO;

import java.util.Date;
import java.util.List;

/**
 *
 */
@Service
@AllArgsConstructor
public class ImageContentServiceImpl extends BaseServiceImpl<ImageContentDao, ImageContentEntity> implements ImageContentService {

	@Override
	public PageResult<ImageContentVO> page(ImageContentQuery query) {
		IPage<ImageContentEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));
		return new PageResult<>(ImageContentConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
	}

	@Override
	public List<ImageContentVO> queryList(ImageContentQuery query) {
		return ImageContentConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
	}

	private LambdaQueryWrapper<ImageContentEntity> getWrapper(ImageContentQuery query) {
		LambdaQueryWrapper<ImageContentEntity> wrapper = Wrappers.lambdaQuery();
		wrapper.eq(null != query.getId(), ImageContentEntity::getId, query.getId());
		wrapper.eq(StringUtils.isNotEmpty(query.getPath()), ImageContentEntity::getPath, query.getPath());
		wrapper.eq(null != query.getFileId(), ImageContentEntity::getFileId, query.getFileId());
		wrapper.between(ArrayUtils.isNotEmpty(query.getCreateTime()), ImageContentEntity::getCreateTime, ArrayUtils.isNotEmpty(query.getCreateTime()) ? query.getCreateTime()[0] : null, ArrayUtils.isNotEmpty(query.getCreateTime()) ? query.getCreateTime()[1] : null);
		wrapper.between(ArrayUtils.isNotEmpty(query.getUpdateTime()), ImageContentEntity::getUpdateTime, ArrayUtils.isNotEmpty(query.getUpdateTime()) ? query.getUpdateTime()[0] : null, ArrayUtils.isNotEmpty(query.getUpdateTime()) ? query.getUpdateTime()[1] : null);
		return wrapper;
	}

	@Override
	public void save(ImageContentVO vo) {
		ImageContentEntity entity = ImageContentConvert.INSTANCE.convert(vo);
		baseMapper.insert(entity);
	}

	@Override
	public void update(ImageContentVO vo) {
		ImageContentEntity entity = ImageContentConvert.INSTANCE.convert(vo);
		updateById(entity);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delete(List<Long> idList) {
		removeByIds(idList);
	}

	@Override
	@SneakyThrows
	public void export(ImageContentQuery query) {
		List<ImageContentVO> list = ImageContentConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
		// 写到浏览器打开
		ExcelUtils.excelExport(ImageContentVO.class, DateUtils.format(new Date()), null, list);
	}
}