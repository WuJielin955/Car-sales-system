package myproject.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import myproject.common.query.Query;
import org.springframework.format.annotation.DateTimeFormat;

    import java.util.Date;

/**
* 汽车查询
*
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "汽车查询")
public class QicheQuery extends Query {
    @Schema(description = "主键")
    private Long id;

    @Schema(description = "汽车的名字")
    private String name;

    @Schema(description = "汽车的型号")
    private String model;

    @Schema(description = "生产年份")
    private String year;

    @Schema(description = "销售价格")
    private Float price;

    @Schema(description = "引擎类型")
    private String yinqin;

    @Schema(description = "变数器类型（手动/自动）")
    private String bianshuqi;

    @Schema(description = "里程数")
    private String lichengshu;

    @Schema(description = "颜色")
    private String color;

    @Schema(description = "车身类型(轿车/SUV/卡车)")
    private String cheshen;

    @Schema(description = "库存")
    private Integer num;

    @Schema(description = "车辆的详细描述")
    private String details;

    @Schema(description = "车辆图片")
    private String photo;

    @Schema(description = "车辆的分类")
    private String classify;

    @Schema(description = "创建人的id")
    private Long userid;

    @Schema(description = "创建人的名字")
    private String username;

    @Schema(description = "轮播图")
    private String photos;

    @Schema(description = "浏览量")
    private Integer clicknum;

    @Schema(description = "库存编号")
    private String number;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date[] addtime;

}