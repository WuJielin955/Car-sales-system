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
import myproject.convert.TextContentConvert;
import myproject.dao.TextContentDao;
import myproject.entity.TextContentEntity;
import myproject.query.TextContentQuery;
import myproject.service.TextContentService;
import myproject.vo.TextContentVO;

import java.util.Date;
import java.util.List;

/**
 *
 */
@Service
@AllArgsConstructor
public class TextContentServiceImpl extends BaseServiceImpl<TextContentDao, TextContentEntity> implements TextContentService {

	@Override
	public PageResult<TextContentVO> page(TextContentQuery query) {
		IPage<TextContentEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));
		return new PageResult<>(TextContentConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
	}

	@Override
	public List<TextContentVO> queryList(TextContentQuery query) {
		return TextContentConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
	}

	private LambdaQueryWrapper<TextContentEntity> getWrapper(TextContentQuery query) {
		LambdaQueryWrapper<TextContentEntity> wrapper = Wrappers.lambdaQuery();
		wrapper.eq(null != query.getId(), TextContentEntity::getId, query.getId());
		wrapper.eq(StringUtils.isNotEmpty(query.getContent()), TextContentEntity::getContent, query.getContent());
		wrapper.between(ArrayUtils.isNotEmpty(query.getCreateTime()), TextContentEntity::getCreateTime, ArrayUtils.isNotEmpty(query.getCreateTime()) ? query.getCreateTime()[0] : null, ArrayUtils.isNotEmpty(query.getCreateTime()) ? query.getCreateTime()[1] : null);
		wrapper.between(ArrayUtils.isNotEmpty(query.getUpdateTime()), TextContentEntity::getUpdateTime, ArrayUtils.isNotEmpty(query.getUpdateTime()) ? query.getUpdateTime()[0] : null, ArrayUtils.isNotEmpty(query.getUpdateTime()) ? query.getUpdateTime()[1] : null);
		return wrapper;
	}

	@Override
	public void save(TextContentVO vo) {
		TextContentEntity entity = TextContentConvert.INSTANCE.convert(vo);
		baseMapper.insert(entity);
	}

	@Override
	public void update(TextContentVO vo) {
		TextContentEntity entity = TextContentConvert.INSTANCE.convert(vo);
		updateById(entity);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delete(List<Long> idList) {
		removeByIds(idList);
	}

	@Override
	@SneakyThrows
	public void export(TextContentQuery query) {
		List<TextContentVO> list = TextContentConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
		// 写到浏览器打开
		ExcelUtils.excelExport(TextContentVO.class, DateUtils.format(new Date()), null, list);
	}
}