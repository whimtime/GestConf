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
-- Table structure for table `conferenza`
--

DROP TABLE IF EXISTS `conferenza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conferenza` (
  `cd_conferenza` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `sottotitolo` varchar(200) NOT NULL,
  `data_inizio` timestamp NULL DEFAULT NULL,
  `data_fine` timestamp NULL DEFAULT NULL,
  `cd_comune_istat` varchar(5) DEFAULT NULL,
  `indirizzo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cd_conferenza`),
  KEY `fk_comune_conferenza_idx` (`cd_comune_istat`),
  CONSTRAINT `fk_comune_conferenza` FOREIGN KEY (`cd_comune_istat`) REFERENCES `comune_istat` (`CD_COMUNE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conferenza`
--

LOCK TABLES `conferenza` WRITE;
/*!40000 ALTER TABLE `conferenza` DISABLE KEYS */;
INSERT INTO `conferenza` VALUES (1,'modificata da test','sottotitolodi prova','2014-03-30 22:00:00','2014-03-30 22:00:00','MI011','ind di prova 32'),(2,'drgfdfdgfdgfdg','sottotitolo 1','2014-03-21 23:00:00','2014-03-21 23:00:00','MI011','via di prova 1'),(3,'titolo 1mod','sottotitolo 1','2014-03-21 23:00:00','2014-03-21 23:00:00','MI011','via di prova 1'),(4,'titolo 1','sottotitolo 1','2014-03-22 09:27:34','2014-03-22 09:27:34','MI011','via di prova 1');
/*!40000 ALTER TABLE `conferenza` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-31 22:30:47
