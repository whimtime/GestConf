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
-- Table structure for table `struttura_convenzionata`
--

DROP TABLE IF EXISTS `struttura_convenzionata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `struttura_convenzionata` (
  `cd_struttura_convenzionata` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_struttura` int(11) NOT NULL,
  `indirizzo` varchar(45) DEFAULT NULL,
  `comune` varchar(5) DEFAULT NULL,
  `descrizione` varchar(500) DEFAULT NULL,
  `url_servizio` varchar(100) DEFAULT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `tipo_servizio` varchar(45) DEFAULT 'SOAP',
  `codice_convenzione` varchar(45) DEFAULT NULL,
  `coordinate` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cd_struttura_convenzionata`),
  KEY `fk_comune_hotel_idx` (`comune`),
  CONSTRAINT `fk_comune_hotel` FOREIGN KEY (`comune`) REFERENCES `comune_istat` (`CD_COMUNE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `struttura_convenzionata`
--

LOCK TABLES `struttura_convenzionata` WRITE;
/*!40000 ALTER TABLE `struttura_convenzionata` DISABLE KEYS */;
INSERT INTO `struttura_convenzionata` VALUES (3,1,'VIA LORENTEGGIO 243','MI041','HOTEL 4 STELLE, COLAZIONE COMPRESA','HTTP://10.140.16.52/SERVLET/PRENOTA','MERCURE','SERVLET',NULL,'45.447032, 9.208642'),(4,2,'CORSO SEMPIONE 33','MI041','HOTEL 3 STELLE, COLAZIONE NON COMPRESA','HTTP://GESTIONEPRENOTAZIONI.COM/SOAP/PRENOTAZIONE.ASMX','BEST WESTERN','SOAP.NET',NULL,'45.444533, 9.164525'),(5,1,'VIALE JENNER 65','MI041','HOTEL 4 STELLE','HTTP://165.25.58.79/PRENOTAZIONI?WSDL','EXECUTIVE','SOAP.JAVA',NULL,'45.458351, 9.178644');
/*!40000 ALTER TABLE `struttura_convenzionata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-15 23:38:20
