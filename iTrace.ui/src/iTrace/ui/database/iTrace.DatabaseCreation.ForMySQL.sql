CREATE DATABASE  IF NOT EXISTS `itrace_m2datdb` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci */;
USE `itrace_m2datdb`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: itrace_m2datdb
-- ------------------------------------------------------
-- Server version	5.5.25a

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
-- Table structure for table `artefact`
--

DROP TABLE IF EXISTS `artefact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artefact` (
  `uuid_artefact` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `artefact` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `aspect` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `name` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `abstractionLevel` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `metamodel` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `path` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `artefactType` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `iTraceModel` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`uuid_artefact`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `itracemodel`
--

DROP TABLE IF EXISTS `itracemodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itracemodel` (
  `uuid_iTraceModel` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `iTraceModel` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `version` varchar(5) COLLATE latin1_spanish_ci NOT NULL,
  `projectName` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`iTraceModel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tracelinkelement`
--

DROP TABLE IF EXISTS `tracelinkelement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tracelinkelement` (
  `uuid_traceLinkElement` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `traceLinkElement` varchar(200) COLLATE latin1_spanish_ci NOT NULL,
  `ref` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `objectType` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `relationType` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `artefact` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `traceLink` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`traceLinkElement`,`traceLink`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tracelink`
--

DROP TABLE IF EXISTS `tracelink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tracelink` (
  `uuid_traceLink` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `traceLink` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `createdOn` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `type` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `fromFileName` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `tl_comment` varchar(10000) COLLATE latin1_spanish_ci DEFAULT NULL,
  `createdBy` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `tl_mode` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `technicalBinding` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `ruleName` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `linkType` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `iTraceModel` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`traceLink`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `feature`
--

DROP TABLE IF EXISTS `feature`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feature` (
  `uuid_feature` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `feature` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `groupName` varchar(100) COLLATE latin1_spanish_ci DEFAULT NULL,
  `attribute` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `value` varchar(50) COLLATE latin1_spanish_ci DEFAULT NULL,
  `iTraceModel` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`uuid_feature`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `block`
--

DROP TABLE IF EXISTS `block`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `block` (
  `uuid_block` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `block` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `blockNumber` int(11) NOT NULL,
  `startLine` int(11) NOT NULL,
  `endLine` int(11) NOT NULL,
  `startColumn` int(11) NOT NULL,
  `endColumn` int(11) NOT NULL,
  `artefact` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `traceLink` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  PRIMARY KEY (`block`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-11-13 17:39:25
