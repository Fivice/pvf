-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: 192.168.21.12    Database: pvf
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sys_permission`
--

DROP TABLE IF EXISTS `sys_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_permission` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `permission_code` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '权限code',
  `permission_name` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '权限名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='权限表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_permission`
--

LOCK TABLES `sys_permission` WRITE;
/*!40000 ALTER TABLE `sys_permission` DISABLE KEYS */;
INSERT INTO `sys_permission` VALUES (1,'create_user','创建用户'),(2,'query_user','查看用户'),(3,'delete_user','删除用户'),(4,'modify_user','修改用户');
/*!40000 ALTER TABLE `sys_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_request_path`
--

DROP TABLE IF EXISTS `sys_request_path`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_request_path` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `url` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '请求路径',
  `description` varchar(128) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '路径描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='请求路径';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_request_path`
--

LOCK TABLES `sys_request_path` WRITE;
/*!40000 ALTER TABLE `sys_request_path` DISABLE KEYS */;
INSERT INTO `sys_request_path` VALUES (1,'/getUser','查询用户');
/*!40000 ALTER TABLE `sys_request_path` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_request_path_permission_relation`
--

DROP TABLE IF EXISTS `sys_request_path_permission_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_request_path_permission_relation` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `url_id` int DEFAULT NULL COMMENT '请求路径id',
  `permission_id` int DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='路径权限关联表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_request_path_permission_relation`
--

LOCK TABLES `sys_request_path_permission_relation` WRITE;
/*!40000 ALTER TABLE `sys_request_path_permission_relation` DISABLE KEYS */;
INSERT INTO `sys_request_path_permission_relation` VALUES (1,1,2);
/*!40000 ALTER TABLE `sys_request_path_permission_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS `sys_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_name` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '角色名',
  `role_description` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '角色说明',
  `role_code` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '角色编码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户角色表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
INSERT INTO `sys_role` VALUES (1,'管理员','管理员，拥有所有权限','admin'),(2,'普通用户','普通用户，拥有部分权限','user');
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role_permission_relation`
--

DROP TABLE IF EXISTS `sys_role_permission_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role_permission_relation` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_id` int DEFAULT NULL COMMENT '角色id',
  `permission_id` int DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='角色-权限关联关系表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role_permission_relation`
--

LOCK TABLES `sys_role_permission_relation` WRITE;
/*!40000 ALTER TABLE `sys_role_permission_relation` DISABLE KEYS */;
INSERT INTO `sys_role_permission_relation` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,2,1),(6,2,2);
/*!40000 ALTER TABLE `sys_role_permission_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(32) COLLATE utf8mb4_general_ci NOT NULL COMMENT '账号',
  `user_name` varchar(32) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户密码',
  `last_login_time` datetime DEFAULT NULL COMMENT '上一次登录时间',
  `enabled` tinyint(1) DEFAULT '1' COMMENT '账号是否可用。默认为1（可用）',
  `not_expired` tinyint(1) DEFAULT '1' COMMENT '是否过期。默认为1（没有过期）',
  `account_not_locked` tinyint(1) DEFAULT '1' COMMENT '账号是否锁定。默认为1（没有锁定）',
  `credentials_not_expired` tinyint(1) DEFAULT '1' COMMENT '证书（密码）是否过期。默认为1（没有过期）',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `create_user` int DEFAULT NULL COMMENT '创建人',
  `update_user` int DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` VALUES (1,'user1','用户1','$2a$10$47lsFAUlWixWG17Ca3M/r.EPJVIb7Tv26ZaxhzqN65nXVcAhHQM4i','2019-09-04 20:25:36',1,1,1,1,'2019-08-29 06:28:36','2019-09-04 20:25:36',1,1),(2,'user2','用户2','$2a$10$uSLAeON6HWrPbPCtyqPRj.hvZfeM.tiVDZm24/gRqm4opVze1cVvC','2019-09-05 00:07:12',1,1,1,1,'2019-08-29 06:29:24','2019-09-05 00:07:12',1,2);
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user_role_relation`
--

DROP TABLE IF EXISTS `sys_user_role_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user_role_relation` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int DEFAULT NULL COMMENT '用户id',
  `role_id` int DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户角色关联关系表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_role_relation`
--

LOCK TABLES `sys_user_role_relation` WRITE;
/*!40000 ALTER TABLE `sys_user_role_relation` DISABLE KEYS */;
INSERT INTO `sys_user_role_relation` VALUES (1,1,1),(2,2,2);
/*!40000 ALTER TABLE `sys_user_role_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'pvf'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-29 23:33:54
