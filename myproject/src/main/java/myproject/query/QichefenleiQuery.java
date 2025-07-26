package myproject.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import myproject.common.query.Query;
import org.springframework.format.annotation.DateTimeFormat;

    import java.util.Date;

/**
* 汽车分类查询
*
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "汽车分类查询")
public class QichefenleiQuery extends Query {
    @Schema(description = "主键")
    private Long id;

    @Schema(description = "汽车分类的名字")
    private String name;

    @Schema(description = "汽车分类的图片")
    private String photo;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date[] addtime;

}