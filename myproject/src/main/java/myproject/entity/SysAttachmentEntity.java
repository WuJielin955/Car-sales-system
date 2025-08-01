package myproject.entity;

import lombok.Data;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

/**
 * 附件管理
 */

@Data
@TableName("sys_attachment")
public class SysAttachmentEntity {
	/**
	 * id
	 */
	@TableId
	private Long id;

	/**
	 * 附件名称
	 */
	private String name;

	/**
	 * 附件地址
	 */
	private String url;

	/**
	 * 附件大小
	 */
	private Long size;

	/**
	 * 存储平台
	 */
	private String platform;

	/**
	 * 创建者
	 */
	private Long creator;

	/**
	 * 创建时间
	 */
	private Date createTime;

}