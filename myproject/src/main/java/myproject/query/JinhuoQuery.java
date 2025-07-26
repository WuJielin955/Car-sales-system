package myproject.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import myproject.common.query.Query;
import org.springframework.format.annotation.DateTimeFormat;

    import java.util.Date;

/**
* 进货查询
*
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "进货查询")
public class JinhuoQuery extends Query {
    @Schema(description = "主键")
    private Long id;

    @Schema(description = "汽车的名字")
    private String name;

    @Schema(description = "汽车类型")
    private String type;

    @Schema(description = "汽车的型号")
    private String model;

    @Schema(description = "生产年份")
    private String year;

    @Schema(description = "进货价格")
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

    @Schema(description = "进货量")
    private Integer num;

    @Schema(description = "车辆的详细描述")
    private String details;

    @Schema(description = "车辆图片")
    private String photo;

    @Schema(description = "创建人的id")
    private Long userid;

    @Schema(description = "创建人的名字")
    private String username;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date[] addtime;

}