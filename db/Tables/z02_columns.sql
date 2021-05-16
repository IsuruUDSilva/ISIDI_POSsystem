-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2021 at 03:52 PM
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
  `Z02_SEQUENCE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `z02_columns`
--

INSERT INTO `z02_columns` (`Z02_ID_Z01`, `Z02_COLUMN_NAME`, `Z02_COLUMN_DISPLAY_NAME`, `Z02_COLUMN_LENGTH`, `Z02_SEQUENCE`) VALUES
(1, 'is_active', 'Active', 100, 2),
(1, 'M01_ADDRESS', 'Address', 250, 8),
(1, 'M01_FIRST_NAME', 'First Name', 200, 5),
(1, 'M01_ID', 'ID', 50, 1),
(1, 'M01_LAST_NAME', 'Last Name', 200, 6),
(1, 'M01_NIC', 'NIC N0.', 100, 9),
(1, 'M01_PHONE', 'Tel.', 100, 7),
(1, 'M01_USER_NAME', 'User Name', 150, 4),
(1, 'M02_NAME', 'Type', 150, 3);

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
