-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: sql10.freemysqlhosting.net    Database: sql10326340
-- ------------------------------------------------------
-- Server version	5.5.58-0ubuntu0.14.04.1

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
-- Table structure for table `BONUS`
--

DROP TABLE IF EXISTS `BONUS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BONUS` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf_cliente` varchar(14) NOT NULL,
  `valor` float NOT NULL,
  `data` varchar(10) NOT NULL,
  `situacao` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cpf_idx` (`cpf_cliente`),
  CONSTRAINT `fk_cpf` FOREIGN KEY (`cpf_cliente`) REFERENCES `CLIENTE` (`cpf`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BONUS`
--

LOCK TABLES `BONUS` WRITE;
/*!40000 ALTER TABLE `BONUS` DISABLE KEYS */;
INSERT INTO `BONUS` VALUES (1,'111.111.111-11',0,'00/00/0000',1),(2,'111.111.111-11',1.158,'09/03/2020',1),(3,'111.111.111-11',0.7422,'22/05/2020',1),(4,'111.111.111-11',0.68378,'30/09/2023',1),(5,'222.222.222-22',12.714,'11/03/2020',1),(6,'222.222.222-22',5.496,'11/03/2020',1),(7,'222.222.222-22',4.3206,'11/04/2020',1),(8,'111.111.111-11',9.72962,'11/05/2020',0),(9,'222.222.222-22',7.56694,'11/06/2021',0);
/*!40000 ALTER TABLE `BONUS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-11  2:30:24
