-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2021 at 11:58 AM
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
-- Table structure for table `z02_columns`
--

CREATE TABLE `z02_columns` (
  `Z02_ID_Z01` int(11) NOT NULL,
  `Z02_COLUMN_NAME` varchar(200) NOT NULL,
  `Z02_COLUMN_DISPLAY_NAME` varchar(200) NOT NULL,
  `Z02_COLUMN_LENGTH` int(11) NOT NULL,
  `Z02_SEQUENCE` int(11) NOT NULL,
  `Z02_TYPE` int(11) NOT NULL COMMENT '0 - int, 1 - string, 2- date'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `z02_columns`
--

INSERT INTO `z02_columns` (`Z02_ID_Z01`, `Z02_COLUMN_NAME`, `Z02_COLUMN_DISPLAY_NAME`, `Z02_COLUMN_LENGTH`, `Z02_SEQUENCE`, `Z02_TYPE`) VALUES
(1, 'isActive', 'Active', 100, 2, 1),
(1, 'm01Address', 'Address', 250, 8, 1),
(1, 'm01FirstName', 'First Name', 200, 5, 1),
(1, 'm01Id', 'ID', 50, 1, 0),
(1, 'm01LastName', 'Last Name', 200, 6, 1),
(1, 'm01Nic', 'NIC N0.', 100, 9, 1),
(1, 'm01Phone', 'Tel.', 100, 7, 1),
(1, 'm01UserName', 'User Name', 150, 4, 1),
(1, 'm02Name', 'Type', 150, 3, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `z02_columns`
--
ALTER TABLE `z02_columns`
  ADD PRIMARY KEY (`Z02_ID_Z01`,`Z02_COLUMN_NAME`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
