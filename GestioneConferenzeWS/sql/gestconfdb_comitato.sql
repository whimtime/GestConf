CREATE DATABASE  IF NOT EXISTS `gestconfdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gestconfdb`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: gestconfdb
-- ------------------------------------------------------
-- Server version	5.6.16

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
-- Table structure for table `comitato`
--

DROP TABLE IF EXISTS `comitato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comitato` (
  `cd_comitato` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cd_conferenza` int(11) DEFAULT NULL,
  `cd_tipo` int(11) DEFAULT NULL,
  PRIMARY KEY (`cd_comitato`),
  KEY `fk_comitato_conf_idx` (`cd_conferenza`),
  KEY `fk_tipocom_com_idx` (`cd_tipo`),
  CONSTRAINT `fk_tipocom_com` FOREIGN KEY (`cd_tipo`) REFERENCES `tipo_comitato` (`cd_tipo_comitato`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_comitato_conf` FOREIGN KEY (`cd_conferenza`) REFERENCES `conferenza` (`cd_conferenza`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comitato`
--

LOCK TABLES `comitato` WRITE;
/*!40000 ALTER TABLE `comitato` DISABLE KEYS */;
INSERT INTO `comitato` VALUES (3,'prova da testo',NULL,1),(4,'primo web',4,1),(5,'metodi agile',1,1);
/*!40000 ALTER TABLE `comitato` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-26 22:34:48
