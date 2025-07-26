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
import myproject.common.utils.GloabUtils;
import myproject.convert.AddressConvert;
import myproject.dao.AddressDao;
import myproject.entity.AddressEntity;
import myproject.query.AddressQuery;
import myproject.service.AddressService;
import myproject.vo.AddressVO;

import java.util.Date;
import java.util.List;

/**
 * 地址
 */
@Service
@AllArgsConstructor
public class AddressServiceImpl extends BaseServiceImpl<AddressDao, AddressEntity> implements AddressService {

	@Override
	public PageResult<AddressVO> page(AddressQuery query) {
		IPage<AddressEntity> page = baseMapper.selectPage(getPage(query), getWrapper(query));
		return new PageResult<>(AddressConvert.INSTANCE.convertList(page.getRecords()), page.getTotal());
	}

	@Override
	public List<AddressVO> queryList(AddressQuery query) {
		return AddressConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
	}

	private LambdaQueryWrapper<AddressEntity> getWrapper(AddressQuery query) {
		LambdaQueryWrapper<AddressEntity> wrapper = Wrappers.lambdaQuery();
		wrapper.eq(null != query.getId(), AddressEntity::getId, query.getId());
		wrapper.between(ArrayUtils.isNotEmpty(query.getAddtime()), AddressEntity::getAddtime, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[0] : null, ArrayUtils.isNotEmpty(query.getAddtime()) ? query.getAddtime()[1] : null);
		wrapper.eq(null != query.getUserid(), AddressEntity::getUserid, query.getUserid());
		wrapper.eq(StringUtils.isNotEmpty(query.getAddress()), AddressEntity::getAddress, query.getAddress());
		wrapper.eq(StringUtils.isNotEmpty(query.getName()), AddressEntity::getName, query.getName());
		wrapper.eq(StringUtils.isNotEmpty(query.getPhone()), AddressEntity::getPhone, query.getPhone());
		wrapper.eq(StringUtils.isNotEmpty(query.getIsdefault()), AddressEntity::getIsdefault, query.getIsdefault());
		wrapper.orderByDesc(AddressEntity::getIsdefault);
		return wrapper;
	}

	@Override
	public void save(AddressVO vo) {
		AddressEntity entity = AddressConvert.INSTANCE.convert(vo);
		entity.setUserid(GloabUtils.getUserId());
		if ("是".equals(entity.getIsdefault())) {
			LambdaQueryWrapper<AddressEntity> wrapper = Wrappers.lambdaQuery();
			wrapper.eq(StringUtils.isNotEmpty(vo.getIsdefault()), AddressEntity::getIsdefault, "是");
			wrapper.eq(null != vo.getUserid(), AddressEntity::getUserid, GloabUtils.getUserId());
			AddressEntity addressEntity = new AddressEntity();
			addressEntity.setUserid(vo.getUserid());
			addressEntity.setIsdefault("否");
			baseMapper.update(addressEntity, wrapper);
		}
		baseMapper.insert(entity);
	}

	@Override
	public void update(AddressVO vo) {
		AddressEntity entity = AddressConvert.INSTANCE.convert(vo);
		entity.setUserid(GloabUtils.getUserId());
		//修改为默认收货地址，其他收货地址为默认否
		if ("是".equals(entity.getIsdefault())) {
			LambdaQueryWrapper<AddressEntity> wrapper = Wrappers.lambdaQuery();
			wrapper.eq(StringUtils.isNotEmpty(vo.getIsdefault()), AddressEntity::getIsdefault, "是");
			wrapper.eq(null != vo.getUserid(), AddressEntity::getUserid, GloabUtils.getUserId());
			AddressEntity addressEntity = new AddressEntity();
			addressEntity.setUserid(vo.getUserid());
			addressEntity.setIsdefault("否");
			baseMapper.update(addressEntity, wrapper);
		}
		updateById(entity);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delete(List<Long> idList) {
		removeByIds(idList);
	}

	@Override
	@SneakyThrows
	public void export(AddressQuery query) {
		List<AddressVO> list = AddressConvert.INSTANCE.convertList(baseMapper.selectList(getWrapper(query)));
		// 写到浏览器打开
		ExcelUtils.excelExport(AddressVO.class, "地址" + DateUtils.format(new Date()), null, list);
	}
}