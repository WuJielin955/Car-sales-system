package myproject.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import myproject.common.utils.DateUtils;
    import java.util.Date;

/**
* 地址
*
*/
@Data
@Schema(description = "地址")
public class AddressVO implements Serializable {
private static final long serialVersionUID = 1L;

        @Schema(description = "主键")
    private Long id;

        @Schema(description = "创建时间")
        @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private Date addtime;

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