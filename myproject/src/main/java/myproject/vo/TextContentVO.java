package myproject.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;

import myproject.common.utils.DateUtils;

import java.util.Date;

/**
 *
 */
@Data
@Schema(description = "")
public class TextContentVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Schema(description = "文本消息ID")
	private Long id;

	@Schema(description = "文本消息")
	private String content;

	@Schema(description = "创建时间")
	@JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
	private Date createTime;

	@Schema(description = "更新时间")
	@JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
	private Date updateTime;


}