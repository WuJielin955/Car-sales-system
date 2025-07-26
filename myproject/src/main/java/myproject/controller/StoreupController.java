package myproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import myproject.common.page.PageResult;
import myproject.common.request.RequestSingleParam;
import myproject.common.utils.GloabUtils;
import myproject.common.utils.Result;
import myproject.convert.StoreupConvert;
import myproject.entity.StoreupEntity;
import myproject.query.StoreupQuery;
import myproject.service.StoreupService;
import myproject.vo.StoreupVO;

import javax.validation.Valid;
import java.util.List;

/**
 * 收藏表
 */
@RestController
@RequestMapping("storeup")
@Tag(name = "收藏表")
@AllArgsConstructor
public class StoreupController {
	private final StoreupService storeupService;

	@PostMapping("page")
	@Operation(summary = "分页")
	public Result<PageResult<StoreupVO>> page(@RequestBody @Valid StoreupQuery query) {
		PageResult<StoreupVO> page = storeupService.page(query);
		return Result.ok(page);
	}

	@PostMapping("list")
	@Operation(summary = "列表")
	public Result<List<StoreupVO>> list(@RequestBody @Valid StoreupQuery query) {
		List<StoreupVO> list = storeupService.queryList(query);
		return Result.ok(list);
	}

	@PostMapping("/info")
	@Operation(summary = "信息")
	public Result<StoreupVO> get(@RequestSingleParam(value = "id") Long id) {
		StoreupEntity entity = storeupService.getById(id);
		return Result.ok(StoreupConvert.INSTANCE.convert(entity));
	}

	@PostMapping("save")
	@Operation(summary = "保存")
	public Result<String> save(@RequestBody StoreupVO vo) {
		vo.setUserid(GloabUtils.getUserId());
		storeupService.save(vo);
		return Result.ok();
	}

	@PostMapping("update")
	@Operation(summary = "修改")
	public Result<String> update(@RequestBody @Valid StoreupVO vo) {
		storeupService.update(vo);
		return Result.ok();
	}

	@PostMapping("delete")
	@Operation(summary = "删除")
	public Result<String> delete(@RequestBody List<Long> idList) {
		storeupService.delete(idList);
		return Result.ok();
	}

	@PostMapping("export")
	@Operation(summary = "导出")
	public void export(@RequestBody @Valid StoreupQuery query) {
		storeupService.export(query);
	}
}