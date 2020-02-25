/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50624
 Source Host           : localhost:3306
 Source Schema         : technologyforum

 Target Server Type    : MySQL
 Target Server Version : 50624
 File Encoding         : 65001

 Date: 25/02/2020 23:32:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_announce
-- ----------------------------
DROP TABLE IF EXISTS `t_announce`;
CREATE TABLE `t_announce`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_sender_user_id` bigint(20) NOT NULL,
  `c_content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_announce_user
-- ----------------------------
DROP TABLE IF EXISTS `t_announce_user`;
CREATE TABLE `t_announce_user`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_announce_id` bigint(20) NOT NULL,
  `n_receive_user_id` bigint(20) NOT NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL,
  `n_state` int(255) NULL DEFAULT NULL,
  `d_read_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_keep
-- ----------------------------
DROP TABLE IF EXISTS `t_keep`;
CREATE TABLE `t_keep`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_user_id` bigint(20) NULL DEFAULT NULL,
  `n_theme_id` bigint(20) NULL DEFAULT NULL,
  `d_keep_time` datetime(0) NULL DEFAULT NULL,
  `n_type` int(255) NULL DEFAULT NULL COMMENT '收藏类型（主题，节点）',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_notify
-- ----------------------------
DROP TABLE IF EXISTS `t_notify`;
CREATE TABLE `t_notify`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_send_user_id` bigint(20) NULL DEFAULT NULL,
  `n_notify_type` int(255) NULL DEFAULT NULL,
  `n_receive_user_id` int(11) NULL DEFAULT NULL,
  `b_status` bit(1) NULL DEFAULT NULL COMMENT '已读未读',
  `d_create_time` datetime(0) NULL DEFAULT NULL,
  `d_read_time` datetime(0) NULL DEFAULT NULL,
  `c_message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_right
-- ----------------------------
DROP TABLE IF EXISTS `t_right`;
CREATE TABLE `t_right`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_right_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `n_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_role_right
-- ----------------------------
DROP TABLE IF EXISTS `t_role_right`;
CREATE TABLE `t_role_right`  (
  `n_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_role_id` int(11) NULL DEFAULT NULL,
  `n_right_id` int(11) NULL DEFAULT NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_theme
-- ----------------------------
DROP TABLE IF EXISTS `t_theme`;
CREATE TABLE `t_theme`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_user_id` bigint(20) NOT NULL,
  `c_theme_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_theme_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `n_theme_class` int(255) NULL DEFAULT NULL COMMENT '主题类型',
  `d_create_time` datetime(0) NOT NULL,
  `d_lastupdate_time` datetime(0) NULL DEFAULT NULL,
  `n_click` bigint(20) NULL DEFAULT 0 COMMENT '点击数',
  `n_theme_status` int(255) NULL DEFAULT 1 COMMENT '主题状态（正常，删除，隐藏）',
  `n_keep_count` int(255) NULL DEFAULT 0 COMMENT '收藏数',
  `n_like` int(255) NULL DEFAULT 0 COMMENT '点赞',
  `n_dislike` int(255) NULL DEFAULT 0 COMMENT '点踩',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_theme
-- ----------------------------
INSERT INTO `t_theme` VALUES (1, 1, '测试_title', '测试_content', 3, '2020-02-08 12:30:00', '2020-02-08 12:30:00', 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (2, 1, 'test_tile', 'test_content', 3, '2020-02-08 13:00:00', '2020-02-08 13:00:00', 0, 1, 0, 0, 0);

-- ----------------------------
-- Table structure for t_theme_class
-- ----------------------------
DROP TABLE IF EXISTS `t_theme_class`;
CREATE TABLE `t_theme_class`  (
  `n_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_parentid` int(11) NULL DEFAULT NULL,
  `n_depth` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '1代表根分类',
  `c_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `n_order` int(11) NULL DEFAULT NULL,
  `b_enable` bit(1) NULL DEFAULT NULL,
  `d_createtime` datetime(0) NULL DEFAULT NULL,
  `c_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_router` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '路由',
  `c_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_theme_class
-- ----------------------------
INSERT INTO `t_theme_class` VALUES (1, NULL, '1', 'Geek', 1, b'1', '2020-02-01 19:30:00', NULL, NULL, 'tech', 'tabs');
INSERT INTO `t_theme_class` VALUES (2, NULL, '1', '分享与探索', 2, b'1', '2020-02-01 19:30:00', NULL, NULL, 'creative', 'tabs');
INSERT INTO `t_theme_class` VALUES (3, 1, '2', '程序员', 1, b'1', '2020-02-01 19:30:00', 'While code monkeys are not eating bananas, they\'re coding.', NULL, 'programmer', 'node');
INSERT INTO `t_theme_class` VALUES (4, 7, '2', 'Python', 2, b'1', '2020-02-01 19:30:00', NULL, NULL, 'python', 'node');
INSERT INTO `t_theme_class` VALUES (5, 2, '2', '分享创造', 1, b'1', '2020-02-01 19:30:00', NULL, NULL, 'create', 'node');
INSERT INTO `t_theme_class` VALUES (6, 2, '2', '设计', 2, b'1', '2020-02-01 19:30:00', NULL, NULL, 'design', 'node');
INSERT INTO `t_theme_class` VALUES (7, NULL, '1', '编程语言', 3, b'1', '2020-02-01 19:30:00', NULL, NULL, 'programminglanguage', 'tabs');

-- ----------------------------
-- Table structure for t_theme_reply
-- ----------------------------
DROP TABLE IF EXISTS `t_theme_reply`;
CREATE TABLE `t_theme_reply`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_theme_id` bigint(20) NOT NULL,
  `n_user_id` bigint(20) NOT NULL,
  `c_reply_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `n_like_count` int(255) NULL DEFAULT 0,
  `d_reply_time` datetime(0) NULL DEFAULT NULL,
  `d_lastupdate_time` datetime(0) NULL DEFAULT NULL,
  `n_index` int(255) NULL DEFAULT NULL,
  `n_reply_type` int(255) NULL DEFAULT NULL COMMENT '(回复楼主,回复别人的帖子)',
  `n_reply_id` bigint(20) NULL DEFAULT NULL COMMENT '如果回复别人的帖子，这个字段存帖子id',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_theme_reply
-- ----------------------------
INSERT INTO `t_theme_reply` VALUES (1, 1, 1, '回复测试', 0, '2020-02-04 12:30:00', '2020-02-04 12:30:00', 1, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (2, 1, 1, '回复测试2', 0, '2020-02-04 12:30:02', '2020-02-04 12:30:02', 2, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (3, 2, 1, '第二条主题回复', 0, '2020-02-04 13:00:56', '2020-02-04 13:00:56', 1, NULL, NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `c_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `c_salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `c_email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `n_sex` int(255) NULL DEFAULT NULL,
  `c_telephone` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_personal_website` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `c_company` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所在公司',
  `c_position` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位',
  `c_location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所在地',
  `c_signature` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '签名',
  `c_personal_introduction` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '个人简介',
  `c_avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `n_coin` int(255) NULL DEFAULT NULL COMMENT '硬币数量',
  `d_create_time` datetime(0) NOT NULL,
  `d_update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE,
  INDEX `index_id`(`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', '123', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', 0, '2020-02-04 12:30:00', '2020-02-04 12:30:00');
INSERT INTO `t_user` VALUES (2, 'root', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-02-16 15:13:47', NULL);
INSERT INTO `t_user` VALUES (3, 'test1', 'c107a81e9a5c6e40ffea3130a5881f94', '59b79cb8418941c9506b65d69d4ba90a', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-02-18 14:09:48', NULL);

-- ----------------------------
-- Table structure for t_user_relation
-- ----------------------------
DROP TABLE IF EXISTS `t_user_relation`;
CREATE TABLE `t_user_relation`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `n_user_id` bigint(20) NULL DEFAULT NULL,
  `n_relation_user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_type` bit(1) NULL DEFAULT NULL COMMENT '关注或者屏蔽',
  `d_create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
