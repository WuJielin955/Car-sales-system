package myproject.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import myproject.common.query.Query;

import java.util.Date;

/**
 * token表查询
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "token表查询")
public class TokenQuery extends Query {
	@Schema(description = "主键")
	private Long id;

	@Schema(description = "用户id")
	private Long userid;

	@Schema(description = "用户名")
	private String username;

	@Schema(description = "表名")
	private String tablename;

	@Schema(description = "角色")
	private String role;

	@Schema(description = "密码")
	private String token;

	@Schema(description = "新增时间")
	private Date addtime;

	@Schema(description = "过期时间")
	private Date expiratedtime;

}