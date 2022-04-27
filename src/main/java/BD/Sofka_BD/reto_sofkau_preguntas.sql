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
-- Table structure for table `preguntas`
--

DROP TABLE IF EXISTS `preguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preguntas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pregunta` varchar(255) NOT NULL,
  `id_categoria` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_categoria` (`id_categoria`),
  CONSTRAINT `fk_categoria` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntas`
--

LOCK TABLES `preguntas` WRITE;
/*!40000 ALTER TABLE `preguntas` DISABLE KEYS */;
INSERT INTO `preguntas` VALUES (1,'¿Cuál es la capital de España?',1),(2,'Danos el resultado de esta operación: 2*2+2',1),(3,'¿Cómo se traduce el color verde en inglés?',1),(4,'¿Cuántos huesos tiene el cuerpo humano?',1),(5,'¿Cuáles son los animáles ovíparos?',1),(6,'¿Qué es un lustro?',2),(7,'¿Qué es un adjetivo?',2),(8,'\'Bombero\' en inglés es...',2),(9,'El triple de 3 es...',2),(10,'¿Cuántos metros hay en un kilómetro?',3),(11,'¿Cómo es el pasado del verbo \'watch\' en inglés?',3),(12,'Elige una opción que contenga únicamente números pares!',2),(13,'Elige una opción en la que solo hayan planetas de la vía láctea!',3),(14,'¿Qué pesa más un kilo de plumas o uno de hierro?',3),(15,'Símbolo químico del oro en la tabla periódica!',3),(16,'Danos un ejemplo de un ser vivo con respiración traqueal',4),(17,'¿Cómo se traduciría \'Jugando\' en inglés?',4),(18,'Símbolo químico de Arsénico!',4),(19,'¿En qué año nació Jesús?',4),(20,'Fecha de la primera guerra mundial!',4),(21,'Fecha del descubrimiento de América!',5),(22,'¿Quién dijo la frase \'La imaginación es más importante que el conocimiento\'?',5),(23,'¿Cuál de las siguientes opciones es una palabra sobreesdrújula?',5),(24,'¿Qué planeta está más cerca del sol?',5),(25,'¿Cada cuántos años tenemos un año bisiesto?',5);
/*!40000 ALTER TABLE `preguntas` ENABLE KEYS */;
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
