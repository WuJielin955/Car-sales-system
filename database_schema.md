表aboutus (关于我们)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
3	title	varchar	200	0	N	N		标题
4	subtitle	varchar	200	0	Y	N		副标题
5	content	longtext	2147483647	0	N	N		内容
6	picture1	longtext	2147483647	0	Y	N		图片1
7	picture2	longtext	2147483647	0	Y	N		图片2
8	picture3	longtext	2147483647	0	Y	N		图片3
表address (地址)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
3	userid	bigint	20	0	N	N		用户id
4	address	varchar	200	0	N	N		地址
5	name	varchar	200	0	N	N		收货人
6	phone	varchar	200	0	N	N		电话
7	isdefault	varchar	200	0	N	N		是否默认地址[是/否]
表admin (后台管理用户表)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	username	varchar	200	0	N	N		用户账号
3	password	varchar	200	0	N	N		密码
4	name	varchar	200	0	N	N		用户姓名
5	gender	varchar	200	0	Y	N		性别
6	phone	varchar	200	0	Y	N		联系方式
7	avatarUrl	longtext	2147483647	0	Y	N		头像
8	email	varchar	255	0	Y	N		邮箱
9	role	varchar	255	0	Y	N		权限
10	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
表cart (购物车表)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
3	userid	bigint	20	0	N	N		用户id
4	goodid	bigint	20	0	N	N		商品id
5	goodname	varchar	200	0	Y	N		商品名称
6	picture	longtext	2147483647	0	Y	N		图片
7	buynumber	int	10	0	N	N		购买数量
8	price	float	13	0	Y	N		单价
9	discountprice	float	13	0	Y	N		会员价
10	shangjiazhanghao	varchar	200	0	Y	N		商户名称
11	fenlei	varchar	255	0	Y	N		商品分类
表config (配置文件)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	name	varchar	100	0	N	N		配置参数名称
3	value	varchar	1500	0	Y	N		配置参数值
4	addtime	datetime	19	0	Y	N		创建时间
表discuss (评论表)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		
2	refid	bigint	20	0	N	N		关联表id
3	userid	bigint	20	0	N	N		用户id
4	avatarurl	text	65535	0	Y	N		头像
5	nickname	text	65535	0	Y	N		用户名
6	content	text	65535	0	Y	N		评论内容
7	parent_id	bigint	20	0	Y	N		父id
8	likes_count	int	10	0	Y	N		点赞数量
9	create_time	timestamp	19	0	N	N		创建时间
表image_content
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		图片消息ID
2	path	varchar	255	0	N	N		图片存储路径
3	file_id	bigint	20	0	Y	N		文件ID
4	create_time	timestamp	19	0	Y	N	CURRENT_TIMESTAMP	创建时间
5	update_time	timestamp	19	0	Y	N	CURRENT_TIMESTAMP	更新时间
表jinhuo (进货)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	name	varchar	1000	0	Y	N		汽车的名字
3	type	varchar	255	0	Y	N		汽车类型
4	model	varchar	1000	0	Y	N		汽车的型号
5	year	varchar	1000	0	Y	N		生产年份
6	price	float	13	0	Y	N		进货价格
7	yinqin	varchar	1000	0	Y	N		引擎类型
8	bianshuqi	varchar	1000	0	Y	N		变数器类型（手动/自动）
9	lichengshu	varchar	1000	0	Y	N		里程数
10	color	varchar	1000	0	Y	N		颜色
11	cheshen	varchar	1000	0	Y	N		车身类型(轿车/SUV/卡车)
12	num	int	10	0	Y	N		进货量
13	details	longtext	2147483647	0	Y	N		车辆的详细描述
14	photo	varchar	1000	0	Y	N		车辆图片
15	userid	bigint	20	0	Y	N		创建人的id
16	username	varchar	1000	0	Y	N		创建人的名字
17	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
表message
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		消息ID
2	from_id	bigint	20	0	N	N		发送方用户ID
3	to_id	bigint	20	0	N	N		接收方用户ID
4	type	tinyint	3	0	N	N		消息类型(0 ~ 255)，私聊(0)/群聊(1)消息
5	content_type	tinyint	3	0	N	N		消息内容类型，文本(0)/图片(1)/文件(2)
6	content_id	bigint	20	0	N	N		消息内容ID
7	create_time	timestamp	19	0	Y	N	CURRENT_TIMESTAMP	消息发送时间
8	update_time	timestamp	19	0	Y	N	CURRENT_TIMESTAMP	更新时间
9	username	varchar	255	0	Y	N		用户名
10	touxiang	varchar	255	0	Y	N		头像
表news (公告信息)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
3	title	varchar	200	0	N	N		标题
4	introduction	longtext	2147483647	0	Y	N		简介
5	picture	longtext	2147483647	0	N	N		图片
6	content	longtext	2147483647	0	N	N		内容
表orders (订单)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
3	orderid	varchar	200	0	N	N		订单编号
4	tablename	varchar	200	0	Y	N		商品表名
5	userid	bigint	20	0	N	N		用户id
6	goodid	bigint	20	0	N	N		商品id
7	goodname	varchar	200	0	Y	N		商品名称
8	picture	longtext	2147483647	0	Y	N		商品图片
9	buynumber	int	10	0	N	N		购买数量
10	price	float	13	0	N	N	0	价格
11	discountprice	float	13	0	Y	N	0	折扣价格
12	total	float	13	0	N	N	0	总价格
13	discounttotal	float	13	0	Y	N	0	折扣总价格
14	type	int	10	0	Y	N	1	支付类型
15	status	varchar	200	0	Y	N		状态
16	address	varchar	200	0	Y	N		地址
17	tel	varchar	200	0	Y	N		电话
18	consignee	varchar	200	0	Y	N		收货人
19	remark	varchar	200	0	Y	N		备注
20	logistics	longtext	2147483647	0	Y	N		物流
21	shangjiazhanghao	varchar	200	0	Y	N		商户名称
22	fenlei	varchar	255	0	Y	N		商品分类
表postcategories (帖子话题分类)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	addtime	datetime	19	0	Y	N		创建时间
3	userid	bigint	20	0	Y	N		创建人
4	username	varchar	255	0	Y	N		创建人名字
5	category_name	varchar	255	0	Y	N		分类
表posts (帖子详情)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	category_id	varchar	500	0	Y	N		话题分类
3	posting_address	varchar	255	0	Y	N		发帖地址
4	picture	varchar	255	0	Y	N		封面
5	post_title	varchar	255	0	Y	N		帖子标题
6	post_content	longtext	2147483647	0	Y	N		内容
7	is_published	varchar	255	0	Y	N		是否发布(Y/N)
8	is_approved	varchar	255	0	Y	N		是否审核通过(Y/N)
9	userid	varchar	255	0	Y	N		发帖人
10	addtime	datetime	19	0	Y	N		创建时间
11	username	varchar	255	0	Y	N		发帖人名称
表qiche (汽车)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	name	varchar	1000	0	Y	N		汽车的名字
3	model	varchar	1000	0	Y	N		汽车的型号
4	year	varchar	1000	0	Y	N		生产年份
5	price	float	13	0	Y	N		销售价格
6	yinqin	varchar	1000	0	Y	N		引擎类型
7	bianshuqi	varchar	1000	0	Y	N		变数器类型（手动/自动）
8	lichengshu	varchar	1000	0	Y	N		里程数
9	color	varchar	1000	0	Y	N		颜色
10	cheshen	varchar	1000	0	Y	N		车身类型(轿车/SUV/卡车)
11	num	int	10	0	Y	N		库存
12	details	longtext	2147483647	0	Y	N		车辆的详细描述
13	photo	varchar	1000	0	Y	N		车辆图片
14	classify	varchar	1000	0	Y	N		车辆的分类
15	userid	bigint	20	0	Y	N		创建人的id
16	username	varchar	1000	0	Y	N		创建人的名字
17	clicknum	int	10	0	Y	N		浏览量
18	photos	longtext	2147483647	0	Y	N		轮播图
19	number	varchar	1000	0	Y	N		库存编号
20	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
表qichefenlei (汽车分类)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	name	varchar	1000	0	Y	N		汽车分类的名字
3	photo	varchar	1000	0	Y	N		汽车分类的图片
4	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
表storeup (收藏表)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
3	userid	bigint	20	0	N	N		用户id
4	refid	bigint	20	0	N	N		关联id
5	tablename	varchar	200	0	Y	N		表名
6	name	varchar	200	0	Y	N		名称
7	picture	longtext	2147483647	0	Y	N		图片
8	type	int	10	0	N	N	1	类型(-1:踩,1:浏览,2:关注,3:收藏,4:点赞,5:喜欢)
9	inteltype	varchar	200	0	Y	N		推荐类型
10	remark	varchar	200	0	Y	N		备注
表sys_attachment (附件管理)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		id
2	name	varchar	255	0	N	N		附件名称
3	url	varchar	255	0	N	N		附件地址
4	size	bigint	20	0	Y	N		附件大小
5	platform	varchar	50	0	Y	N		存储平台
6	creator	bigint	20	0	Y	N		创建者
7	create_time	datetime	19	0	Y	N		创建时间
表systemintro (关于我们)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
3	title	varchar	200	0	N	N		标题
4	subtitle	varchar	200	0	Y	N		副标题
5	content	longtext	2147483647	0	N	N		内容
6	picture1	longtext	2147483647	0	Y	N		图片1
7	picture2	longtext	2147483647	0	Y	N		图片2
8	picture3	longtext	2147483647	0	Y	N		图片3
表text_content
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		文本消息ID
2	content	varchar	1024	0	N	N		文本消息
3	create_time	timestamp	19	0	Y	N	CURRENT_TIMESTAMP	创建时间
4	update_time	timestamp	19	0	Y	N	CURRENT_TIMESTAMP	更新时间
表tousufankui (投诉反馈)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	name	varchar	500	0	Y	N		投诉原因
3	photo	varchar	500	0	Y	N		投诉照片
4	detail	varchar	500	0	Y	N		投诉简介
5	details	varchar	500	0	Y	N		投诉详情
6	userid	bigint	20	0	Y	N		投诉人id
7	username	varchar	500	0	Y	N		投诉人名字
8	status	varchar	500	0	Y	N		投诉状态
9	fankuijieguo	varchar	500	0	Y	N		反馈结果
10	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	创建时间
表user (用户表)
编号	名称	数据类型	长度	小数位	允许空值	主键	默认值	说明
1	id	bigint	20	0	N	Y		主键
2	username	varchar	100	0	N	N		用户名
3	password	varchar	100	0	N	N		密码
4	role	varchar	100	0	Y	N	3	角色
5	name	varchar	255	0	Y	N		昵称
6	touxiang	varchar	255	0	Y	N		头像
7	phone	varchar	255	0	Y	N		手机号
8	email	varchar	255	0	Y	N		邮箱
9	addtime	timestamp	19	0	N	N	CURRENT_TIMESTAMP	新增时间
10	money	varchar	255	0	N	N	0	余额
