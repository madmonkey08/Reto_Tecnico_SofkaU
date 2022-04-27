CREATE DATABASE  IF NOT EXISTS `reto_sofkau` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `reto_sofkau`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: reto_sofkau
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `opciones`
--

DROP TABLE IF EXISTS `opciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opciones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `respuesta` varchar(45) NOT NULL,
  `correcta` tinyint NOT NULL,
  `id_pregunta` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_opciones_pregunta` (`id_pregunta`),
  CONSTRAINT `fk_opciones_pregunta` FOREIGN KEY (`id_pregunta`) REFERENCES `preguntas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opciones`
--

LOCK TABLES `opciones` WRITE;
/*!40000 ALTER TABLE `opciones` DISABLE KEYS */;
INSERT INTO `opciones` VALUES (1,'Londres',0,1),(2,'Bogotá',0,1),(3,'Valencia',0,1),(4,'Madrid',1,1),(5,'4',0,2),(6,'10',0,2),(7,'8',0,2),(8,'6',1,2),(9,'Green',1,3),(10,'Grin',0,3),(11,'Gring',0,3),(12,'Gren',0,3),(13,'204',0,4),(14,'202',0,4),(15,'206',1,4),(16,'200',0,4),(17,'Los que comen huevos.',0,5),(18,'Los que ponen huevos.',1,5),(19,'Los que roban huevos.',0,5),(20,'Ninguna de las anteriores.',0,5),(21,'Periodo de veinte años.',0,6),(22,'Persona que brilla zapatos.',0,6),(23,'Periodo de cinco años.',1,6),(24,'Ninguna de las anteriores.',0,6),(25,'Cualidad del sujeto.',1,7),(26,'Acción que realiza el sujeto.',0,7),(27,'Un significado opuesto de una palabra.',0,7),(28,'Un sinónimo de un término.',0,7),(30,'Figther',0,8),(32,'Fireman',0,8),(33,'Bomberman',0,8),(34,'Firefighter',1,8),(35,'2, 10, 23',0,12),(36,'1, 2, 3',0,12),(37,'5, 10, 15',0,12),(38,'8, 6, 22',1,12),(39,'13',0,9),(40,'6',0,9),(41,'12',0,9),(42,'9',1,9),(43,'Watching',0,11),(44,'Watched',1,11),(45,'Wachted',0,11),(46,'Wached',0,11),(47,'100',0,10),(48,'10000',0,10),(49,'1000',1,10),(50,'Ninguno',0,10),(51,'Mercurio, Viernes, Marte',0,13),(52,'Plutón, Andrómeda, Saturno',0,13),(53,'Tierra, Marte, Jueves',0,13),(54,'Saturno, Venus, Mercurio',1,13),(55,'Un kilo de hierro',0,14),(56,'Un kilo de plumas',0,14),(57,'Pesan lo mismo',1,14),(58,'Ninguno',0,14),(59,'Or',0,15),(60,'O',0,15),(61,'Au',1,15),(62,'Pl',0,15),(63,'Abeja',1,16),(64,'Tortuga',0,16),(65,'Murciélago',0,16),(66,'Humanos',0,16),(67,'Played',0,17),(68,'Pleying',0,17),(69,'Plaing',0,17),(70,'Playing',1,17),(71,'Ar',0,18),(72,'Ac',0,18),(73,'As',1,18),(74,'An',0,18),(75,'2000',0,19),(76,'202',0,19),(77,'33',0,19),(78,'0',1,19),(79,'28 de julio de 1916.',0,20),(80,'28 de julio de 1918.',0,20),(81,'28 de julio de 1914.',1,20),(82,'28 de junio de 1914.',0,20),(83,'12 de octubre de 1492.',1,21),(84,'12 de octubre de 1495.',0,21),(85,'12 de octubre de 1490.',0,21),(86,'12 de octubre de 1480.',0,21),(89,'Will Smith',0,22),(90,'Nikola Tesla',0,22),(91,'Ghandi',0,22),(92,'Albert Einstein',1,22),(93,'Paréntesis',0,23),(94,'Fútbol',0,23),(95,'Ágilmente',1,23),(96,'Imaginación',0,23),(97,'Venus',0,24),(98,'Mercurio',1,24),(99,'Saturno',0,24),(100,'Tierra',0,24),(101,'Cada ocho años.',0,25),(102,'Cada seis años.',0,25),(103,'Cada dos años.',0,25),(104,'Cada cuatro años.',1,25);
/*!40000 ALTER TABLE `opciones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-27  0:25:20
