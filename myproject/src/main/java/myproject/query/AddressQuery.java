package myproject.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import myproject.common.query.Query;
import org.springframework.format.annotation.DateTimeFormat;

    import java.util.Date;

/**
* 地址查询
*
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "地址查询")
public class AddressQuery extends Query {
    @Schema(description = "主键")
    private Long id;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date[] addtime;

    @Schema(description = "用户id")
    private Long userid;

    @Schema(description = "地址")
    private String address;

    @Schema(description = "收货人")
    private String name;

    @Schema(description = "电话")
    private String phone;

    @Schema(description = "是否默认地址[是/否]")
    private String isdefault;

}