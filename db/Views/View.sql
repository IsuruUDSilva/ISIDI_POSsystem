-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2021 at 04:36 PM
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
-- Structure for view `vw_m01_employee`
--

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vw_m01_employee`  AS SELECT `m01`.`M01_ID` AS `M01_ID`, `m01`.`M01_TYPE_ID_M02` AS `M01_TYPE_ID_M02`, `m02`.`M02_NAME` AS `M02_NAME`, `m01`.`M01_ACTIVE` AS `M01_ACTIVE`, CASE WHEN `m01`.`M01_ACTIVE` = 1 THEN 'Yes' ELSE 'No' END AS `is_active`, `m01`.`M01_FIRST_NAME` AS `M01_FIRST_NAME`, `m01`.`M01_LAST_NAME` AS `M01_LAST_NAME`, `m01`.`M01_ADDRESS` AS `M01_ADDRESS`, `m01`.`M01_PHONE` AS `M01_PHONE`, `m01`.`M01_NIC` AS `M01_NIC`, `m01`.`M01_USER_NAME` AS `M01_USER_NAME` FROM (`m01_employee` `m01` join `m02_employee_type` `m02` on(`m02`.`M02_ID` = `m01`.`M01_TYPE_ID_M02`)) ;

--
-- VIEW `vw_m01_employee`
-- Data: None
--

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
