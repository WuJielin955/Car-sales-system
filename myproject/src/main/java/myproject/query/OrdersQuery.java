package myproject.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import myproject.common.query.Query;

import java.util.Date;

/**
 * 订单查询
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "订单查询")
public class OrdersQuery extends Query {
	@Schema(description = "主键")
	private Long id;

	@Schema(description = "创建时间")
	private Date[] addtime;

	@Schema(description = "订单编号")
	private String orderid;


	@Schema(description = "用户id")
	private Long userid;

	@Schema(description = "商品id")
	private Long goodid;

	@Schema(description = "商品名称")
	private String goodname;

	@Schema(description = "商品图片")
	private String picture;

	@Schema(description = "购买数量")
	private Integer buynumber;

	@Schema(description = "价格")
	private Float price;

	@Schema(description = "折扣价格")
	private Float discountprice;

	@Schema(description = "总价格")
	private Float total;

	@Schema(description = "折扣总价格")
	private Float discounttotal;

	@Schema(description = "支付类型")
	private Integer type;

	@Schema(description = "状态")
	private String status;

	@Schema(description = "地址")
	private String address;

	@Schema(description = "电话")
	private String tel;

	@Schema(description = "收货人")
	private String consignee;

	@Schema(description = "备注")
	private String remark;

	@Schema(description = "物流")
	private String logistics;

	@Schema(description = "商户名称")
	private String shangjiazhanghao;
	@Schema(description = "商户分类")
	private String fenlei;
}