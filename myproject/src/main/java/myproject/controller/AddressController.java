package myproject.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import myproject.common.page.PageResult;
import myproject.common.utils.Result;
import myproject.convert.AddressConvert;
import myproject.entity.AddressEntity;
import myproject.service.AddressService;
import myproject.query.AddressQuery;
import myproject.vo.AddressVO;
import org.springframework.web.bind.annotation.*;
import myproject.common.request.RequestSingleParam;

import javax.validation.Valid;
import java.util.List;

/**
* 地址
*
*/
@RestController
@RequestMapping("address")
@Tag(name="地址")
@AllArgsConstructor
public class AddressController {
private final AddressService addressService;

    @PostMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<AddressVO>> page(@RequestBody @Valid AddressQuery query){
        PageResult<AddressVO> page = addressService.page(query);
        return Result.ok(page);
    }
    @PostMapping("list")
    @Operation(summary = "列表")
    public Result<List<AddressVO>> list(@RequestBody @Valid AddressQuery query){
        List<AddressVO> list = addressService.queryList(query);
        return Result.ok(list);
    }
    @PostMapping("/info")
    @Operation(summary = "信息")
    public Result<AddressVO> get(@RequestSingleParam(value = "id") Long id){
        AddressEntity entity = addressService.getById(id);
        return Result.ok(AddressConvert.INSTANCE.convert(entity));
    }

    @PostMapping("save")
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody AddressVO vo){
        addressService.save(vo);
        return Result.ok();
    }

    @PostMapping("update")
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid AddressVO vo){
        addressService.update(vo);
        return Result.ok();
    }

    @PostMapping("delete")
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList){
            addressService.delete(idList);
            return Result.ok();
    }

    @PostMapping("export")
    @Operation(summary = "导出")
    public void export(@RequestBody @Valid AddressQuery query) {
        addressService.export(query);
    }
}