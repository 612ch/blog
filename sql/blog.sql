-- --------------------------------------------------------
-- 主机:                           localhost
-- 服务器版本:                        5.5.5-m3 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- 导出  表 blog.cx_article 结构
DROP TABLE IF EXISTS `cx_article`;
CREATE TABLE IF NOT EXISTS `cx_article` (
  `art_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章主键',
  `art_cate_id` int(11) DEFAULT NULL COMMENT '文章分类ID',
  `art_title` varchar(100) DEFAULT NULL COMMENT '文章标题',
  `art_alias` varchar(200) DEFAULT NULL COMMENT '文章别名 副标题',
  `art_keyword` varchar(200) DEFAULT NULL COMMENT '文章关键字',
  `art_tag` varchar(200) DEFAULT NULL COMMENT '文章标签',
  `art_content` longtext COMMENT '文章内容',
  `art_view_num` int(11) DEFAULT NULL COMMENT '文章阅读数',
  `art_status` char(1) DEFAULT NULL COMMENT '文章状态，0发布，1审核，2草稿',
  `art_type` char(1) DEFAULT NULL COMMENT '文章类型 0公开 1非公开',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除状态 0正常 1删除',
  `art_is_top` char(1) DEFAULT NULL COMMENT '文章是否置顶 0置顶 1非置顶 2分类置顶',
  `create_by` int(11) DEFAULT NULL COMMENT '创建用户',
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '最后一次修改人',
  `update_date` datetime DEFAULT NULL COMMENT '最后一次修改时间',
  `delete_by` int(11) DEFAULT NULL COMMENT '删除人',
  `delete_date` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`art_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  blog.cx_article 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cx_article` DISABLE KEYS */;
/*!40000 ALTER TABLE `cx_article` ENABLE KEYS */;

-- 导出  表 blog.cx_category 结构
DROP TABLE IF EXISTS `cx_category`;
CREATE TABLE IF NOT EXISTS `cx_category` (
  `cate_id` int(11) NOT NULL AUTO_INCREMENT,
  `cate_name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `cate_alias` varchar(200) DEFAULT NULL COMMENT '分类别名',
  `cate_keywords` varchar(200) DEFAULT NULL COMMENT '分类关键字多个,区分',
  `cate_remarks` varchar(200) DEFAULT NULL COMMENT '分类注释说明',
  `cate_parent` int(11) DEFAULT NULL COMMENT '分类父级节点ID',
  `cate_create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `cate_create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `cate_update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `cate_update_date` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  `cate_delete_by` int(11) DEFAULT NULL COMMENT '删除人',
  `cate_delete_date` timestamp NULL DEFAULT NULL COMMENT '删除时间',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记 0正常 1删除',
  PRIMARY KEY (`cate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  blog.cx_category 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cx_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `cx_category` ENABLE KEYS */;

-- 导出  表 blog.cx_comment 结构
DROP TABLE IF EXISTS `cx_comment`;
CREATE TABLE IF NOT EXISTS `cx_comment` (
  `comm_id` int(11) NOT NULL COMMENT '评论ID',
  `comm_status` char(1) DEFAULT NULL COMMENT '评论状态 0正常 1待审核',
  `comm_name` varchar(200) DEFAULT NULL COMMENT '评论用户名',
  `comm_email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `comm_home_page` varchar(200) DEFAULT NULL COMMENT '主页',
  `comm_content` longtext COMMENT '评论内容',
  `comm_ip` varchar(100) DEFAULT NULL COMMENT '评论IP',
  `comm_agent` varchar(200) DEFAULT NULL COMMENT '评论浏览器agent',
  `comm_parent` int(11) DEFAULT NULL COMMENT '评论父级ID 意思为回复ID',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除状态0正常 1删除',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人 登陆状态下获取的是登陆用户',
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `delete_by` int(11) DEFAULT NULL COMMENT '删除人',
  `delete_date` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`comm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  blog.cx_comment 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cx_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `cx_comment` ENABLE KEYS */;

-- 导出  表 blog.cx_config 结构
DROP TABLE IF EXISTS `cx_config`;
CREATE TABLE IF NOT EXISTS `cx_config` (
  `conf_id` int(11) NOT NULL AUTO_INCREMENT,
  `conf_key` varchar(200) DEFAULT NULL COMMENT '配置主键KEY',
  `conf_value` varchar(200) DEFAULT NULL COMMENT '配置的值',
  `conf_remarks` varchar(200) DEFAULT NULL COMMENT '配置注释说明',
  PRIMARY KEY (`conf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  blog.cx_config 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cx_config` DISABLE KEYS */;
/*!40000 ALTER TABLE `cx_config` ENABLE KEYS */;

-- 导出  表 blog.cx_link 结构
DROP TABLE IF EXISTS `cx_link`;
CREATE TABLE IF NOT EXISTS `cx_link` (
  `link_id` varchar(64) NOT NULL,
  `link_title` varchar(100) DEFAULT NULL COMMENT '标题',
  `link_alias` varchar(200) DEFAULT NULL COMMENT '别称介绍',
  `link_url` varchar(200) DEFAULT NULL COMMENT 'url地址',
  `link_status` char(1) DEFAULT NULL COMMENT '链接地址0正常 1关闭',
  `link_sort` int(11) DEFAULT NULL COMMENT '排序',
  `link_click` int(11) DEFAULT NULL COMMENT '点击数',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记 0正常 1删除',
  `delete_by` int(11) DEFAULT NULL COMMENT '删除人',
  `delete_date` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  blog.cx_link 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cx_link` DISABLE KEYS */;
/*!40000 ALTER TABLE `cx_link` ENABLE KEYS */;

-- 导出  表 blog.cx_tag 结构
DROP TABLE IF EXISTS `cx_tag`;
CREATE TABLE IF NOT EXISTS `cx_tag` (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签ID',
  `tag_name` varchar(200) DEFAULT NULL COMMENT '标签名',
  `tag_alias` varchar(200) DEFAULT NULL COMMENT '标签别名',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '修改人',
  `update_date` datetime DEFAULT NULL COMMENT '修改时间',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记 0正常 1删除',
  `delete_by` int(11) DEFAULT NULL COMMENT '删除人',
  `delete_date` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  blog.cx_tag 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cx_tag` DISABLE KEYS */;
/*!40000 ALTER TABLE `cx_tag` ENABLE KEYS */;

-- 导出  表 blog.cx_upload 结构
DROP TABLE IF EXISTS `cx_upload`;
CREATE TABLE IF NOT EXISTS `cx_upload` (
  `ul_id` int(11) NOT NULL COMMENT '文件上传主键',
  `ul_size` int(11) DEFAULT NULL COMMENT '文件大小',
  `ul_name` varchar(200) DEFAULT NULL COMMENT '文件名',
  `ul_origin_name` varchar(200) DEFAULT NULL COMMENT '文件原名',
  `ul_absolute_name` varchar(200) DEFAULT NULL COMMENT '文件全名',
  `ul_format` varchar(20) DEFAULT NULL COMMENT '文件格式',
  `ul_intro` varchar(200) DEFAULT NULL COMMENT '文件简介',
  `ul_create_by` varchar(64) DEFAULT NULL COMMENT '创建人',
  `ul_create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ul_down_nums` int(11) DEFAULT NULL COMMENT '下载次数',
  PRIMARY KEY (`ul_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  blog.cx_upload 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cx_upload` DISABLE KEYS */;
/*!40000 ALTER TABLE `cx_upload` ENABLE KEYS */;

-- 导出  表 blog.cx_user 结构
DROP TABLE IF EXISTS `cx_user`;
CREATE TABLE IF NOT EXISTS `cx_user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(200) DEFAULT NULL COMMENT '用户名',
  `u_password` varchar(64) DEFAULT NULL COMMENT '密码',
  `u_salt` varchar(64) DEFAULT NULL COMMENT '盐加密',
  `u_uuid` varchar(32) DEFAULT NULL COMMENT 'UUID',
  `u_level` int(11) DEFAULT '0' COMMENT '用户等级',
  `u_email` varchar(30) DEFAULT NULL COMMENT '用户邮箱地址',
  `u_qq` varchar(20) DEFAULT NULL COMMENT '用户QQ',
  `u_phone` varchar(20) DEFAULT NULL COMMENT '用户手机号码',
  `u_github` varchar(100) DEFAULT NULL COMMENT '用户github地址',
  `u_gitee` varchar(100) DEFAULT NULL COMMENT '用户码云地址',
  `u_wechat` varchar(100) DEFAULT NULL,
  `u_home_page` varchar(200) DEFAULT NULL COMMENT '用户主页地址',
  `u_alias` varchar(100) DEFAULT NULL COMMENT '用户昵称',
  `u_status` char(1) DEFAULT '0' COMMENT '用户状态0正常 1封禁',
  `del_flag` char(1) DEFAULT '0',
  `u_login_ip` varchar(200) DEFAULT NULL COMMENT '用户当前登陆IP',
  `u_last_login_ip` varchar(200) DEFAULT NULL COMMENT '用户上一次登陆IP',
  `u_create_by` varchar(200) DEFAULT NULL COMMENT '创建人',
  `u_create_date` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  blog.cx_user 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `cx_user` DISABLE KEYS */;
INSERT INTO `cx_user` (`u_id`, `u_name`, `u_password`, `u_salt`, `u_uuid`, `u_level`, `u_email`, `u_qq`, `u_phone`, `u_github`, `u_gitee`, `u_wechat`, `u_home_page`, `u_alias`, `u_status`, `del_flag`, `u_login_ip`, `u_last_login_ip`, `u_create_by`, `u_create_date`) VALUES
	(10000, 'admin', '123456', NULL, NULL, 0, '1319503977@qq.com', '1319503977', '15738173373', NULL, NULL, 'Demon9501', 'https://www.612ch.com', 'demon', '0', '0', '127.0.0.1', '127.0.0.1', '10000', '2021-10-23 13:52:36');
/*!40000 ALTER TABLE `cx_user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
