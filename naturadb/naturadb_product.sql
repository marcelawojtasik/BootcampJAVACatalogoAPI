-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: naturadb
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `en_stock` bit(1) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Camino olfativo: Frutal. Ingredientes principales: Maracuyá, cedro, musk. Intensidad: Leve.',_binary '\0','Ekos Frescor de Maracuja',59.9,'Perfume'),(2,'Camino olfativo: Frutal. Ingredientes principales: Ishpink, cedro, musk. Intensidad: Leve.',_binary '','Ekos Frescor de Ishpink',59.9,'Perfume'),(3,'Camino olfativo: Floral. Ingredientes principales: Pitanga, limon, pataqueira. Intensidad: Leve.',_binary '','Ekos Frescor de Pitanga',59.9,'Perfume'),(4,'Camino olfativo: Frutal. Ingredientes principales: Castaña, cupuacu, pataqueira. Intensidad: Leve.',_binary '\0','Ekos Frescor de Castaña',59.9,'Perfume'),(5,'Camino olfativo: Frutal. Ingredientes principales: Bergamota, Hibisco, Maderas. Intensidad: Leve.',_binary '\0','Tododia Body Splash Acerola E Hibisco',31.5,'Body Splash'),(6,'Camino olfativo: Floral. Ingredientes principales: Cítricos, Guanábana, Haba tonka. Intensidad: Leve.',_binary '','Tododia Body Splash Hojas de Limón y Guanábana',31.5,'Body Splash'),(7,'Camino olfativo: Floral. Ingredientes principales: Hojas de bambú, Flores suaves, Sándalo, Cedro . Intensidad: Leve.',_binary '','Tododia Body Splash Flor de Lis',31.5,'Body Splash'),(8,'Camino olfativo: Frutsl. Ingredientes principales: Frutas, Pera, Priprioca . Intensidad: Moderado.',_binary '','Humor Meu Primeiro',73.2,'Eau de Toilette'),(9,'Camino olfativo: Frutal. Ingredientes principales: Pimenta rosa, Copaíba, Manzana y Bergamota. Intensidad: Moderado.',_binary '','Humor Liberta',73.2,'Eau de Toilette'),(10,'Camino olfativo: Amaderado. Ingredientes principales: Anana, Cardamomo, Lavanda, Cumaru. Intensidad: Moderado.',_binary '','Humor Transforma',73.2,'Eau de Toilette');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-10 22:41:50
