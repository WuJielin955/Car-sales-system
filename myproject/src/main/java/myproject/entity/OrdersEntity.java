package myproject.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 订单
 */

@Data
@TableName("orders")
public class OrdersEntity {
	/**
	 * 主键
	 */
	@TableId
	private Long id;

	/**
	 * 创建时间
	 */
	private Date addtime;

	/**
	 * 订单编号
	 */
	private String orderid;


	/**
	 * 用户id
	 */
	private Long userid;

	/**
	 * 商品id
	 */
	private Long goodid;

	/**
	 * 商品名称
	 */
	private String goodname;

	/**
	 * 商品图片
	 */
	private String picture;

	/**
	 * 购买数量
	 */
	private Integer buynumber;

	/**
	 * 价格
	 */
	private Float price;

	/**
	 * 折扣价格
	 */
	private Float discountprice;

	/**
	 * 总价格
	 */
	private Float total;

	/**
	 * 折扣总价格
	 */
	private Float discounttotal;

	/**
	 * 支付类型
	 */
	private Integer type;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 电话
	 */
	private String tel;

	/**
	 * 收货人
	 */
	private String consignee;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 物流
	 */
	private String logistics;

	/**
	 * 商户名称
	 */
	private String shangjiazhanghao;
	/**
	 * 商户分类
	 */
	private String fenlei;
}