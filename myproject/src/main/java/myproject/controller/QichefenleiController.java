package myproject.controller;

import cn.dev33.satoken.annotation.SaIgnore;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import myproject.common.page.PageResult;
import myproject.common.utils.Result;
import myproject.convert.QichefenleiConvert;
import myproject.entity.QichefenleiEntity;
import myproject.service.QichefenleiService;
import myproject.query.QichefenleiQuery;
import myproject.vo.QichefenleiVO;
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
* 汽车分类
*
*/
@RestController
@RequestMapping("qichefenlei")
@Tag(name="汽车分类")
@AllArgsConstructor
public class QichefenleiController {
private final QichefenleiService qichefenleiService;

    @PostMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<QichefenleiVO>> page(@RequestBody @Valid QichefenleiQuery query){
        PageResult<QichefenleiVO> page = qichefenleiService.page(query);
        return Result.ok(page);
    }
    @PostMapping("list")
    @Operation(summary = "列表")
    @SaIgnore
    public Result<List<QichefenleiVO>> list(@RequestBody @Valid QichefenleiQuery query){
        List<QichefenleiVO> list = qichefenleiService.queryList(query);
        return Result.ok(list);
    }
    @PostMapping("/info")
    @Operation(summary = "信息")
    public Result<QichefenleiVO> get(@RequestSingleParam(value = "id") Long id){
        QichefenleiEntity entity = qichefenleiService.getById(id);
        return Result.ok(QichefenleiConvert.INSTANCE.convert(entity));
    }

    @PostMapping("save")
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody QichefenleiVO vo){
        qichefenleiService.save(vo);
        return Result.ok();
    }

    @PostMapping("update")
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid QichefenleiVO vo){
        qichefenleiService.update(vo);
        return Result.ok();
    }

    @PostMapping("delete")
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList){
            qichefenleiService.delete(idList);
            return Result.ok();
    }

    @PostMapping("export")
    @Operation(summary = "导出")
    public void export(@RequestBody @Valid QichefenleiQuery query) {
        qichefenleiService.export(query);
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
    LambdaQueryWrapper<QichefenleiEntity> wrapper = Wrappers.lambdaQuery();
    List<Map<String, Object>> result = qichefenleiService.selectValue(params, wrapper);
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
    LambdaQueryWrapper<QichefenleiEntity> wrapper = Wrappers.lambdaQuery();
        List<Map<String, Object>> result = qichefenleiService.selectTimeStatValue(params, wrapper);
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
    LambdaQueryWrapper<QichefenleiEntity> wrapper = Wrappers.lambdaQuery();
        //		wrapper.orderByDesc(QichefenleiEntity::getCount);
        List<Map<String, Object>> result = qichefenleiService.selectGroup(params, wrapper);
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