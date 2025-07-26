package myproject.controller;

import cn.dev33.satoken.annotation.SaIgnore;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import myproject.common.page.PageResult;
import myproject.common.utils.Result;
import myproject.convert.JinhuoConvert;
import myproject.entity.JinhuoEntity;
import myproject.service.JinhuoService;
import myproject.query.JinhuoQuery;
import myproject.vo.JinhuoVO;
import org.springframework.web.bind.annotation.*;
import myproject.common.request.RequestSingleParam;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
* 进货
*
*/
@RestController
@RequestMapping("jinhuo")
@Tag(name="进货")
@AllArgsConstructor
public class JinhuoController {
private final JinhuoService jinhuoService;

    @PostMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<JinhuoVO>> page(@RequestBody @Valid JinhuoQuery query){
        PageResult<JinhuoVO> page = jinhuoService.page(query);
        return Result.ok(page);
    }
    @PostMapping("list")
    @Operation(summary = "列表")
    @SaIgnore
    public Result<List<JinhuoVO>> list(@RequestBody @Valid JinhuoQuery query){
        List<JinhuoVO> list = jinhuoService.queryList(query);
        return Result.ok(list);
    }
    @PostMapping("/info")
    @Operation(summary = "信息")
    public Result<JinhuoVO> get(@RequestSingleParam(value = "id") Long id){
        JinhuoEntity entity = jinhuoService.getById(id);
        return Result.ok(JinhuoConvert.INSTANCE.convert(entity));
    }

    @PostMapping("save")
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody JinhuoVO vo){
        jinhuoService.save(vo);
        return Result.ok();
    }

    @PostMapping("update")
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid JinhuoVO vo){
        jinhuoService.update(vo);
        return Result.ok();
    }

    @PostMapping("delete")
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList){
            jinhuoService.delete(idList);
            return Result.ok();
    }

    @PostMapping("export")
    @Operation(summary = "导出")
    public void export(@RequestBody @Valid JinhuoQuery query) {
        jinhuoService.export(query);
    }
    /**
    * （按值统计）
    */
    @SaIgnore
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public Result value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, HttpServletRequest request) {
    Map<String, Object> params = new HashMap<>();
    params.put("xColumn", xColumnName);
    params.put("yColumn", yColumnName);
    LambdaQueryWrapper<JinhuoEntity> wrapper = Wrappers.lambdaQuery();
    List<Map<String, Object>> result = jinhuoService.selectValue(params, wrapper);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (Map<String, Object> m : result) {
        for (String k : m.keySet()) {
            if (m.get(k) instanceof Date) {
                m.put(k, sdf.format((Date) m.get(k)));
            }
        }
    }
    return Result.ok(result);
    }

    /**
    * （按值统计）时间统计类型
    */
    @SaIgnore
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public Result valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType, HttpServletRequest request) {
    Map<String, Object> params = new HashMap<>();
    params.put("xColumn", xColumnName);
    params.put("yColumn", yColumnName);
    params.put("timeStatType", timeStatType);
    LambdaQueryWrapper<JinhuoEntity> wrapper = Wrappers.lambdaQuery();
        List<Map<String, Object>> result = jinhuoService.selectTimeStatValue(params, wrapper);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Map<String, Object> m : result) {
            for (String k : m.keySet()) {
                if (m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date) m.get(k)));
                }
            }
        }
    return Result.ok(result);
    }

    /**
    * 分组统计
    */
    @SaIgnore
    @RequestMapping("/group/{columnName}")
    public Result group(@PathVariable("columnName") String columnName, HttpServletRequest request) {
    Map<String, Object> params = new HashMap<>();
    params.put("column", columnName);
    LambdaQueryWrapper<JinhuoEntity> wrapper = Wrappers.lambdaQuery();
        //		wrapper.orderByDesc(JinhuoEntity::getCount);
        List<Map<String, Object>> result = jinhuoService.selectGroup(params, wrapper);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Map<String, Object> m : result) {
            for (String k : m.keySet()) {
                if (m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date) m.get(k)));
                }
            }
        }
    return Result.ok(result);
    }
}