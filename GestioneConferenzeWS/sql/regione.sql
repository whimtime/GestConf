

CREATE TABLE `regione` (
  `CODICE_ISTAT_REGIONE` varchar(2) NOT NULL,
  `REGIONE` varchar(100) NOT NULL,
  PRIMARY KEY (`CODICE_ISTAT_REGIONE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='TABELLA CONTENENTE LE REGIONI ITALIANE'$$


INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (02,'Valle d Aosta');                                        
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (01,'Piemonte');                                             
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (03,'Lombardia');                                            
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (04,'Trentino-Alto Adige');                                  
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (05,'Veneto');                                               
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (06,'Friuli-Venezia Giulia');                                
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (07,'Liguria');                                              
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (08,'Emilia-Romagna');                                       
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (09,'Toscana');                                              
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (10,'Umbria');                                               
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (11,'Marche');                                               
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (12,'Lazio');                                                
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (13,'Abruzzo');                                              
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (14,'Molise');                                               
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (15,'Campania');                                             
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (16,'Puglia');                                               
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (17,'Basilicata');                                           
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (18,'Calabria');                                             
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (19,'Sicilia');                                              
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (20,'Sardegna');                                             
INSERT INTO GESTCONFDB.REGIONE (codice_istat_regione,regione) VALUES (00,'San Marino');                                           
