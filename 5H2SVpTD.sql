USE 5H2SVpTD;
/*
 --------------------------------------------------
 Target Server Type    : MySQL;
 Target Server Version : 8.0.12;
 
 Target Server Date : 2024-03-22 17:52:39;
 
 --------------------------------------------------
*/
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;



DROP TABLE IF EXISTS `aboutus`;
CREATE TABLE `aboutus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `subtitle` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '副标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `picture1` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片1',
  `picture2` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片2',
  `picture3` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片3',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1729408177362624514 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='关于我们';
INSERT INTO `aboutus`(id, addtime, title, subtitle, content, picture1, picture2, picture3) VALUES ('1', '2024-03-22 14:27:29.0', '关于我们', 'ABOUT US', '%3Cp%3E%E4%B8%8D%E7%AE%A1%E4%BD%A0%E6%83%B3%E8%A6%81%E6%80%8E%E6%A0%B7%E7%9A%84%E7%94%9F%E6%B4%BB%EF%BC%8C%E4%BD%A0%E9%83%BD%E8%A6%81%E5%8E%BB%E5%8A%AA%E5%8A%9B%E4%BA%89%E5%8F%96%EF%BC%8C%E4%B8%8D%E5%A4%9A%E5%B0%9D%E8%AF%95%E4%B8%80%E4%BA%9B%E4%BA%8B%E6%83%85%E6%80%8E%E4%B9%88%E7%9F%A5%E9%81%93%E8%87%AA%E5%B7%B1%E9%80%82%E5%90%88%E4%BB%80%E4%B9%88%E3%80%81%E4%B8%8D%E9%80%82%E5%90%88%E4%BB%80%E4%B9%88%E5%91%A2%3F%3C%2Fp%3E%3Cp%3E%E4%BD%A0%E8%AF%B4%E4%BD%A0%E5%96%9C%E6%AC%A2%E8%AF%BB%E4%B9%A6%EF%BC%8C%E8%AE%A9%E6%88%91%E7%BB%99%E4%BD%A0%E5%88%97%E4%B9%A6%E5%8D%95%EF%BC%8C%E4%BD%A0%E8%BF%98%E9%97%AE%E6%88%91%E5%93%AA%E9%87%8C%E6%9C%89%E9%82%A3%E4%B9%88%E5%A4%9A%E6%97%B6%E9%97%B4%E7%9C%8B%E4%B9%A6%3B%E4%BD%A0%E8%AF%B4%E8%87%AA%E5%B7%B1%E6%A2%A6%E6%83%B3%E7%9A%84%E8%81%8C%E4%B8%9A%E6%98%AF%E5%B9%BF%E5%91%8A%E6%96%87%E6%A1%88%EF%BC%8C%E9%97%AE%E6%88%91%E5%A6%82%E4%BD%95%E6%88%90%E4%B8%BA%E4%B8%80%E4%B8%AA%E6%96%87%E6%A1%88%EF%BC%8C%E5%BA%94%E8%AF%A5%E5%85%B7%E5%A4%87%E5%93%AA%E4%BA%9B%E7%B4%A0%E8%B4%A8%3B%E4%BD%A0%E8%AF%B4%E4%BD%A0%E8%AE%A1%E5%88%92%E6%99%A8%E8%B7%91%EF%BC%8C%E4%BD%86%E6%80%BB%E6%98%AF%E5%9B%A0%E4%B8%BA%E5%AD%A6%E4%B9%A0%E3%80%81%E5%B7%A5%E4%BD%9C%E8%BE%9B%E8%8B%A6%E6%88%96%E8%80%85%E8%BA%AB%E4%BD%93%E4%B8%8D%E8%88%92%E6%9C%8D%E7%AC%AC%E4%BA%8C%E5%A4%A9%E8%B5%B7%E4%B8%8D%E4%BA%86%E5%BA%8A%3B%E4%BD%A0%E8%AF%B4%E4%BD%A0%E4%B8%80%E7%9B%B4%E6%A2%A6%E6%83%B3%E4%B8%80%E4%B8%AA%E4%BA%BA%E5%8E%BB%E9%95%BF%E9%80%94%E6%97%85%E8%A1%8C%EF%BC%8C%E4%BD%86%E6%98%AF%E6%B2%A1%E9%92%B1%EF%BC%8C%E7%88%B6%E6%AF%8D%E8%A7%89%E5%BE%97%E5%8D%B1%E9%99%A9%E3%80%82%E5%85%B6%E5%AE%9E%EF%BC%8C%E6%88%91%E5%B7%B2%E7%BB%8F%E5%8E%8C%E5%80%A6%E4%BA%86%E4%BD%A0%E8%BF%99%E6%A0%B7%E8%AF%B4%E8%AF%B4%E8%80%8C%E5%B7%B2%E7%9A%84%E6%8A%8A%E6%88%8F%EF%BC%8C%E6%88%91%E8%A7%89%E5%BE%97%E5%B0%B1%E7%AE%97%E6%88%91%E5%91%8A%E8%AF%89%E4%BD%A0%E5%A6%82%E4%BD%95%E5%8E%BB%E5%81%9A%EF%BC%8C%E4%BD%A0%E4%B9%9F%E4%B8%8D%E4%BC%9A%E7%85%A7%E5%81%9A%EF%BC%8C%E5%9B%A0%E4%B8%BA%E4%BD%A0%E6%A0%B9%E6%9C%AC%E4%BB%80%E4%B9%88%E9%83%BD%E4%B8%8D%E5%81%9A%E3%80%82%E8%BF%99%E9%87%8C%E5%8F%AF%E4%BB%A5%E8%BE%93%E5%85%A5%E8%87%AA%E5%B7%B1%E6%83%B3%E9%9C%80%E8%A6%81%E7%9A%84%E5%86%85%E5%AE%B9%3C%2Fp%3E', 'upload/aboutus_picture1.jpg', 'upload/aboutus_picture2.jpg', 'upload/aboutus_picture3.jpg');



DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地址',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人',
  `phone` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话',
  `isdefault` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1729751362496536579 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='地址';
INSERT INTO `address`(id, addtime, userid, address, name, phone, isdefault) VALUES ('1729509926266126338', '2024-03-22 14:27:30.0', '1726887403038494722', '上海-徐汇区-湖南路街道-312321', '312', '17611415323', '否');
INSERT INTO `address`(id, addtime, userid, address, name, phone, isdefault) VALUES ('1729509935090941954', '2024-03-22 14:27:30.0', '1726887403038494722', '上海-徐汇区-湖南路街道-312321', '312', '17611415323', '否');
INSERT INTO `address`(id, addtime, userid, address, name, phone, isdefault) VALUES ('1729510047255019522', '2024-03-22 14:27:30.0', '1726887403038494722', '北京-朝阳区-管庄地区-312321', '3213', '17611415323', '否');
INSERT INTO `address`(id, addtime, userid, address, name, phone, isdefault) VALUES ('1729510216704901121', '2024-03-22 14:27:30.0', '1726887403038494722', '天津-河北区-建昌道街道-312312', '哈哈', '17611415323', '否');
INSERT INTO `address`(id, addtime, userid, address, name, phone, isdefault) VALUES ('1729751174398795778', '2024-03-22 14:27:30.0', '1726887403038494722', '上海-徐汇区-湖南路街道-312321', '312', '17611415323', '否');
INSERT INTO `address`(id, addtime, userid, address, name, phone, isdefault) VALUES ('1729751362496536578', '2024-03-22 14:27:30.0', '1726887403038494722', '上海-徐汇区-湖南路街道-312321', '312', '17611415323', '是');



DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `password` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `gender` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别',
  `phone` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '联系方式',
  `avatarUrl` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '头像',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '权限',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `yonghuzhanghao` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='后台管理用户表';
INSERT INTO `admin`(id, username, password, name, gender, phone, avatarurl, email, role, addtime) VALUES ('1', 'admin', 'b3b72761d8db8c78dd195bcd433f29b97d80c7ecf81dfd54819542bdc706740e', '管理员12', '男', '13823888886', 'api/upload/headr_61871.png', NULL, '0', '2024-03-22 14:27:29.0');



DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品名称',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float DEFAULT NULL COMMENT '单价',
  `discountprice` float DEFAULT NULL COMMENT '会员价',
  `shangjiazhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商户名称',
  `fenlei` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='购物车表';



DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(1500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '配置参数值',
  `addtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771102425638756354 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='配置文件';
INSERT INTO `config`(id, name, value, addtime) VALUES ('1771102384245170177', 'tushu.jpg', 'api/upload/tushu_61888.jpg', '2024-03-22 17:11:29.0');
INSERT INTO `config`(id, name, value, addtime) VALUES ('1771102425638756353', 'beijing.png', 'api/upload/beijing_61898.png', '2024-03-22 17:11:38.0');



DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `id` bigint(20) NOT NULL,
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '头像',
  `nickname` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '用户名',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '评论内容',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父id',
  `likes_count` int(11) DEFAULT NULL COMMENT '点赞数量',
  `create_time` timestamp NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='评论表';
INSERT INTO `discuss`(id, refid, userid, avatarurl, nickname, content, parent_id, likes_count, create_time) VALUES ('1771101193209634818', '1771101077337792513', '1771098609421901826', '', 'shenkai22', '好看', NULL, '1', '2024-03-22 17:06:45.0');
INSERT INTO `discuss`(id, refid, userid, avatarurl, nickname, content, parent_id, likes_count, create_time) VALUES ('1771104276631248897', '1771103818357399554', '1771103590615080961', 'api/upload/headr_62175.png', 'shenkai33', '好看太老看了', NULL, '0', '2024-03-22 17:19:00.0');



DROP TABLE IF EXISTS `image_content`;
CREATE TABLE `image_content` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '图片消息ID',
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '图片存储路径',
  `file_id` bigint(20) unsigned DEFAULT NULL COMMENT '文件ID',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `fk_image_content_file_id` (`file_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;



DROP TABLE IF EXISTS `jinhuo`;
CREATE TABLE `jinhuo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(1000) DEFAULT NULL COMMENT '汽车的名字',
  `type` varchar(255) DEFAULT NULL COMMENT '汽车类型',
  `model` varchar(1000) DEFAULT NULL COMMENT '汽车的型号',
  `year` varchar(1000) DEFAULT NULL COMMENT '生产年份',
  `price` float DEFAULT NULL COMMENT '进货价格',
  `yinqin` varchar(1000) DEFAULT NULL COMMENT '引擎类型',
  `bianshuqi` varchar(1000) DEFAULT NULL COMMENT '变数器类型（手动/自动）',
  `lichengshu` varchar(1000) DEFAULT NULL COMMENT '里程数',
  `color` varchar(1000) DEFAULT NULL COMMENT '颜色',
  `cheshen` varchar(1000) DEFAULT NULL COMMENT '车身类型(轿车/SUV/卡车)',
  `num` int(11) DEFAULT NULL COMMENT '进货量',
  `details` longtext COMMENT '车辆的详细描述',
  `photo` varchar(1000) DEFAULT NULL COMMENT '车辆图片',
  `userid` bigint(20) DEFAULT NULL COMMENT '创建人的id',
  `username` varchar(1000) DEFAULT NULL COMMENT '创建人的名字',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771103044223098882 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='进货';
INSERT INTO `jinhuo`(id, name, type, model, year, price, yinqin, bianshuqi, lichengshu, color, cheshen, num, details, photo, userid, username, addtime) VALUES ('1771103044223098881', '保时捷', '阿萨法', '10023', '1999', '200000.0', 'qiche', '自动', '200', '黑色', '轿车', '11', '阿三哥发给谁', 'api/upload/0104x1200084v3h4dE5D8_R_1600_10000_62042.jpg', '1', '管理员12', '2024-03-22 17:14:06.0');



DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '消息ID',
  `from_id` bigint(20) unsigned NOT NULL COMMENT '发送方用户ID',
  `to_id` bigint(20) unsigned NOT NULL COMMENT '接收方用户ID',
  `type` tinyint(3) unsigned NOT NULL COMMENT '消息类型(0 ~ 255)，私聊(0)/群聊(1)消息',
  `content_type` tinyint(3) unsigned NOT NULL COMMENT '消息内容类型，文本(0)/图片(1)/文件(2)',
  `content_id` bigint(20) unsigned NOT NULL COMMENT '消息内容ID',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '消息发送时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
  `touxiang` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `fk_message_from_id` (`from_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771104581947219970 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;
INSERT INTO `message`(id, from_id, to_id, type, content_type, content_id, create_time, update_time, username, touxiang) VALUES ('1771104469195939842', '1771103590615080961', '1', '0', '0', '1771104468738760706', '2024-03-22 17:19:45.0', '2024-03-22 17:19:45.0', 'shenkai33', 'api/upload/headr_62175.png');
INSERT INTO `message`(id, from_id, to_id, type, content_type, content_id, create_time, update_time, username, touxiang) VALUES ('1771104545481940994', '1', '1771103590615080961', '0', '0', '1771104545205116929', '2024-03-22 17:20:03.0', '2024-03-22 17:20:03.0', 'admin', 'api/upload/headr_61871.png');
INSERT INTO `message`(id, from_id, to_id, type, content_type, content_id, create_time, update_time, username, touxiang) VALUES ('1771104581947219969', '1771103590615080961', '1', '0', '0', '1771104581875916802', '2024-03-22 17:20:12.0', '2024-03-22 17:20:12.0', 'shenkai33', 'api/upload/headr_62175.png');



DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `introduction` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '简介',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1729061975584571394 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='公告信息';
INSERT INTO `news`(id, addtime, title, introduction, picture, content) VALUES ('93', '2024-03-22 14:27:29.0', '人生，没有永远的伤痛', '人生，没有永远的伤痛，再深的痛，在切之时，伤口总会痊愈。人生，没有过不去的坎，你不可以坐在坎边等它消失，你只能想办法穿过它。人生，没有永远的爱情，没有结局的感情，总要结束；不能拥有的人，总会忘记', 'https://s11.ax1x.com/2024/01/03/pivifVs.png', '<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>');
INSERT INTO `news`(id, addtime, title, introduction, picture, content) VALUES ('94', '2024-03-22 14:27:29.0', '所有的努力都不会完全白费', '21.所有的努力都不会完全白费，你付出多少时间和精力，都是在对未来的积累。世界上什么都不公平，唯独时间最公平，你是懒惰还是努力，时间都会给出结果。', 'https://s11.ax1x.com/2024/01/03/pivi45q.png', '<p>当遇到挫折或失败，你是看见失败还是看见机会?</p><p>挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。</p><p>人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚至反败为胜。</p><p>大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。</p><p>	“塞翁失马，焉知非福。”人生的道路，并不是每一步都迈向成功，这就是追求的意义。我们还要认识到一点，挫折作为一种情绪状态和一种个人体验，各人的耐受性是大不相同的，有的人经历了一次次挫折，就能够坚忍不拔，百折不挠;有的人稍遇挫折便意志消沉，一蹶不振。所以，挫折感是一种主观感受，因为人的目的和需要不同，成功标准不同，所以同一种活动对于不同的人可能会造成不同的挫折感受。</p><p>凡事皆以平常心来看待，对于生命顺逆不要太执著。能够“破我执”是很高层的人生境界。</p><p>人事的艰难就是一种考验。就像—支剑要有磨刀来磨，剑才会利:一块璞玉要有粗石来磨，才会发出耀眼的光芒。我们能够做到的，只是如何减少、避免那些由于自身的原因所造成的挫折，而在遇到痛苦和挫折之后，则力求化解痛苦，争取幸福。我们要知道，痛苦和挫折是双重性的，它既是我们人生中难以完全避免的，也是我们在争取成功时，不可缺少的一种动力。因为我认为，推动我们奋斗的力量，不仅仅是对成功的渴望，还有为摆脱痛苦和挫折而进行的奋斗。</p>');
INSERT INTO `news`(id, addtime, title, introduction, picture, content) VALUES ('95', '2024-03-22 14:27:29.0', '人生，没有过不去的坎', '19.人生，没有过不去的坎，你不可以坐在坎边等它消失，你只能想办法穿过它；人生，没有永远的伤痛，再深的痛，伤口总会痊愈；人生，没有永远的爱情，没有结局的感情，总要结束；不能拥有的人，总会忘记。慢慢地，你不会再流泪；慢慢地，一切都过去了，适当的放弃，是人生优雅的转身。', 'https://s11.ax1x.com/2024/01/03/piviIP0.png', '<p>有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。</p><p>不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。</p><p>	不管你现在是在图书馆里背着怎么也看不进去的英语单词，还是你现在迷茫地看不清未来的方向不知道要往哪走。</p><p>不管你现在是在努力着去实现梦想却没能拉近与梦想的距离，还是你已经慢慢地找不到自己的梦想了。</p><p>你都要去相信，没有到不了的明天。</p><p>	有的时候你的梦想太大，别人说你的梦想根本不可能实现;有的时候你的梦想又太小，又有人说你胸无大志;有的时候你对死党说着将来要去环游世界的梦想，却换来他的不屑一顾，于是你再也不提自己的梦想;有的时候你突然说起将来要开个小店的愿望，却发现你讲述的那个人，并没有听到你在说什么。</p><p>不过又能怎么样呢，未来始终是自己的，梦想始终是自己的，没有人会来帮你实现它。</p><p>也许很多时候我们只是需要朋友的一句鼓励，一句安慰，却也得不到。但是相信我，世界上还有很多人，只是想要和你说说话。</p><p>因为我们都一样。一样的被人说成固执，一样的在追逐他们眼里根本不在意的东西。</p><p>所以，又有什么关系呢，别人始终不是你、不能懂你的心情，你又何必多去解释呢。这个世界会来阻止你，困难也会接踵而至，其实真正关键的只有自己，有没有那个倔强。</p><p>这个世界上没有不带伤的人，真正能治愈自己的，只有自己。</p>');
INSERT INTO `news`(id, addtime, title, introduction, picture, content) VALUES ('97', '2024-03-22 14:27:29.0', '生活中可以没有诗歌', '23.生活中可以没有诗歌，但不能没有诗意；行进中可以没有道路，但不能没有前进的脚步；工作中可以没有经验，但不能没有学习，人生中可以没有闪光，但不能有污迹。', 'https://s11.ax1x.com/2024/01/03/piviIP0.png', '<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够确定自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>');



DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品名称',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float NOT NULL DEFAULT '0' COMMENT '价格',
  `discountprice` float DEFAULT '0' COMMENT '折扣价格',
  `total` float NOT NULL DEFAULT '0' COMMENT '总价格',
  `discounttotal` float DEFAULT '0' COMMENT '折扣总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '状态',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '收货人',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `logistics` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '物流',
  `shangjiazhanghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商户名称',
  `fenlei` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '商品分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771103818357399555 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='订单';
INSERT INTO `orders`(id, addtime, orderid, tablename, userid, goodid, goodname, picture, buynumber, price, discountprice, total, discounttotal, type, status, address, tel, consignee, remark, logistics, shangjiazhanghao, fenlei) VALUES ('1771101077337792513', '2024-03-22 17:06:16.0', '1771101077266489344', '', '1771098609421901826', '1771099451264851969', 'Bwm5系', 'api/upload/333(1)_61183.png', '1', '20000.0', '0.0', '20000.0', '0.0', '0', '已支付', '上海-徐汇区-湖南路街道-312321', '17611415323', '312', '', NULL, '1771099451264851969', NULL);
INSERT INTO `orders`(id, addtime, orderid, tablename, userid, goodid, goodname, picture, buynumber, price, discountprice, total, discounttotal, type, status, address, tel, consignee, remark, logistics, shangjiazhanghao, fenlei) VALUES ('1771103818357399554', '2024-03-22 17:17:10.0', '1771103818277707776', '', '1771103590615080961', '1771103361044045826', '保时捷1', 'api/upload/4add61ebly1hjqx77bv8dj20u0140aq7_62112.jpg', '1', '20000.0', '0.0', '20000.0', '0.0', '0', '已支付', '上海-徐汇区-湖南路街道-312321', '17611415323', '312', '', NULL, '1771103361044045826', NULL);



DROP TABLE IF EXISTS `postcategories`;
CREATE TABLE `postcategories` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `addtime` datetime DEFAULT NULL COMMENT '创建时间',
  `userid` bigint(20) DEFAULT NULL COMMENT '创建人',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '创建人名字',
  `category_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '分类',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='帖子话题分类';
INSERT INTO `postcategories`(id, addtime, userid, username, category_name) VALUES ('1727991403442307074', '2024-03-22 14:27:29.0', '2', 'admin1', '啦啦啦la');
INSERT INTO `postcategories`(id, addtime, userid, username, category_name) VALUES ('1727992664430444546', '2024-03-22 14:27:29.0', '2', 'admin1', 'qqqqll');
INSERT INTO `postcategories`(id, addtime, userid, username, category_name) VALUES ('1727993431035969538', '2024-03-22 14:27:29.0', '2', 'admin1', 'hhhh');



DROP TABLE IF EXISTS `posts`;
CREATE TABLE `posts` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `category_id` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '话题分类',
  `posting_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '发帖地址',
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '封面',
  `post_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '帖子标题',
  `post_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '内容',
  `is_published` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '是否发布(Y/N)',
  `is_approved` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '是否审核通过(Y/N)',
  `userid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '发帖人',
  `addtime` datetime DEFAULT NULL COMMENT '创建时间',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '发帖人名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='帖子详情';
INSERT INTO `posts`(id, category_id, posting_address, picture, post_title, post_content, is_published, is_approved, userid, addtime, username) VALUES ('1729390431694393345', 'qqqqll', '["上海","徐汇区","湖南路街道"]', 'https://s11.ax1x.com/2024/01/03/piviIP0.png', 'qq', '%3Cp%3Eaaa%3C%2Fp%3E', 'N', NULL, '1', '2024-03-22 14:27:30.0', 'admin');



DROP TABLE IF EXISTS `qiche`;
CREATE TABLE `qiche` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(1000) DEFAULT NULL COMMENT '汽车的名字',
  `model` varchar(1000) DEFAULT NULL COMMENT '汽车的型号',
  `year` varchar(1000) DEFAULT NULL COMMENT '生产年份',
  `price` float DEFAULT NULL COMMENT '销售价格',
  `yinqin` varchar(1000) DEFAULT NULL COMMENT '引擎类型',
  `bianshuqi` varchar(1000) DEFAULT NULL COMMENT '变数器类型（手动/自动）',
  `lichengshu` varchar(1000) DEFAULT NULL COMMENT '里程数',
  `color` varchar(1000) DEFAULT NULL COMMENT '颜色',
  `cheshen` varchar(1000) DEFAULT NULL COMMENT '车身类型(轿车/SUV/卡车)',
  `num` int(11) DEFAULT NULL COMMENT '库存',
  `details` longtext COMMENT '车辆的详细描述',
  `photo` varchar(1000) DEFAULT NULL COMMENT '车辆图片',
  `classify` varchar(1000) DEFAULT NULL COMMENT '车辆的分类',
  `userid` bigint(20) DEFAULT NULL COMMENT '创建人的id',
  `username` varchar(1000) DEFAULT NULL COMMENT '创建人的名字',
  `clicknum` int(11) DEFAULT NULL COMMENT '浏览量',
  `photos` longtext COMMENT '轮播图',
  `number` varchar(1000) DEFAULT NULL COMMENT '库存编号',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771103361044045827 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='汽车';
INSERT INTO `qiche`(id, name, model, year, price, yinqin, bianshuqi, lichengshu, color, cheshen, num, details, photo, classify, userid, username, clicknum, photos, number, addtime) VALUES ('1771099451264851969', 'Bwm5系', '10023', '1999', '20000.0', 'qiche', '手动', '200', '白色', '轿车', '3', '啊沙发上', 'api/upload/333(1)_61183.png', 'BWM', '1', '管理员', '3', '["api/upload/333_61186.jpg"]', '11', '2024-03-22 16:59:49.0');
INSERT INTO `qiche`(id, name, model, year, price, yinqin, bianshuqi, lichengshu, color, cheshen, num, details, photo, classify, userid, username, clicknum, photos, number, addtime) VALUES ('1771103361044045826', '保时捷1', '10023', '1999', '20000.0', 'qiche', '手动', '200', '白色', '轿车', '3', '撒发发', 'api/upload/4add61ebly1hjqx77bv8dj20u0140aq7_62112.jpg', '保时捷', '1', '管理员12', '2', '["api/upload/banner3_62118.png"]', '11', '2024-03-22 17:15:21.0');



DROP TABLE IF EXISTS `qichefenlei`;
CREATE TABLE `qichefenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(1000) DEFAULT NULL COMMENT '汽车分类的名字',
  `photo` varchar(1000) DEFAULT NULL COMMENT '汽车分类的图片',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771103135298215938 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='汽车分类';
INSERT INTO `qichefenlei`(id, name, photo, addtime) VALUES ('1771099169642504194', 'BWM', 'api/upload/27b36ccf5db1b6bc2987785f4cb800b1_61120.jpg', '2024-03-22 16:58:42.0');
INSERT INTO `qichefenlei`(id, name, photo, addtime) VALUES ('1771099221446352897', '保时捷', 'api/upload/111_61133.jpg', '2024-03-22 16:58:54.0');
INSERT INTO `qichefenlei`(id, name, photo, addtime) VALUES ('1771103135298215937', '捷达', 'api/upload/0106s1200093lnuby071C_R_1600_10000_62066.jpg', '2024-03-22 17:14:28.0');



DROP TABLE IF EXISTS `storeup`;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) NOT NULL COMMENT '关联id',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '表名',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名称',
  `picture` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片',
  `type` int(200) NOT NULL DEFAULT '1' COMMENT '类型(-1:踩,1:浏览,2:关注,3:收藏,4:点赞,5:喜欢)',
  `inteltype` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771103804256149506 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='收藏表';
INSERT INTO `storeup`(id, addtime, userid, refid, tablename, name, picture, type, inteltype, remark) VALUES ('1771099597667033089', '2024-03-22 17:00:24.0', '1771098609421901826', '1771099451264851969', NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `storeup`(id, addtime, userid, refid, tablename, name, picture, type, inteltype, remark) VALUES ('1771100251311562754', '2024-03-22 17:03:00.0', '1771098609421901826', '1771099451264851969', NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `storeup`(id, addtime, userid, refid, tablename, name, picture, type, inteltype, remark) VALUES ('1771100595236102146', '2024-03-22 17:04:22.0', '1771098609421901826', '1771099451264851969', NULL, 'Bwm5系', 'api/upload/333(1)_61183.png', '3', NULL, NULL);
INSERT INTO `storeup`(id, addtime, userid, refid, tablename, name, picture, type, inteltype, remark) VALUES ('1771101063651778561', '2024-03-22 17:06:14.0', '1771098609421901826', '1771099451264851969', NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `storeup`(id, addtime, userid, refid, tablename, name, picture, type, inteltype, remark) VALUES ('1771103411426025474', '2024-03-22 17:15:33.0', '1', '1771103361044045826', NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `storeup`(id, addtime, userid, refid, tablename, name, picture, type, inteltype, remark) VALUES ('1771103683728629761', '2024-03-22 17:16:38.0', '1771103590615080961', '1771103361044045826', NULL, NULL, NULL, '1', NULL, NULL);
INSERT INTO `storeup`(id, addtime, userid, refid, tablename, name, picture, type, inteltype, remark) VALUES ('1771103699906060289', '2024-03-22 17:16:42.0', '1771103590615080961', '1771103361044045826', NULL, '保时捷1', 'api/upload/4add61ebly1hjqx77bv8dj20u0140aq7_62112.jpg', '3', NULL, NULL);
INSERT INTO `storeup`(id, addtime, userid, refid, tablename, name, picture, type, inteltype, remark) VALUES ('1771103804256149505', '2024-03-22 17:17:07.0', '1771103590615080961', '1771103361044045826', NULL, NULL, NULL, '1', NULL, NULL);



DROP TABLE IF EXISTS `sys_attachment`;
CREATE TABLE `sys_attachment` (
  `id` bigint(20) NOT NULL COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '附件名称',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '附件地址',
  `size` bigint(20) DEFAULT NULL COMMENT '附件大小',
  `platform` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '存储平台',
  `creator` bigint(20) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='附件管理';
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771099164005359618', '27b36ccf5db1b6bc2987785f4cb800b1.jpg', 'api/upload/27b36ccf5db1b6bc2987785f4cb800b1_61120.jpg', '1367292', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771099217981857793', '111.jpg', 'api/upload/111_61133.jpg', '2304772', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771099425163698177', '333(1).png', 'api/upload/333(1)_61183.png', '3588882', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771099438711300098', '333.jpg', 'api/upload/333_61186.jpg', '1367292', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771102313030082561', 'headr.png', 'api/upload/headr_61871.png', '6035', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771102383402115074', 'tushu.jpg', 'api/upload/tushu_61888.jpg', '218526', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771102425261268993', 'beijing.png', 'api/upload/beijing_61898.png', '1244942', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771103031313031170', '0104x1200084v3h4dE5D8_R_1600_10000.jpg', 'api/upload/0104x1200084v3h4dE5D8_R_1600_10000_62042.jpg', '490814', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771103131812749314', '0106s1200093lnuby071C_R_1600_10000.jpg', 'api/upload/0106s1200093lnuby071C_R_1600_10000_62066.jpg', '289822', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771103325316964354', '4add61ebly1hjqx77bv8dj20u0140aq7.jpg', 'api/upload/4add61ebly1hjqx77bv8dj20u0140aq7_62112.jpg', '238231', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771103347634855937', 'banner3.png', 'api/upload/banner3_62118.png', '756151', 'LOCAL', NULL, NULL);
INSERT INTO `sys_attachment`(id, name, url, size, platform, creator, create_time) VALUES ('1771103586303336449', 'headr.png', 'api/upload/headr_62175.png', '6035', 'LOCAL', NULL, NULL);



DROP TABLE IF EXISTS `systemintro`;
CREATE TABLE `systemintro` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `subtitle` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '副标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `picture1` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片1',
  `picture2` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片2',
  `picture3` longtext CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '图片3',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='关于我们';
INSERT INTO `systemintro`(id, addtime, title, subtitle, content, picture1, picture2, picture3) VALUES ('1', '2024-03-22 14:27:30.0', '系统简介', 'SYSTEM INTRODUCTION', '当遇到挫折或失败，你是看见失败还是看见机会?挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚至反败为胜。大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。', 'upload/systemintro_picture1.jpg', 'https://s11.ax1x.com/2024/01/03/pivi45q.png', 'https://s11.ax1x.com/2024/01/03/piviIP0.png');



DROP TABLE IF EXISTS `text_content`;
CREATE TABLE `text_content` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '文本消息ID',
  `content` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文本消息',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `index_id` (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771104581875916803 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;
INSERT INTO `text_content`(id, content, create_time, update_time) VALUES ('1771104468738760706', '你好', '2024-03-22 17:19:45.0', '2024-03-22 17:19:45.0');
INSERT INTO `text_content`(id, content, create_time, update_time) VALUES ('1771104545205116929', 'shenkai33 你好', '2024-03-22 17:20:03.0', '2024-03-22 17:20:03.0');
INSERT INTO `text_content`(id, content, create_time, update_time) VALUES ('1771104581875916802', '你好你好', '2024-03-22 17:20:12.0', '2024-03-22 17:20:12.0');



DROP TABLE IF EXISTS `tousufankui`;
CREATE TABLE `tousufankui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '投诉原因',
  `photo` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '投诉照片',
  `detail` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '投诉简介',
  `details` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '投诉详情',
  `userid` bigint(20) DEFAULT NULL COMMENT '投诉人id',
  `username` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '投诉人名字',
  `status` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '投诉状态',
  `fankuijieguo` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '反馈结果',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1743547502863691779 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='投诉反馈';



DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '3' COMMENT '角色',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '昵称',
  `touxiang` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `money` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1771103590615080962 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';
INSERT INTO `user`(id, username, password, role, name, touxiang, phone, email, addtime, money) VALUES ('1771098609421901826', 'shenkai22', '116c51ba4d3422c36f880e7b0eb4beb32d5bd27dae9832effc6530396f10adfe', '3', '凯凯', '', '13444444443', '1432442018@qq.com', '2024-03-22 16:56:28.0', '180000.0');
INSERT INTO `user`(id, username, password, role, name, touxiang, phone, email, addtime, money) VALUES ('1771103590615080961', 'shenkai33', '116c51ba4d3422c36f880e7b0eb4beb32d5bd27dae9832effc6530396f10adfe', '3', '凯凯', 'api/upload/headr_62175.png', '13444444443', '1432442018@qq.com', '2024-03-22 17:16:16.0', '1999980000');



SET FOREIGN_KEY_CHECKS = 1;
