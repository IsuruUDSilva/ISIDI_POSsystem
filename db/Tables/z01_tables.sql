-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2021 at 08:30 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pos_isidi`
--

-- --------------------------------------------------------

--
-- Table structure for table `z01_tables`
--

CREATE TABLE `z01_tables` (
  `Z01_ID` int(11) NOT NULL,
  `Z01_TABLE_NAME` varchar(200) NOT NULL,
  `Z01_REFFERENCE_NAME` varchar(200) NOT NULL,
  `Z01_VIEW_NAME` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `z01_tables`
--

INSERT INTO `z01_tables` (`Z01_ID`, `Z01_TABLE_NAME`, `Z01_REFFERENCE_NAME`, `Z01_VIEW_NAME`) VALUES
(1, 'm01_employee', 'employee', 'vw_m01_employee');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `z01_tables`
--
ALTER TABLE `z01_tables`
  ADD PRIMARY KEY (`Z01_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
