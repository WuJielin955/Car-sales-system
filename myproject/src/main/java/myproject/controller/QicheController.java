package myproject.controller;

import cn.dev33.satoken.annotation.SaIgnore;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import myproject.common.page.PageResult;
import myproject.common.utils.GloabUtils;
import myproject.common.utils.Result;
import myproject.convert.QicheConvert;
import myproject.entity.QicheEntity;
import myproject.service.QicheService;
import myproject.query.QicheQuery;
import myproject.service.StoreupService;
import myproject.vo.QicheVO;
import myproject.vo.StoreupVO;
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
* 汽车
*
*/
@RestController
@RequestMapping("qiche")
@Tag(name="汽车")
@AllArgsConstructor
public class QicheController {
private final QicheService qicheService;
    private final StoreupService storeupService;
    @PostMapping("page")
    @Operation(summary = "分页")
    public Result<PageResult<QicheVO>> page(@RequestBody @Valid QicheQuery query){
        PageResult<QicheVO> page = qicheService.page(query);
        return Result.ok(page);
    }
    @PostMapping("list")
    @Operation(summary = "列表")
    @SaIgnore
    public Result<List<QicheVO>> list(@RequestBody @Valid QicheQuery query){
        List<QicheVO> list = qicheService.queryList(query);
        return Result.ok(list);
    }
    @PostMapping("/info")
    @Operation(summary = "信息")
    public Result<QicheVO> get(@RequestSingleParam(value = "id") Long id){
        QicheEntity entity = qicheService.getById(id);
        entity.setClicknum(null == entity.getClicknum() ? 1 : entity.getClicknum() + 1);
        qicheService.updateById(entity);
        StoreupVO storeupVO = new StoreupVO();
        storeupVO.setUserid(GloabUtils.getUserId());
        storeupVO.setRefid(id);
        storeupVO.setType(1);
        storeupService.save(storeupVO);
        return Result.ok(QicheConvert.INSTANCE.convert(entity));
    }

    @PostMapping("/userCFRecommend")
    @Operation(summary = "根据用户推荐")
    public Result<List<QicheVO>> userCFRecommend(@RequestSingleParam(value = "id") Long id) {
        return Result.ok(qicheService.userCFRecommend(id));
    }

    @PostMapping("save")
    @Operation(summary = "保存")
    public Result<String> save(@RequestBody QicheVO vo){
        vo.setClicknum(0);
        qicheService.save(vo);
        return Result.ok();
    }

    @PostMapping("update")
    @Operation(summary = "修改")
    public Result<String> update(@RequestBody @Valid QicheVO vo){
        qicheService.update(vo);
        return Result.ok();
    }

    @PostMapping("delete")
    @Operation(summary = "删除")
    public Result<String> delete(@RequestBody List<Long> idList){
            qicheService.delete(idList);
            return Result.ok();
    }

    @PostMapping("export")
    @Operation(summary = "导出")
    public void export(@RequestBody @Valid QicheQuery query) {
        qicheService.export(query);
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
    LambdaQueryWrapper<QicheEntity> wrapper = Wrappers.lambdaQuery();
    List<Map<String, Object>> result = qicheService.selectValue(params, wrapper);
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
    LambdaQueryWrapper<QicheEntity> wrapper = Wrappers.lambdaQuery();
        List<Map<String, Object>> result = qicheService.selectTimeStatValue(params, wrapper);
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
    LambdaQueryWrapper<QicheEntity> wrapper = Wrappers.lambdaQuery();
        //		wrapper.orderByDesc(QicheEntity::getCount);
        List<Map<String, Object>> result = qicheService.selectGroup(params, wrapper);
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