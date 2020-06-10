-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.1.37-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for fundnesia
CREATE DATABASE IF NOT EXISTS `fundnesia` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `fundnesia`;

-- Dumping structure for table fundnesia.loan
CREATE TABLE IF NOT EXISTS `loan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenure` int(11) NOT NULL DEFAULT '0',
  `ticketSize` double NOT NULL DEFAULT '0',
  `fee` double NOT NULL DEFAULT '0',
  `totaLoan` double NOT NULL DEFAULT '0',
  `installmentPerMonth` double NOT NULL DEFAULT '0',
  `status` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Dumping data for table fundnesia.loan: ~0 rows (approximately)
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
INSERT IGNORE INTO `loan` (`id`, `tenure`, `ticketSize`, `fee`, `totaLoan`, `installmentPerMonth`, `status`) VALUES
	(1, 3, 1000000, 0, 0, 0, 'SUBMITTED'),
	(2, 3, 1000000, 0, 0, 0, 'SUBMITTED'),
	(3, 12, 1000000, 0, 0, 0, 'SUBMITTED'),
	(4, 6, 1000, 0, 1000, 166.67, 'SUBMITTED'),
	(5, 10, 100000, 20000, 120000, 12000, 'SUBMITTED'),
	(6, 10, 100000, 20000, 120000, 12000, 'SUBMITTED'),
	(7, 10, 100000, 20000, 120000, 12000, 'SUBMITTED');
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
