

-- 商品
-- ----------------------------
-- Table structure for pms_product
-- ----------------------------
DROP TABLE IF EXISTS `pms_product`;
CREATE TABLE `pms_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL COMMENT '商品名称',
  `product_category_id` bigint(20) DEFAULT NULL COMMENT '商品类型',
  `original_price` decimal(10,2) DEFAULT NULL COMMENT '市场价',
  `promotion_price` decimal(10,2) DEFAULT NULL COMMENT '促销价格',
  `price` decimal(10,2) DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL COMMENT '商品简介',
  `description` text COMMENT '商品描述',
  `stock` int(11) DEFAULT NULL COMMENT '库存',
  `cover_pic` varchar(255) DEFAULT NULL COMMENT '商品封面',
  `album_pics` varchar(255) DEFAULT NULL COMMENT '画册图片，产品图片限制为5张，以逗号分割',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='商品规格';

-- ----------------------------
-- Records of pms_product
-- ----------------------------
INSERT INTO `pms_product` VALUES ('1', '特供酒', 1, 199.00, 199.00, 199.00, '特供简介', '特供描述', 999, 'https://cdn.czjy.com/product/thumbnail.png', 'https://cdn.czjy.com/product/jars1.png, https://cdn.czjy.com/product/jars2.jpg');
INSERT INTO `pms_product` VALUES ('2', '大缸酒', 1, 499.00, 499.00, 499.00, '大缸简介', '大缸描述', 999, 'https://cdn.czjy.com/product/thumbnail.png', 'https://cdn.czjy.com/product/jars1.png, https://cdn.czjy.com/product/jars2.jpg');
INSERT INTO `pms_product` VALUES ('3', '明星酒', 1, 599.00, 599.00, 599.00, '明星简介', '明星描述', 999, 'https://cdn.czjy.com/product/thumbnail.png', 'https://cdn.czjy.com/product/jars1.png, https://cdn.czjy.com/product/jars2.jpg');
INSERT INTO `pms_product` VALUES ('4', '假日酒', 1, 699.00, 699.00, 699.00, '假日简介', '假日描述', 999, 'https://cdn.czjy.com/product/thumbnail.png', 'https://cdn.czjy.com/product/jars1.png, https://cdn.czjy.com/product/jars2.jpg');




-- 商品分类
-- ----------------------------
-- Table structure for pms_product_category
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_category`;
CREATE TABLE `pms_product_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) DEFAULT NULL COMMENT '上机分类的编号：0表示一级分类',
  `level` int(1) DEFAULT NULL COMMENT '分类级别：0->1级；1->2级',
  `name` varchar(64) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL COMMENT '图标',
  `keywords` varchar(255) DEFAULT NULL,
  `description` text DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8 COMMENT='商品分类';

-- ----------------------------
-- Records of pms_product_category
-- ----------------------------
INSERT INTO `pms_product_category` VALUES (1, 0, 0, '白酒', 'https://cdn.czjy.com/product/category.png', NULL, NULL);
INSERT INTO `pms_product_category` VALUES (2, 1, 1, '特供酒', 'https://cdn.czjy.com/product/cso.png', NULL, NULL);
INSERT INTO `pms_product_category` VALUES (3, 1, 1, '大缸酒', 'https://cdn.czjy.com/product/cjars.png', NULL, NULL);
INSERT INTO `pms_product_category` VALUES (4, 1, 1, '明星酒', 'https://cdn.czjy.com/product/cstar.png', NULL, NULL);
INSERT INTO `pms_product_category` VALUES (5, 1, 1, '节日酒', 'https://cdn.czjy.com/product/choliday.png', NULL, NULL);


-- 商品属性
-- ----------------------------
-- Table structure for pms_product_attribute
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_attribute`;
CREATE TABLE `pms_product_attribute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='商品属性参数表';

-- ----------------------------
-- Records of pms_product_attribute
-- ----------------------------
INSERT INTO `pms_product_attribute` VALUES (1, '产地');
INSERT INTO `pms_product_attribute` VALUES (2, '香型');
INSERT INTO `pms_product_attribute` VALUES (3, '酒精度');
INSERT INTO `pms_product_attribute` VALUES (4, '包装');
INSERT INTO `pms_product_attribute` VALUES (5, '重量');
INSERT INTO `pms_product_attribute` VALUES (6, '容量');



-- 商品属性信息
-- ----------------------------
-- Table structure for pms_product_attribute_value
-- ----------------------------
DROP TABLE IF EXISTS `pms_product_attribute_value`;
CREATE TABLE `pms_product_attribute_value` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` bigint(20) DEFAULT NULL,
  `product_attribute_id` bigint(20) DEFAULT NULL,
  `value` varchar(64) DEFAULT NULL COMMENT '手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='存储商品参数信息的表';

-- ----------------------------
-- Records of pms_product_attribute
-- ----------------------------
-- 特供酒属性值
INSERT INTO `pms_product_attribute_value` VALUES (1, 1, 1, '四川');
INSERT INTO `pms_product_attribute_value` VALUES (2, 1, 2, '酱香型');
INSERT INTO `pms_product_attribute_value` VALUES (3, 1, 1, '57');
INSERT INTO `pms_product_attribute_value` VALUES (4, 1, 2, '整箱装');
INSERT INTO `pms_product_attribute_value` VALUES (5, 1, 1, '2000g');
INSERT INTO `pms_product_attribute_value` VALUES (6, 1, 2, '500ml*6瓶');
-- 大缸酒属性值
INSERT INTO `pms_product_attribute_value` VALUES (7, 2, 1, '贵州');
INSERT INTO `pms_product_attribute_value` VALUES (8, 2, 2, '浓香型');
INSERT INTO `pms_product_attribute_value` VALUES (9, 2, 1, '57');
INSERT INTO `pms_product_attribute_value` VALUES (10, 2, 2, '坛装');
INSERT INTO `pms_product_attribute_value` VALUES (11, 2, 1, '4000g');
INSERT INTO `pms_product_attribute_value` VALUES (12, 2, 2, '4000ml*1坛');
-- 明星酒属性值
INSERT INTO `pms_product_attribute_value` VALUES (13, 3, 1, '云南');
INSERT INTO `pms_product_attribute_value` VALUES (14, 3, 2, '清香型');
INSERT INTO `pms_product_attribute_value` VALUES (15, 3, 1, '57');
INSERT INTO `pms_product_attribute_value` VALUES (16, 3, 2, '瓶装');
INSERT INTO `pms_product_attribute_value` VALUES (17, 3, 1, '500g');
INSERT INTO `pms_product_attribute_value` VALUES (18, 3, 2, '500ml*1瓶');
-- 假日酒属性值
INSERT INTO `pms_product_attribute_value` VALUES (19, 4, 1, '西藏');
INSERT INTO `pms_product_attribute_value` VALUES (20, 4, 2, '米香型');
INSERT INTO `pms_product_attribute_value` VALUES (21, 4, 1, '57');
INSERT INTO `pms_product_attribute_value` VALUES (22, 4, 2, '瓶装');
INSERT INTO `pms_product_attribute_value` VALUES (23, 4, 1, '500g');
INSERT INTO `pms_product_attribute_value` VALUES (24, 4, 2, '500ml*1瓶');








-- -- 商品状态
-- -- ----------------------------
-- -- Table structure for pms_product_state
-- -- ----------------------------
-- DROP TABLE IF EXISTS `pms_product_state`;
-- CREATE TABLE `pms_product_state` (
--   `id` bigint(20) NOT NULL AUTO_INCREMENT,
--   `name` varchar(64) DEFAULT NULL,
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='商品状态';
--
-- -- ----------------------------
-- -- Records of pms_product_state
-- -- ----------------------------
-- INSERT INTO `pms_product_state` VALUES('1', '正常');
-- INSERT INTO `pms_product_state` VALUES('2', '拍卖中');
-- INSERT INTO `pms_product_state` VALUES('3', '赠送中');
--
--
--
-- -- 商品服务
-- -- ----------------------------
-- -- Table structure for pms_product_service
-- -- ----------------------------
-- DROP TABLE IF EXISTS `pms_product_service`;
-- CREATE TABLE `pms_product_service` (
--   `id` bigint(20) NOT NULL AUTO_INCREMENT,
--   `name` varchar(64) DEFAULT NULL,
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='商品服务';
--
-- -- ----------------------------
-- -- Records of pms_product_service
-- -- ----------------------------
-- INSERT INTO `pms_product_service` VALUES('1', '拍卖');
-- INSERT INTO `pms_product_service` VALUES('2', '赠送');
-- INSERT INTO `pms_product_service` VALUES('3', '回购');
-- INSERT INTO `pms_product_service` VALUES('4', '提货');
-- INSERT INTO `pms_product_service` VALUES('5', '退货');


