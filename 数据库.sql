/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.43-log : Database - db_dn
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_dn` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_dn`;

/*Table structure for table `tb_fee` */

DROP TABLE IF EXISTS `tb_fee`;

CREATE TABLE `tb_fee` (
  `fid` int(10) NOT NULL,
  `fname` varchar(20) DEFAULT NULL,
  `fhour` varchar(20) DEFAULT NULL,
  `fbfee` varchar(20) DEFAULT NULL,
  `fdfee` varchar(20) DEFAULT NULL,
  `fcdate` varchar(20) DEFAULT NULL,
  `fkdate` varchar(20) DEFAULT NULL,
  `fstate` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_fee` */

insert  into `tb_fee`(`fid`,`fname`,`fhour`,`fbfee`,`fdfee`,`fcdate`,`fkdate`,`fstate`) values (1,'包 20 小时','20 小时','24.50 元','3.00 元/小时','2013/01/01 00:00:00',NULL,'暂停'),(2,'包 12 小时','12 小时','20.50 元','2.00 元/小时','2012/01/01 00:00:00',NULL,'启动'),(3,'3','3','3','3','','','暂停');

/*Table structure for table `tb_role` */

DROP TABLE IF EXISTS `tb_role`;

CREATE TABLE `tb_role` (
  `rid` int(10) NOT NULL,
  `rname` varchar(20) DEFAULT NULL,
  `rdesc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_role` */

insert  into `tb_role`(`rid`,`rname`,`rdesc`) values (1,'admin','超级管理员'),(2,'user','普通用户'),(3,'feeadmin','资费管理员');

/*Table structure for table `tb_u_r` */

DROP TABLE IF EXISTS `tb_u_r`;

CREATE TABLE `tb_u_r` (
  `uid` int(10) DEFAULT NULL,
  `rid` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_u_r` */

insert  into `tb_u_r`(`uid`,`rid`) values (1,1),(1,3),(2,2),(3,3);

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `uid` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

insert  into `tb_user`(`uid`,`username`,`password`) values (1,'admin','admin'),(2,'小白','123456'),(3,'大白','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
