package myproject.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 关于我们
 */

@Data
@TableName("aboutus")
public class AboutusEntity {
	/**
	 * 主键
	 */
	@TableId
	private Long id;

	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private Date addtime;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 副标题
	 */
	private String subtitle;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 图片1
	 */
	private String picture1;

	/**
	 * 图片2
	 */
	private String picture2;

	/**
	 * 图片3
	 */
	private String picture3;

}