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
* 汽车分类
*
*/
@Data
@Schema(description = "汽车分类")
public class QichefenleiVO implements Serializable {
private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    @ExcelIgnore
    private Long id;

    @Schema(description = "汽车分类的名字")
    @ExcelProperty("汽车分类的名字")
    private String name;

    @Schema(description = "汽车分类的图片")
    @ExcelProperty("汽车分类的图片")
    private String photo;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    @ExcelProperty("创建时间")
    private Date addtime;


}