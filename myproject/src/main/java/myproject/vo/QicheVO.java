package myproject.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import myproject.common.utils.DateUtils;
    import java.util.Date;

/**
* 汽车
*
*/
@Data
@Schema(description = "汽车")
public class QicheVO implements Serializable {
private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    @ExcelIgnore
    private Long id;

    @Schema(description = "汽车的名字")
    @ExcelProperty("汽车的名字")
    private String name;

    @Schema(description = "汽车的型号")
    @ExcelProperty("汽车的型号")
    private String model;

    @Schema(description = "生产年份")
    @ExcelProperty("生产年份")
    private String year;

    @Schema(description = "销售价格")
    @ExcelProperty("销售价格")
    private Float price;

    @Schema(description = "引擎类型")
    @ExcelProperty("引擎类型")
    private String yinqin;

    @Schema(description = "变数器类型（手动/自动）")
    @ExcelProperty("变数器类型（手动/自动）")
    private String bianshuqi;

    @Schema(description = "里程数")
    @ExcelProperty("里程数")
    private String lichengshu;

    @Schema(description = "颜色")
    @ExcelProperty("颜色")
    private String color;

    @Schema(description = "车身类型(轿车/SUV/卡车)")
    @ExcelProperty("车身类型(轿车/SUV/卡车)")
    private String cheshen;

    @Schema(description = "库存")
    @ExcelProperty("库存")
    private Integer num;

    @Schema(description = "车辆的详细描述")
    @ExcelProperty("车辆的详细描述")
    private String details;

    @Schema(description = "车辆图片")
    @ExcelProperty("车辆图片")
    private String photo;

    @Schema(description = "车辆的分类")
    @ExcelProperty("车辆的分类")
    private String classify;

    @Schema(description = "创建人的id")
    @ExcelProperty("创建人的id")
    private Long userid;

    @Schema(description = "创建人的名字")
    @ExcelProperty("创建人的名字")
    private String username;

    @Schema(description = "轮播图")
    @ExcelProperty("轮播图")
    private String photos;

    @Schema(description = "浏览量")
    @ExcelProperty("浏览量")
    private Integer clicknum;

    @Schema(description = "库存编号")
    @ExcelProperty("库存编号")
    private String number;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    @ExcelProperty("创建时间")
    private Date addtime;


}