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
-- Table structure for table `provincia`
--

DROP TABLE IF EXISTS `provincia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provincia` (
  `SIGLA_PROVINCIA` varchar(2) NOT NULL,
  `CODICE_ISTAT_REGIONE` varchar(2) NOT NULL,
  `CODICE_ISTAT_PROVINCIA` varchar(3) NOT NULL,
  `PROVINCIA` varchar(50) NOT NULL,
  PRIMARY KEY (`SIGLA_PROVINCIA`),
  KEY `FK_provincia_regione` (`CODICE_ISTAT_REGIONE`),
  CONSTRAINT `FK_provincia_regione` FOREIGN KEY (`CODICE_ISTAT_REGIONE`) REFERENCES `regione` (`CODICE_ISTAT_REGIONE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='TABELLA CONTENENTE LE PROVINCE ITALIANE';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provincia`
--

LOCK TABLES `provincia` WRITE;
/*!40000 ALTER TABLE `provincia` DISABLE KEYS */;
INSERT INTO `provincia` VALUES ('AL','01','006','Alessandria'),('AN','11','042','Ancona'),('AO','02','007','Aosta'),('AP','11','044','Ascoli Piceno'),('AQ','13','066','Aquila'),('AR','09','051','Arezzo'),('AT','01','005','Asti'),('AV','15','064','Avellino'),('BA','16','072','Bari'),('BG','03','016','Bergamo'),('BI','01','096','Biella'),('BL','05','025','Belluno'),('BN','15','062','Benevento'),('BO','08','037','Bologna'),('BR','16','074','Brindisi'),('BS','03','017','Brescia'),('BT','16','110','Barletta-Andria-Trani'),('BZ','04','021','Bolzano'),('CA','20','092','Cagliari'),('CB','14','070','Campobasso'),('CE','15','061','Caserta'),('CH','13','069','Chieti'),('CI','20','107','Carbonia-Iglesias'),('CL','19','085','Caltanissetta'),('CN','01','004','Cuneo'),('CO','03','013','Como'),('CR','03','019','Cremona'),('CS','18','078','Cosenza'),('CT','19','087','Catania'),('CZ','18','079','Catanzaro'),('EN','19','086','Enna'),('FC','08','040','Forli-Cesena'),('FE','08','038','Ferrara'),('FG','16','071','Foggia'),('FI','09','048','Firenze'),('FM','11','150','Fermo'),('FO','08','040','Forli'),('FR','12','060','Frosinone'),('GE','07','010','Genova'),('GO','06','031','Gorizia'),('GR','09','053','Grosseto'),('IM','07','008','Imperia'),('IS','14','094','Isernia'),('KR','18','101','Crotone'),('LC','03','097','Lecco'),('LE','16','075','Lecce'),('LI','09','049','Livorno'),('LO','03','098','Lodi'),('LT','12','059','Latina'),('LU','09','046','Lucca'),('MB','03','108','Monza Brianza'),('MC','11','043','Macerata'),('ME','19','083','Messina'),('MI','03','015','Milano'),('MN','03','020','Mantova'),('MO','08','036','Modena'),('MS','09','045','Massa Carrara'),('MT','17','077','Matera'),('NA','15','063','Napoli'),('NO','01','003','Novara'),('NU','20','091','Nuoro'),('OG','20','105','Ogliastra'),('OR','20','095','Oristano'),('OT','20','104','Olbia-Tempio'),('PA','19','082','Palermo'),('PC','08','033','Piacenza'),('PD','05','028','Padova'),('PE','13','068','Pescara'),('PG','10','054','Perugia'),('PI','09','050','Pisa'),('PN','06','093','Pordenone'),('PO','09','100','Prato'),('PR','08','034','Parma'),('PS','11','041','Pesaro'),('PT','09','047','Pistoia'),('PU','11','041','Pesaro e Urbino'),('PV','03','018','Pavia'),('PZ','17','076','Potenza'),('RA','08','039','Ravenna'),('RC','18','080','Reggio Calabria'),('RE','08','035','Reggio Emilia'),('RG','19','088','Ragusa'),('RI','12','057','Rieti'),('RM','12','058','Roma'),('RN','08','099','Rimini'),('RO','05','029','Rovigo'),('SA','15','065','Salerno'),('SI','09','052','Siena'),('SM','00','000','San Marino'),('SO','03','014','Sondrio'),('SP','07','011','La Spezia'),('SR','19','089','Siracusa'),('SS','20','090','Sassari'),('SV','07','009','Savona'),('TA','16','073','Taranto'),('TE','13','067','Teramo'),('TN','04','022','Trento'),('TO','01','001','Torino'),('TP','19','081','Trapani'),('TR','10','055','Terni'),('TS','06','032','Trieste'),('TV','05','026','Treviso'),('UD','06','030','Udine'),('VA','03','012','Varese'),('VB','01','103','Verbano-Cusio-Ossola'),('VC','01','002','Vercelli'),('VE','05','027','Venezia'),('VI','05','024','Vicenza'),('VR','05','023','Verona'),('VS','20','106','Medio Campidano'),('VT','12','056','Viterbo'),('VV','18','102','Vibo Valentia');
/*!40000 ALTER TABLE `provincia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-23 22:22:29
