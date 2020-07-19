/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : technologyforum

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 13/07/2020 22:35:05
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
  `c_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_keep_node
-- ----------------------------
DROP TABLE IF EXISTS `t_keep_node`;
CREATE TABLE `t_keep_node`  (
  `c_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '主键id',
  `n_user_id` bigint(20) NOT NULL COMMENT '用户id',
  `n_node_id` bigint(20) NOT NULL COMMENT '收藏的节点id',
  `d_keep_time` datetime(0) NOT NULL COMMENT '收藏时间',
  PRIMARY KEY (`n_user_id`, `n_node_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_keep_node
-- ----------------------------
INSERT INTO `t_keep_node` VALUES ('676feed45efa4911b93834bd11472dd8', 2, 3, '2020-04-05 15:31:45');
INSERT INTO `t_keep_node` VALUES ('ce2d8f9b85c04f4788a9653144b76e40', 2, 11, '2020-04-26 14:51:18');
INSERT INTO `t_keep_node` VALUES ('1a803e33d8fc42a78f5df1b9f35924c0', 18, 4, '2020-05-23 11:37:48');
INSERT INTO `t_keep_node` VALUES ('a7f93b98825e4409ba9c6405d36855d1', 19, 3, '2020-05-23 11:42:07');
INSERT INTO `t_keep_node` VALUES ('ca17ecf1217640dfadcfecdbab9a1ca7', 22, 3, '2020-05-23 14:04:52');

-- ----------------------------
-- Table structure for t_keep_theme
-- ----------------------------
DROP TABLE IF EXISTS `t_keep_theme`;
CREATE TABLE `t_keep_theme`  (
  `c_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '主键id',
  `n_user_id` bigint(20) NOT NULL COMMENT '用户id',
  `n_theme_id` bigint(20) NOT NULL COMMENT '收藏的主题id',
  `d_keep_time` datetime(0) NOT NULL COMMENT '收藏时间',
  PRIMARY KEY (`n_user_id`, `n_theme_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_keep_theme
-- ----------------------------
INSERT INTO `t_keep_theme` VALUES ('e5c1861b39524444b8f1100055aeecc9', 2, 3, '2020-04-05 14:50:55');
INSERT INTO `t_keep_theme` VALUES ('632f4a127b1c45268bd38113d84601b9', 13, 19, '2020-05-23 08:09:57');
INSERT INTO `t_keep_theme` VALUES ('2c47d30a610b48b4bdade1f85bd329e9', 18, 12, '2020-05-23 11:36:50');
INSERT INTO `t_keep_theme` VALUES ('595e2219f9b8423aa83a48cafb7f3e2b', 19, 12, '2020-05-23 11:41:07');
INSERT INTO `t_keep_theme` VALUES ('edb081c9919a43cf9ea184a33a358ace', 20, 8, '2020-05-23 13:55:47');
INSERT INTO `t_keep_theme` VALUES ('2c5c6364597f4c2a8a40cd5f828bd35a', 21, 8, '2020-05-23 13:59:03');
INSERT INTO `t_keep_theme` VALUES ('ec51ba0560eb440884894836927fd6ee', 22, 3, '2020-05-23 14:03:43');

-- ----------------------------
-- Table structure for t_log
-- ----------------------------
DROP TABLE IF EXISTS `t_log`;
CREATE TABLE `t_log`  (
  `n_id` int(11) NOT NULL,
  `n_user_id` bigint(20) NULL DEFAULT NULL,
  `c_log` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `d_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_notify
-- ----------------------------
DROP TABLE IF EXISTS `t_notify`;
CREATE TABLE `t_notify`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `n_send_user_id` bigint(20) NULL DEFAULT NULL COMMENT '发送用户id',
  `n_notify_type` int(255) NULL DEFAULT NULL COMMENT '1.主题@，2.主题回复',
  `n_receive_user_id` bigint(20) NULL DEFAULT NULL COMMENT '接收用户id',
  `b_status` bit(1) NULL DEFAULT b'0' COMMENT '已读：1未读：0',
  `d_create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `d_read_time` datetime(0) NULL DEFAULT NULL COMMENT '阅读时间',
  `c_message` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '消息内容',
  `n_theme_id` bigint(20) NOT NULL COMMENT '主题id',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_notify
-- ----------------------------
INSERT INTO `t_notify` VALUES (1, 2, 1, 1, b'1', '2020-03-16 16:12:17', '2020-05-23 14:05:22', '1', 1);
INSERT INTO `t_notify` VALUES (2, 2, 1, 4, b'1', '2020-05-04 01:16:28', '2020-05-23 14:00:27', '8', 8);
INSERT INTO `t_notify` VALUES (3, 2, 1, 4, b'1', '2020-05-04 01:25:17', '2020-05-23 14:00:27', '8', 8);
INSERT INTO `t_notify` VALUES (4, 2, 1, 1, b'1', '2020-03-16 16:12:17', '2020-05-23 14:05:22', '1', 1);
INSERT INTO `t_notify` VALUES (5, 1, 1, 4, b'1', '2020-05-05 01:41:57', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (6, 1, 1, 4, b'1', '2020-05-05 01:42:04', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (7, 1, 1, 4, b'1', '2020-05-05 01:42:07', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (8, 1, 1, 4, b'1', '2020-05-05 01:42:11', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (9, 1, 1, 4, b'1', '2020-05-05 01:42:14', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (10, 1, 1, 4, b'1', '2020-05-05 01:42:18', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (11, 1, 1, 4, b'1', '2020-05-05 01:42:21', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (12, 1, 1, 4, b'1', '2020-05-05 01:42:25', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (13, 1, 1, 4, b'1', '2020-05-05 01:42:28', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (14, 1, 1, 4, b'1', '2020-05-05 01:42:39', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (15, 1, 1, 4, b'1', '2020-05-05 01:42:42', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (16, 1, 1, 4, b'1', '2020-05-05 01:42:59', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (17, 1, 1, 4, b'1', '2020-05-05 01:43:01', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (18, 1, 1, 4, b'1', '2020-05-05 01:43:04', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (19, 1, 1, 4, b'1', '2020-05-05 01:43:06', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (20, 1, 1, 4, b'1', '2020-05-05 01:43:09', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (21, 1, 1, 4, b'1', '2020-05-05 01:43:38', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (22, 1, 1, 4, b'1', '2020-05-05 01:43:40', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (23, 1, 1, 4, b'1', '2020-05-05 01:43:43', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (24, 1, 1, 4, b'1', '2020-05-05 01:43:45', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (25, 1, 1, 4, b'1', '2020-05-05 01:43:48', '2020-05-23 14:00:27', '4', 4);
INSERT INTO `t_notify` VALUES (26, 13, 1, 12, b'1', '2020-05-23 08:32:55', '2020-05-23 08:35:32', '19', 19);
INSERT INTO `t_notify` VALUES (27, 13, 1, 12, b'1', '2020-05-23 08:33:02', '2020-05-23 08:35:32', '19', 19);
INSERT INTO `t_notify` VALUES (28, 15, 2, 9, b'0', '2020-05-23 11:31:27', NULL, '12', 12);
INSERT INTO `t_notify` VALUES (29, 18, 2, 9, b'0', '2020-05-23 11:36:33', NULL, '12', 12);
INSERT INTO `t_notify` VALUES (30, 9, 1, NULL, b'0', '2020-05-23 11:36:42', NULL, '12', 12);
INSERT INTO `t_notify` VALUES (31, 18, 2, 9, b'0', '2020-05-23 11:36:42', NULL, '12', 12);
INSERT INTO `t_notify` VALUES (32, 19, 2, 9, b'0', '2020-05-23 11:40:52', NULL, '12', 12);
INSERT INTO `t_notify` VALUES (33, 9, 1, NULL, b'0', '2020-05-23 11:40:59', NULL, '12', 12);
INSERT INTO `t_notify` VALUES (34, 19, 2, 9, b'0', '2020-05-23 11:40:59', NULL, '12', 12);
INSERT INTO `t_notify` VALUES (35, 20, 2, 4, b'1', '2020-05-23 13:55:30', '2020-05-23 14:00:27', '8', 8);
INSERT INTO `t_notify` VALUES (36, 2, 1, NULL, b'0', '2020-05-23 13:55:39', NULL, '8', 8);
INSERT INTO `t_notify` VALUES (37, 20, 2, 4, b'1', '2020-05-23 13:55:39', '2020-05-23 14:00:27', '8', 8);
INSERT INTO `t_notify` VALUES (38, 21, 2, 4, b'1', '2020-05-23 13:58:48', '2020-05-23 14:00:27', '8', 8);
INSERT INTO `t_notify` VALUES (39, 2, 1, NULL, b'0', '2020-05-23 13:58:57', NULL, '8', 8);
INSERT INTO `t_notify` VALUES (40, 21, 2, 4, b'1', '2020-05-23 13:58:57', '2020-05-23 14:00:27', '8', 8);
INSERT INTO `t_notify` VALUES (41, 22, 2, 1, b'1', '2020-05-23 14:03:29', '2020-05-23 14:05:22', '3', 3);
INSERT INTO `t_notify` VALUES (42, 1, 1, NULL, b'0', '2020-05-23 14:03:37', NULL, '3', 3);
INSERT INTO `t_notify` VALUES (43, 22, 2, 1, b'1', '2020-05-23 14:03:37', '2020-05-23 14:05:22', '3', 3);

-- ----------------------------
-- Table structure for t_right
-- ----------------------------
DROP TABLE IF EXISTS `t_right`;
CREATE TABLE `t_right`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_right_value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `c_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `n_pid` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_right
-- ----------------------------
INSERT INTO `t_right` VALUES (1, 'sys.htgl', '后台管理', '2020-07-13 21:41:11', 0);
INSERT INTO `t_right` VALUES (2, 'sys.htgl.yhgl', '用户管理', '2020-07-13 21:41:14', 1);
INSERT INTO `t_right` VALUES (3, 'sys.htgl.ztgl', '主题管理', '2020-07-13 21:41:15', 1);
INSERT INTO `t_right` VALUES (4, 'sys.htgl.qxgl', '权限管理', '2020-07-13 21:41:17', 1);
INSERT INTO `t_right` VALUES (5, 'sys.qtgl', '前台管理', '2020-07-13 21:41:19', 0);
INSERT INTO `t_right` VALUES (6, 'sys.qtgl.fjyh', '封禁用户', '2020-07-13 21:41:22', 5);
INSERT INTO `t_right` VALUES (7, 'sys.qtgl.yczt', '隐藏主题', '2020-07-13 21:41:24', 5);

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `n_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1, '管理员', '2020-06-08 12:30:00');
INSERT INTO `t_role` VALUES (2, '版主', '2020-06-08 12:30:00');

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
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role_right
-- ----------------------------
INSERT INTO `t_role_right` VALUES (1, 1, 1, '2020-06-08 12:30:00');
INSERT INTO `t_role_right` VALUES (2, 1, 2, '2020-06-08 12:30:00');
INSERT INTO `t_role_right` VALUES (3, 1, 3, '2020-06-08 12:30:00');
INSERT INTO `t_role_right` VALUES (4, 1, 4, '2020-06-08 12:30:00');
INSERT INTO `t_role_right` VALUES (5, 1, 5, '2020-06-08 12:30:00');
INSERT INTO `t_role_right` VALUES (6, 1, 6, '2020-06-08 12:30:00');
INSERT INTO `t_role_right` VALUES (7, 1, 7, '2020-06-08 12:30:00');
INSERT INTO `t_role_right` VALUES (8, 2, 6, '2020-06-08 12:30:00');
INSERT INTO `t_role_right` VALUES (9, 2, 7, '2020-06-08 12:30:00');

-- ----------------------------
-- Table structure for t_theme
-- ----------------------------
DROP TABLE IF EXISTS `t_theme`;
CREATE TABLE `t_theme`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `n_user_id` bigint(20) NOT NULL COMMENT '发表主题用户id',
  `c_theme_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '主题标题',
  `c_theme_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '主题内容',
  `n_theme_class` int(255) NULL DEFAULT NULL COMMENT '主题类型',
  `d_create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `d_lastupdate_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `n_click` bigint(20) NULL DEFAULT 0 COMMENT '点击数',
  `n_theme_status` int(255) NULL DEFAULT 1 COMMENT '主题状态（正常，删除，隐藏）',
  `n_keep_count` int(255) NULL DEFAULT 0 COMMENT '收藏数',
  `n_like` int(255) NULL DEFAULT 0 COMMENT '点赞',
  `n_dislike` int(255) NULL DEFAULT 0 COMMENT '点踩',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_theme
-- ----------------------------
INSERT INTO `t_theme` VALUES (1, 1, '测试_title', '测试_content', 3, '2020-02-08 12:30:00', '2020-02-08 12:30:00', 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (2, 1, 'test_tile', 'test_content', 4, '2020-02-08 13:00:00', '2020-02-08 13:00:00', 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (3, 1, '无回复测试', '俄式内容', 3, '2020-03-09 21:36:00', '2020-03-09 21:36:00', 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (4, 4, '个人网站的前途，是继续还是放弃？', '<p><span style=\"font-size: 14px; background-color: #ffffff;\">小弟好几年前做了一个小网站，内容是关于软件介绍和限免介绍的，一直都不温不火。前几天刚好出意外，丢失了最近一年的数据，尽管现在恢复了，但感觉好像也没有什么太大的动力去更新了。同类的网站、软件也有不少放弃了这一方面的更新，现在更多的是一种热爱或者说放不下的心态去做。再加上目前主要工作做得也不顺心，所以对这个还是有点犹豫。想听听大家的看法，谢谢。</span></p>', 14, '2020-04-27 00:33:47', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (5, 4, '放弃保研直接就业还是继续读研？', '<h1 style=\"font-size: 24px; font-weight: 500; line-height: 36px; padding: 0px; word-break: break-word; background-color: #ffffff; margin: 0px !important 0px 10px 0px;\">先介绍一下自己的情况。</h1>\n<ul style=\"margin: 15px 0px 15px 20px; padding: 0px; font-size: 14px; background-color: #ffffff;\">\n<li style=\"padding: 0px; margin: 0px;\">本科照顾性 211 的 cs 专业，保研到挂牌某 985 的学院（学院被合并前是一本线过一些的水平，但是当时不知道。至于为什么保送到这个学院，是因为我当时没得选择，走的补偿名额，只能去这个学院，否则就必须直接工作）</li>\n<li style=\"padding: 0px; margin: 0px;\">家庭条件不好，父母是农民，且自己年龄较大，今年 25 岁（以前年轻不懂事高中辍学过 3 年）</li>\n<li style=\"padding: 0px; margin: 0px;\">因为大学前三年一直争取保研名额，所以没有朝就业方向努力过，会 HTML CSS JS JQUERY JAVA 后端 Python(仅限于完成学校内课程设计的水平）。</li>\n</ul>', 14, '2020-04-27 11:16:44', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (6, 4, '小米 10 青春版香不香？', '<h1 style=\"font-size: 24px; font-weight: 500; line-height: 36px; padding: 0px; word-break: break-word; background-color: #ffffff; margin: 0px !important 0px 10px 0px;\"><span style=\"font-size: 14px;\">rt，大佬来分析下呢</span></h1>', 14, '2020-04-27 11:17:41', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (7, 4, '这个五一，你准备去哪里', '<p><span style=\"font-size: 14px; background-color: #ffffff;\">临近五一，又要开始考虑怎么度过这个假期了。</span></p>', 14, '2020-04-27 12:30:56', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (8, 4, '请教大家,远程办公相关有什么比较方便的方案吗', '<p><span style=\"font-size: 14px; background-color: #ffffff;\">今年因为疫情,很多时候都是在家办公的,但是楼主公司数据库和代码都是托管在内网服务器上的,所以一直都是用 teamview 或者向日葵连接公司电脑进行开发.但是因为带宽的关系,使用体验都非常差.所以想问问大家用什么免费便捷的方案,主力需求其实也只需要在外网访问数据库和 svn 就可以了.</span></p>', 3, '2020-04-27 13:09:29', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (9, 9, '隐藏文件的读卡器', '<p><span style=\"font-size: 14px; background-color: #ffffff;\">做了一个读卡器，储存卡放到这个里面，就能看到文件；用其他普通读卡器，看不到文件，嘿嘿。</span></p>', 6, '2020-04-27 13:58:35', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (10, 9, '一个以终结所有导航网站为目标的工具 - 酷书签', '<p style=\"font-size: 14px; background-color: #ffffff; margin-top: 0px !important;\">看到 V 站上好多做导航网站的小伙伴。</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">不知道是因为导航站做起来简单，新学习编程的同学拿它来练手，还是说导航网站确实对很多人来说有很强的需求。</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">但是导航不是应该天然是由浏览器书签来管理的吗？</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">做导航站的小伙伴是不是还得有个后台一个个去添加导航链接呢？</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">还有小伙伴说了，书签只能自己用，要分享给别人。</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">嗯，说的有道理，我觉得今天介绍的这个小工具&nbsp;<strong>不仅可以通过浏览器书签来管理你的导航链接，还能把你指定的浏览器书签目录展示成一个导航网站</strong></p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">一个真正意义上：属于自己的、完全无广告的 导航网站，<strong>无需注册登录</strong>，总之你们反感的东西统统没有。</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">目前只是完成了一个初版，后面更好用的功能持续添加中，先看看大家的反馈。</p>', 6, '2020-04-27 13:59:01', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (11, 9, '请问有电影海报原画的网站么？', '<p style=\"font-size: 14px; background-color: #ffffff; margin-top: 0px !important;\">想找迪士尼的海报自己家里用，有这类网站么</p>', 6, '2020-04-27 13:59:41', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (12, 9, '你听过多少种版本的《笑傲江湖》？', '<p style=\"font-size: 14px; background-color: #ffffff; margin-top: 0px !important;\">前几天重温了一下电影《笑傲江湖》，1990 版的，许冠杰主演。</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">有人说这部电影太散乱，而我觉得恰到好处，人在江湖，不就应是如此：每天风尘仆仆，下一刻会发生什么，难以预料。</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">&nbsp;</p>', 5, '2020-04-27 14:00:14', NULL, 0, 1, 0, 0, 0);
INSERT INTO `t_theme` VALUES (13, 2, '主题跳转', '<p>123</p>', 10, '2020-05-03 14:16:47', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (14, 2, '主题跳转2', '<p>12345</p>', 10, '2020-05-03 14:18:01', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (15, 2, 'mysql，关于模糊查询百分号放在前面，索引的使用问题，求教！', '<p style=\"font-size: 14px; background-color: #ffffff; margin-top: 0px !important;\">之前有了解到，即使查询条件字段有设置索引，在使用模糊查询的时候，将百分号放在前面，也是无法触发索引的。</p>\n<p style=\"font-size: 14px; background-color: #ffffff;\">select region from user where name like \'%908\';</p>\n<p style=\"font-size: 14px; background-color: #ffffff; margin-bottom: 0px !important;\">那如果说，我希望能够这么进行模糊查询，同时还可以使用 name 的索引，可以实现吗？</p>', 14, '2020-05-03 14:24:03', NULL, 0, 2, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (16, 2, '找人', '<p><span style=\"font-size: 14px; background-color: #ffffff;\">想找个在大厂工作的程序员很难吗？最好是非前端的。本人前端工程师。</span></p>', 14, '2020-05-03 15:25:25', NULL, 0, 2, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (17, 12, '小白用 Linux 用哪个好，既能折腾，又能傻瓜式使用，而且稳定？', '<p style=\"font-family: \'helvetica neue\', \'luxi sans\', \'dejavu sans\', \'segoe ui\', \'hiragino sans gb\', \'microsoft yahei\', sans-serif; font-size: 14px; background-color: #ffffff; margin-top: 0px !important;\">如题，小白用 linux 用哪个好，既能折腾命令行，又能像个傻瓜一样用鼠标点点点就能使用，而且稳定，生态好。这方面有哪些具备呢？</p>\n<p style=\"font-family: \'helvetica neue\', \'luxi sans\', \'dejavu sans\', \'segoe ui\', \'hiragino sans gb\', \'microsoft yahei\', sans-serif; font-size: 14px; background-color: #ffffff; margin-bottom: 0px !important;\">关于 linux 桌面方面，我知道比较热门的友邦图，这个就不用说了。</p>', 8, '2020-05-23 07:53:43', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (18, 12, 'alpine Linux 跑 docker？', '<p><span style=\"font-family: \'helvetica neue\', \'luxi sans\', \'dejavu sans\', \'segoe ui\', \'hiragino sans gb\', \'microsoft yahei\', sans-serif; font-size: 14px; background-color: #ffffff;\">据说 alpine Linux 的 libc 不标准？那我 docker 装好了，上面拉下来的镜像和 alpine Linux 还有关系吗，这种组合有啥不稳定的吗</span></p>', 8, '2020-05-23 07:56:17', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (19, 12, 'Debian10 的 iptables redirect 规则', '<p style=\"font-family: \'helvetica neue\', \'luxi sans\', \'dejavu sans\', \'segoe ui\', \'hiragino sans gb\', \'microsoft yahei\', sans-serif; font-size: 14px; background-color: #ffffff; margin-top: 0px !important;\">我想实现的规则是, 主机 A(vmware 虚拟机, debian10) 有一个监听 127.0.0.1:8080 的服务, 我想主机 B (宿主机)能够访问 A 的服务</p>\n<pre style=\"font-family: Consolas, \'panic sans\', \'dejavu sans mono\', \'bitstream vera sans mono\', Menlo, \'microsoft yahei\', monospace; font-size: 13px; letter-spacing: 0.015em; line-height: 15.6px; overflow: auto; background-color: #f5f5f5; padding: 0.5em;\"><code class=\"language-sh hljs bash\" style=\"font-family: Consolas, \'panic sans\', \'dejavu sans mono\', \'bitstream vera sans mono\', Menlo, \'microsoft yahei\', monospace; white-space: pre-wrap; display: block; overflow-x: auto; color: #4d4d4c;\">iptables -t nat -A PREROUTING -d &lt;主机 A 的外网地址&gt; -p tcp --dport 30000 -j REDIRECT --to-ports 8080\n\niptables -t nat -A OUTPUT -d &lt;主机 A 的外网地址&gt; -p tcp --dport 30000 -j REDIRECT --to-ports 8080\n\nsysctl -w net.ipv4.conf.all.route_localnet=1\n</code></pre>\n<p style=\"font-family: \'helvetica neue\', \'luxi sans\', \'dejavu sans\', \'segoe ui\', \'hiragino sans gb\', \'microsoft yahei\', sans-serif; font-size: 14px; background-color: #ffffff;\">失败, 我又尝试了 DNAT 的规则</p>\n<pre style=\"font-family: Consolas, \'panic sans\', \'dejavu sans mono\', \'bitstream vera sans mono\', Menlo, \'microsoft yahei\', monospace; font-size: 13px; letter-spacing: 0.015em; line-height: 15.6px; overflow: auto; background-color: #f5f5f5; padding: 0.5em;\"><code class=\"language-sh hljs bash\" style=\"font-family: Consolas, \'panic sans\', \'dejavu sans mono\', \'bitstream vera sans mono\', Menlo, \'microsoft yahei\', monospace; white-space: pre-wrap; display: block; overflow-x: auto; color: #4d4d4c;\">iptables -t nat -A PREROUTING -d &lt;主机 A 的外网地址&gt; -p tcp --dport 30000 -j DNAT --to-destination 127.0.0.1:8080\n</code></pre>\n<p style=\"font-family: \'helvetica neue\', \'luxi sans\', \'dejavu sans\', \'segoe ui\', \'hiragino sans gb\', \'microsoft yahei\', sans-serif; font-size: 14px; background-color: #ffffff; margin-bottom: 0px !important;\">依然失败, 我之前在公司的 ubuntu 16.04 上实现过是成功的, 但现在在虚拟机上是失败的, 是否和 debian10 nftables 有关, debian10 上现在默认 iptables 规则会转换好像, 有相关经验的吗?</p>', 8, '2020-05-23 08:01:36', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (20, 18, '主题', '<p>内容</p>', 14, '2020-05-23 11:37:20', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (21, 19, '测试主题', '<p>测试内容</p>', 6, '2020-05-23 11:41:42', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (22, 20, 'java', '<p>javaneitong&nbsp;</p>', 11, '2020-05-23 13:56:13', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (23, 21, '主题', '<p>java真强</p>', 11, '2020-05-23 13:59:49', NULL, 0, 1, 0, NULL, NULL);
INSERT INTO `t_theme` VALUES (24, 22, '主题', '<p>哈哈哈</p>', 14, '2020-05-23 14:04:12', NULL, 0, 1, 0, NULL, NULL);

-- ----------------------------
-- Table structure for t_theme_class
-- ----------------------------
DROP TABLE IF EXISTS `t_theme_class`;
CREATE TABLE `t_theme_class`  (
  `n_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `n_parentid` int(11) NULL DEFAULT NULL COMMENT '父节点id',
  `n_depth` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '1代表根分类',
  `c_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '节点名',
  `n_order` int(11) NULL DEFAULT NULL COMMENT '顺序',
  `b_enable` bit(1) NULL DEFAULT NULL COMMENT '有效、无效',
  `d_createtime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `c_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '描述',
  `c_img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '节点图片',
  `c_router` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '路由',
  `c_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_theme_class
-- ----------------------------
INSERT INTO `t_theme_class` VALUES (1, NULL, '1', 'Geek', 1, b'1', '2020-02-01 19:30:00', NULL, NULL, 'tech', 'tabs');
INSERT INTO `t_theme_class` VALUES (2, NULL, '1', '分享与探索', 2, b'1', '2020-02-01 19:30:00', NULL, NULL, 'creative', 'tabs');
INSERT INTO `t_theme_class` VALUES (3, 1, '2', '程序员', 1, b'1', '2020-02-01 19:30:00', 'While code monkeys are not eating bananas, they\'re coding.', 'https://cdn.v2ex.com/navatar/94f6/d7e0/300_xxlarge.png?m=1584404823', 'programmer', 'node');
INSERT INTO `t_theme_class` VALUES (4, 7, '2', 'Python', 2, b'1', '2020-02-01 19:30:00', '这里讨论各种 Python 语言编程话题，也包括 Django，Tornado 等框架的讨论。这里是一个能够帮助你解决实际问题的地方', 'https://cdn.v2ex.com/navatar/8613/985e/90_xxlarge.png?m=1583128613', 'python', 'node');
INSERT INTO `t_theme_class` VALUES (5, 2, '2', '分享创造', 1, b'1', '2020-02-01 19:30:00', '欢迎你在这里发布自己的最新作品！', 'https://cdn.v2ex.com/navatar/70ef/df2e/17_xxlarge.png?m=1573619934', 'create', 'node');
INSERT INTO `t_theme_class` VALUES (6, 2, '2', '设计', 2, b'1', '2020-02-01 19:30:00', 'show me your design', 'https://cdn.v2ex.com/navatar/3b8a/6142/215_xxlarge.png?m=1523190513', 'design', 'node');
INSERT INTO `t_theme_class` VALUES (7, NULL, '1', '编程语言', 3, b'1', '2020-02-01 19:30:00', NULL, NULL, 'programminglanguage', 'tabs');
INSERT INTO `t_theme_class` VALUES (8, 1, '2', 'Linux', 2, b'1', '2020-04-25 19:30:00', 'Linux，强！！！', 'https://cdn.v2ex.com/navatar/6512/bd43/11_xxlarge.png?m=1586867956', 'linux', 'node');
INSERT INTO `t_theme_class` VALUES (9, 1, '2', 'Apple', 3, b'1', '2020-04-25 19:30:00', '苹果是信仰。', 'https://cdn.v2ex.com/navatar/6cdd/60ea/184_large.png?m=1587133817', 'apple', 'node');
INSERT INTO `t_theme_class` VALUES (10, 1, '2', '机器学习', 4, b'1', '2020-04-25 19:30:00', '机器学习才是未来', 'https://cdn.v2ex.com/navatar/9fe8/593a/678_xxlarge.png?m=1582781582', 'ml', 'node');
INSERT INTO `t_theme_class` VALUES (11, 7, '2', 'Java', 2, b'1', '2020-04-25 19:30:00', 'Java第一', 'https://cdn.v2ex.com/navatar/03af/dbd6/63_large.png?m=1585387556', 'java', 'node');
INSERT INTO `t_theme_class` VALUES (12, 7, '2', 'PHP', 3, b'1', '2020-04-25 19:30:00', 'PHP是世界最好的语言', 'https://cdn.v2ex.com/navatar/44f6/83a8/62_large.png?m=1586833811', 'php', 'node');
INSERT INTO `t_theme_class` VALUES (13, 7, '2', 'Javascript', 4, b'1', '2020-04-25 19:30:00', '万物都会回归Javascript', 'https://cdn.v2ex.com/navatar/a5e0/0132/146_large.png?m=1581996079', 'javascript', 'node');
INSERT INTO `t_theme_class` VALUES (14, 2, '2', '问与答', 2, b'1', '2020-02-01 19:30:00', '直接问', 'https://cdn.v2ex.com/navatar/c20a/d4d7/12_xxlarge.png?m=1587431140', 'question', 'node');

-- ----------------------------
-- Table structure for t_theme_reply
-- ----------------------------
DROP TABLE IF EXISTS `t_theme_reply`;
CREATE TABLE `t_theme_reply`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `n_theme_id` bigint(20) NOT NULL COMMENT '回复主题id',
  `n_user_id` bigint(20) NOT NULL COMMENT '回复用户id',
  `c_reply_content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '回复内容',
  `n_like_count` int(255) NULL DEFAULT 0,
  `d_reply_time` datetime(0) NULL DEFAULT NULL COMMENT '回复时间',
  `d_lastupdate_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `n_index` int(255) NULL DEFAULT NULL,
  `n_reply_type` int(255) NULL DEFAULT NULL COMMENT '(回复楼主,回复别人的帖子)',
  `n_reply_id` bigint(20) NULL DEFAULT NULL COMMENT '如果回复别人的帖子，这个字段存帖子id',
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 50 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_theme_reply
-- ----------------------------
INSERT INTO `t_theme_reply` VALUES (1, 1, 1, '<p>回复测试</p>', 0, '2020-02-04 12:30:00', '2020-02-04 12:30:00', 1, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (2, 1, 1, '<p>回复测试2</p>', 0, '2020-02-04 12:30:02', '2020-02-04 12:30:02', 2, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (3, 2, 1, '<p>第二条主题回复</p>', 0, '2020-02-04 13:00:56', '2020-02-04 13:00:56', 1, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (4, 1, 2, '<p><router-link class=\"mention\" data-mention=\"@admin\" data-user-id=\"1\" to=\"/member/1\">@admin</router-link>测试</p>', NULL, '2020-03-16 16:12:15', '2020-03-16 16:12:15', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (5, 12, 9, '<p>hhh很多种</p>', NULL, '2020-04-27 14:03:31', '2020-04-27 14:03:31', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (6, 3, 1, '<p>回复测试</p>', NULL, '2020-05-03 11:20:34', '2020-05-03 11:20:34', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (7, 3, 1, '<p>e嗯嗯嗯？</p>', NULL, '2020-05-03 11:28:40', '2020-05-03 11:28:40', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (8, 3, 1, '<p>测试2</p>', NULL, '2020-05-03 11:30:10', '2020-05-03 11:30:10', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (9, 8, 2, '<p>teamviewer</p>', NULL, '2020-05-04 01:16:28', '2020-05-04 01:16:28', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (10, 8, 2, '<p>向日葵</p>', NULL, '2020-05-04 01:25:17', '2020-05-04 01:25:17', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (11, 4, 1, '<p>测试1</p>', NULL, '2020-05-05 01:41:57', '2020-05-05 01:41:57', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (12, 4, 1, '<p>h回复2</p>', NULL, '2020-05-05 01:42:04', '2020-05-05 01:42:04', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (13, 4, 1, '<p>hhhh</p>', NULL, '2020-05-05 01:42:07', '2020-05-05 01:42:07', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (14, 4, 1, '<p>看见了</p>', NULL, '2020-05-05 01:42:11', '2020-05-05 01:42:11', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (15, 4, 1, '<p>a阿斯顿</p>', NULL, '2020-05-05 01:42:14', '2020-05-05 01:42:14', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (16, 4, 1, '<p>k恐惧</p>', NULL, '2020-05-05 01:42:18', '2020-05-05 01:42:18', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (17, 4, 1, '<p>iiyuz</p>', NULL, '2020-05-05 01:42:21', '2020-05-05 01:42:21', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (18, 4, 1, '<p>vb</p>', NULL, '2020-05-05 01:42:25', '2020-05-05 01:42:25', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (19, 4, 1, '<p>，没把你</p>', NULL, '2020-05-05 01:42:28', '2020-05-05 01:42:28', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (20, 4, 1, '<p>偶是看</p>', NULL, '2020-05-05 01:42:39', '2020-05-05 01:42:39', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (21, 4, 1, '<p>c呈现出</p>', NULL, '2020-05-05 01:42:42', '2020-05-05 01:42:42', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (22, 4, 1, '<p>阿斯顿</p>', NULL, '2020-05-05 01:42:59', '2020-05-05 01:42:59', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (23, 4, 1, '<p>x形成</p>', NULL, '2020-05-05 01:43:01', '2020-05-05 01:43:01', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (24, 4, 1, '<p>；破</p>', NULL, '2020-05-05 01:43:04', '2020-05-05 01:43:04', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (25, 4, 1, '<p>uuik</p>', NULL, '2020-05-05 01:43:06', '2020-05-05 01:43:06', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (26, 4, 1, '<p>快捷键你那边</p>', NULL, '2020-05-05 01:43:09', '2020-05-05 01:43:09', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (27, 4, 1, '<p>s萨科</p>', NULL, '2020-05-05 01:43:38', '2020-05-05 01:43:38', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (28, 4, 1, '<p>z自行车</p>', NULL, '2020-05-05 01:43:40', '2020-05-05 01:43:40', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (29, 4, 1, '<p>j结合</p>', NULL, '2020-05-05 01:43:43', '2020-05-05 01:43:43', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (30, 4, 1, '<p>南京，</p>', NULL, '2020-05-05 01:43:45', '2020-05-05 01:43:45', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (31, 4, 1, '<p>绕太阳</p>', NULL, '2020-05-05 01:43:48', '2020-05-05 01:43:48', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (32, 19, 13, '<p>委屈饿</p>', NULL, '2020-05-23 08:32:55', '2020-05-23 08:32:55', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (33, 19, 13, '<p><strong>s说的</strong></p>', NULL, '2020-05-23 08:33:02', '2020-05-23 08:33:02', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (34, 12, 15, '<p>weishen</p>', NULL, '2020-05-23 11:31:27', '2020-05-23 11:31:27', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (35, 12, 15, '<p><router-link class=\"mention\" data-mention=\"@sunshine\" data-user-id=\"9\" to=\"/member/9\">@sunshine</router-link> sjdh</p>', NULL, '2020-05-23 11:31:36', '2020-05-23 11:31:36', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (36, 12, 18, '<p>hhhh</p>', NULL, '2020-05-23 11:36:33', '2020-05-23 11:36:33', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (37, 12, 18, '<p><router-link class=\"mention\" data-mention=\"@sunshine\" data-user-id=\"9\" to=\"/member/9\">@sunshine</router-link> sjjj</p>', NULL, '2020-05-23 11:36:42', '2020-05-23 11:36:42', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (38, 20, 18, '<p>手机号</p>', NULL, '2020-05-23 11:37:29', '2020-05-23 11:37:29', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (39, 12, 19, '<p>cccc</p>', NULL, '2020-05-23 11:40:52', '2020-05-23 11:40:52', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (40, 12, 19, '<p><router-link class=\"mention\" data-mention=\"@sunshine\" data-user-id=\"9\" to=\"/member/9\">@sunshine</router-link> cccc</p>', NULL, '2020-05-23 11:40:59', '2020-05-23 11:40:59', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (41, 21, 19, '<p>s是看得见</p>', NULL, '2020-05-23 11:41:50', '2020-05-23 11:41:50', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (42, 8, 20, '<p>xiangrikui</p>', NULL, '2020-05-23 13:55:30', '2020-05-23 13:55:30', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (43, 8, 20, '<p><router-link class=\"mention\" data-mention=\"@root\" data-user-id=\"2\" to=\"/member/2\">@root</router-link> tiuds</p>', NULL, '2020-05-23 13:55:39', '2020-05-23 13:55:39', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (44, 22, 20, '<p>w哇哇哇</p>', NULL, '2020-05-23 13:56:25', '2020-05-23 13:56:25', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (45, 8, 21, '<p>sjhad</p>', NULL, '2020-05-23 13:58:48', '2020-05-23 13:58:48', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (46, 8, 21, '<p><router-link class=\"mention\" data-mention=\"@root\" data-user-id=\"2\" to=\"/member/2\">@root</router-link> sdjd</p>', NULL, '2020-05-23 13:58:57', '2020-05-23 13:58:57', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (47, 23, 21, '<p>谢谢谢谢</p>', NULL, '2020-05-23 13:59:56', '2020-05-23 13:59:56', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (48, 3, 22, '<p>???</p>', NULL, '2020-05-23 14:03:29', '2020-05-23 14:03:29', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (49, 3, 22, '<p><router-link class=\"mention\" data-mention=\"@admin\" data-user-id=\"1\" to=\"/member/1\">@admin</router-link> kkk</p>', NULL, '2020-05-23 14:03:37', '2020-05-23 14:03:37', NULL, NULL, NULL);
INSERT INTO `t_theme_reply` VALUES (50, 24, 22, '<p>零零零零</p>', NULL, '2020-05-23 14:04:21', '2020-05-23 14:04:21', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `n_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `c_username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `c_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `c_salt` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `c_email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
  `n_sex` int(255) NULL DEFAULT NULL COMMENT '性别',
  `c_telephone` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号码',
  `c_personal_website` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '个人网站',
  `c_company` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所在公司',
  `c_position` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '职位',
  `c_location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '所在地',
  `c_signature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '签名',
  `c_personal_introduction` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '个人简介',
  `c_avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
  `n_coin` int(255) NULL DEFAULT NULL COMMENT '硬币数量',
  `d_create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `d_update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `n_status` int(255) NOT NULL DEFAULT 1 COMMENT '账号状态（0.正常 1.封禁）',
  `n_admin` int(255) NULL DEFAULT 0 COMMENT '管理员',
  PRIMARY KEY (`n_id`) USING BTREE,
  INDEX `index_id`(`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', '2', 1, '1', '3', '4', '5', '6', '7', '99', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', 0, '2020-02-04 12:30:00', '2020-02-04 12:30:00', 0, 1);
INSERT INTO `t_user` VALUES (2, 'root', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', 'test@gmail.com', 1, '110', 'www.i.com', 'company', '职位', '所在地', '签名', '个人介绍', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-02-16 15:13:47', NULL, 0, 1);
INSERT INTO `t_user` VALUES (3, 'test1', 'c107a81e9a5c6e40ffea3130a5881f94', '59b79cb8418941c9506b65d69d4ba90a', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '签名', NULL, 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-02-18 14:09:48', NULL, 0, 0);
INSERT INTO `t_user` VALUES (4, 'ohayo', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', 'test@gmail.com', 1, '1556666666', 'www.i.com', '火星company', '研发工程师', '火星', '这个人很懒', '无！！！', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-04-26 15:13:47', NULL, 1, 0);
INSERT INTO `t_user` VALUES (5, 'key', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', 'test@gmail.com', 1, '1556666666', 'www.i.com', '火星company', '研发工程师', '火星', '这个人很懒', '无！！！', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-04-26 15:13:47', NULL, 0, 0);
INSERT INTO `t_user` VALUES (6, 'stain', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', 'test@gmail.com', 1, '1556666666', 'www.i.com', '火星company', '研发工程师', '火星', '这个人很懒', '无！！！', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-04-26 15:13:47', NULL, 0, 0);
INSERT INTO `t_user` VALUES (7, 'light', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', 'test@gmail.com', 1, '1556666666', 'www.i.com', '火星company', '研发工程师', '火星', '这个人很懒', '无！！！', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-04-26 15:13:47', NULL, 0, 0);
INSERT INTO `t_user` VALUES (8, 'bigBoy', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', 'test@gmail.com', 1, '1556666666', 'www.i.com', '火星company', '研发工程师', '火星', '这个人很懒', '无！！！', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-04-26 15:13:47', NULL, 0, 0);
INSERT INTO `t_user` VALUES (9, 'sunshine', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', 'test@gmail.com', 1, '1556666666', 'www.i.com', '火星company', '研发工程师', '火星', '这个人很懒', '无！！！', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-04-26 15:13:47', NULL, 0, 0);
INSERT INTO `t_user` VALUES (10, 'eng', '914e2d5bb12d7d8189957180587b5037', 'a1a0ee38e70a33a56dd95e9ff99723d4', 'test@gmail.com', 1, '1556666666', 'www.i.com', '火星company', '研发工程师', '火星', '这个人很懒', '无！！！', 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-04-26 15:13:47', NULL, 0, 0);
INSERT INTO `t_user` VALUES (11, 'root23', '075fd8352711ca8da27b2cc6c280cf7e', 'd5de748ee795330e9c9aeffffe25adb7', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/d65224b09e9386934d3ecc47f1eaab95?s=48&d=retro', NULL, '2020-05-23 07:50:44', NULL, 0, 0);
INSERT INTO `t_user` VALUES (12, 'asdkd', 'd69938c691a10180955db090b6e04f13', '993dd1b3c3c8a4e3017c58fa1d086d8c', '123', 0, '312', '3', '12', '22', '23', '213', '133333333333333', 'https://cdn.v2ex.com/gravatar/50d062359fce84768ff33c15177dc6d6?s=48&d=retro', NULL, '2020-05-23 07:51:48', NULL, 0, 0);
INSERT INTO `t_user` VALUES (13, 'sad', '94246b67375877710505d1b79162f0dc', 'c83eb39db8636fad41ef8037f4877100', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/b7a0a8ac565327c4ccd4a6780a2d043e?s=48&d=retro', NULL, '2020-05-23 08:09:35', NULL, 0, 0);
INSERT INTO `t_user` VALUES (14, 'root34', '0225686c83fd043a3c1bcac7dbc9bc58', '9d1c669133fdada2e075654e76c49cc0', '231', 1, '231', NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-05-23 11:24:21', NULL, 0, 0);
INSERT INTO `t_user` VALUES (15, 'root45', '8a63d5c41e5ae3ffabd4e031e9f1600e', '20a5df80b748710c58b3752362d527f7', '13123', 1, '123', NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/af4396573c1aa9be96b20d2ff8b1907d?s=48&d=retro', NULL, '2020-05-23 11:30:34', NULL, 0, 0);
INSERT INTO `t_user` VALUES (16, 'root67', '96cc6c324e2ffb2baff724722176df34', '45c88f2442f30fe84de47ed2d5fb016f', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-05-23 11:33:46', NULL, 0, 0);
INSERT INTO `t_user` VALUES (17, 'root3', '4bb92eac5b0befd126be263e2fa537b4', '61ad365bfad58a3cefeab2f4faf2fa59', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/avatar/eedf/63d4/372826_normal.png?m=1575942257', NULL, '2020-05-23 11:34:12', NULL, 0, 0);
INSERT INTO `t_user` VALUES (18, 'root899', '0c5f48a1062226eae3de729da666104e', 'cbe1fe5d35fa93b44cd55f3b49ea1426', '23123', 1, '222', NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/d467f3b1603e9ceb12ff120c3a295919?s=48&d=retro', NULL, '2020-05-23 11:35:34', NULL, 0, 0);
INSERT INTO `t_user` VALUES (19, 'root33', 'e75ea7f0d421120df0fa3b7053588380', 'c22341e53a50016aefb2c8481d356dad', '12235', 1, '124', NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/af4396573c1aa9be96b20d2ff8b1907d?s=48&d=retro', NULL, '2020-05-23 11:40:00', NULL, 0, 0);
INSERT INTO `t_user` VALUES (20, 'root00', '5ff8f9a8cf465937d3b795b19f84c2a9', 'd3758e96f93a6ba31d6d3644ec7de0dc', '123', 1, '1231', '222', NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/avatar/eedf/63d4/372826_normal.png?m=1575942257', NULL, '2020-05-23 13:54:34', NULL, 0, 0);
INSERT INTO `t_user` VALUES (21, 'root0000', '294a769304327d0e5581ee9c7231b4c6', '11a56d425b4f1ca9d9176106b2a32a14', '123', 1, '234', NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro', NULL, '2020-05-23 13:57:58', NULL, 0, 0);
INSERT INTO `t_user` VALUES (22, 'admin23', 'e0e734293f38fe1c715a2705e709464e', 'd84e349d7e48dd5fd4816910a7d23089', '123', 1, '12313', NULL, NULL, NULL, NULL, NULL, NULL, 'https://cdn.v2ex.com/gravatar/d467f3b1603e9ceb12ff120c3a295919?s=48&d=retro', NULL, '2020-05-23 14:02:39', NULL, 0, 0);

-- ----------------------------
-- Table structure for t_user_attention
-- ----------------------------
DROP TABLE IF EXISTS `t_user_attention`;
CREATE TABLE `t_user_attention`  (
  `c_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '主键id',
  `n_user_id` bigint(20) NOT NULL COMMENT '用户id',
  `n_attention_user_id` bigint(20) NOT NULL COMMENT '关注的用户id',
  `d_attention_time` datetime(0) NULL DEFAULT NULL COMMENT '关注时间',
  PRIMARY KEY (`n_user_id`, `n_attention_user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_attention
-- ----------------------------
INSERT INTO `t_user_attention` VALUES ('35e56356bcaf4b8e8b71fa0fe03a3f94', 2, 1, '2020-04-04 10:59:17');
INSERT INTO `t_user_attention` VALUES ('4ed9ddfc899d48089bd758dd1855361a', 12, 2, '2020-05-23 09:06:18');
INSERT INTO `t_user_attention` VALUES ('dd915c16d0184f09878b701cd3fcae6a', 14, 2, '2020-05-23 11:24:48');
INSERT INTO `t_user_attention` VALUES ('3998a90b92b74f75b562d70e7d63194d', 18, 2, '2020-05-23 11:36:13');
INSERT INTO `t_user_attention` VALUES ('aa9f11593cf64cdbb9171dfe63d2dd60', 19, 2, '2020-05-23 11:40:33');
INSERT INTO `t_user_attention` VALUES ('61073b926f3e406b9946010ef3e32ea2', 20, 2, '2020-05-23 13:55:05');
INSERT INTO `t_user_attention` VALUES ('892f99e62f6d44c9bdfd63ee19281566', 21, 4, '2020-05-23 13:58:30');
INSERT INTO `t_user_attention` VALUES ('aa4f057e843d4253a704a41f0d220d9b', 22, 1, '2020-05-23 14:03:10');

-- ----------------------------
-- Table structure for t_user_block
-- ----------------------------
DROP TABLE IF EXISTS `t_user_block`;
CREATE TABLE `t_user_block`  (
  `c_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `n_user_id` bigint(20) NOT NULL,
  `n_block_user_id` bigint(20) NOT NULL,
  `d_block_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`n_user_id`, `n_block_user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_right
-- ----------------------------
DROP TABLE IF EXISTS `t_user_right`;
CREATE TABLE `t_user_right`  (
  `n_user_id` bigint(20) NOT NULL,
  `n_right_id` bigint(20) NOT NULL,
  `d_create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`n_user_id`, `n_right_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_right
-- ----------------------------
INSERT INTO `t_user_right` VALUES (1, 1, NULL);
INSERT INTO `t_user_right` VALUES (1, 2, NULL);
INSERT INTO `t_user_right` VALUES (1, 3, NULL);
INSERT INTO `t_user_right` VALUES (2, 2, NULL);
INSERT INTO `t_user_right` VALUES (2, 4, NULL);
INSERT INTO `t_user_right` VALUES (3, 6, NULL);

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `n_id` int(11) NOT NULL AUTO_INCREMENT,
  `n_user_id` bigint(20) NULL DEFAULT NULL,
  `n_role_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`n_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES (1, 1, 1);
INSERT INTO `t_user_role` VALUES (2, 2, 2);
INSERT INTO `t_user_role` VALUES (3, 1, 2);

SET FOREIGN_KEY_CHECKS = 1;
