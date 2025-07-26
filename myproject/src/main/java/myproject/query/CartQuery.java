package myproject.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import myproject.common.query.Query;
import org.springframework.format.annotation.DateTimeFormat;

    import java.util.Date;

/**
* 购物车表查询
*
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "购物车表查询")
public class CartQuery extends Query {
    @Schema(description = "主键")
    private Long id;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date[] addtime;

    @Schema(description = "用户id")
    private Long userid;

    @Schema(description = "商品id")
    private Long goodid;

    @Schema(description = "商品名称")
    private String goodname;

    @Schema(description = "图片")
    private String picture;

    @Schema(description = "购买数量")
    private Integer buynumber;

    @Schema(description = "单价")
    private Float price;

    @Schema(description = "会员价")
    private Float discountprice;

    @Schema(description = "商户名称")
    private String shangjiazhanghao;

    @Schema(description = "商品分类")
    private String fenlei;

    @Schema(description = "备注")
    private String remark;

}