delimiter $$

CREATE TABLE `conferenza` (
  `cd_conferenza` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `sottotitolo` varchar(200) NOT NULL,
  `data_inizio` timestamp NULL DEFAULT NULL,
  `data_fine` timestamp NULL DEFAULT NULL,
  `cd_comune_istat` varchar(5) DEFAULT NULL,
  `indirizzo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cd_conferenza`),
  KEY `fk_conf_comune_idx` (`cd_comune_istat`),
  CONSTRAINT `fk_conf_comune` FOREIGN KEY (`cd_comune_istat`) REFERENCES `comune_istat` (`CD_COMUNE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1$$

