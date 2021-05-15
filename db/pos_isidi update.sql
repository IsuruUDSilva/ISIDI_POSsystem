-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2021 at 03:33 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

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
-- Table structure for table `m01_employee`
--

CREATE TABLE `m01_employee` (
  `M01_ID` int(11) NOT NULL,
  `M01_TYPE_ID_M02` int(11) NOT NULL,
  `M01_ACTIVE` tinyint(1) NOT NULL,
  `M01_FIRST_NAME` varchar(200) NOT NULL,
  `M01_LAST_NAME` varchar(200) NOT NULL,
  `M01_ADDRESS` varchar(200) NOT NULL,
  `M01_PHONE` varchar(200) NOT NULL,
  `M01_NIC` varchar(20) NOT NULL,
  `M01_USER_NAME` varchar(100) NOT NULL,
  `M01_PASSWORD` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `m01_employee`
--

INSERT INTO `m01_employee` (`M01_ID`, `M01_TYPE_ID_M02`, `M01_ACTIVE`, `M01_FIRST_NAME`, `M01_LAST_NAME`, `M01_ADDRESS`, `M01_PHONE`, `M01_NIC`, `M01_USER_NAME`, `M01_PASSWORD`) VALUES
(1, 1, 0, 'Prabath', 'Walakanda', 'Kurundugaha', '0768694034', '67148354645V', 'Prabath', 'isidiAqua'),
(2, 2, 1, 'Geshani', 'Sithara', 'Kurundugaha', '0776923093', '784659665V', 'Geshani', 'geshaniAqua'),
(3, 3, 1, 'Chamudi', 'Dinara', 'Pathiraja', '0761261607', '848154886V', 'Chamudi', 'chamuAqua'),
(4, 3, 1, 'Telani', 'Walakanda', 'Kurundugaha', '0768694034', '85264972V', 'Telani', 'telaniAqua');

-- --------------------------------------------------------

--
-- Table structure for table `m02_employee_type`
--

CREATE TABLE `m02_employee_type` (
  `M02_ID` int(11) NOT NULL,
  `M02_NAME` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `m02_employee_type`
--

INSERT INTO `m02_employee_type` (`M02_ID`, `M02_NAME`) VALUES
(1, 'Admin'),
(2, 'Manager'),
(3, 'Cashier');

-- --------------------------------------------------------

--
-- Table structure for table `m03_product`
--

CREATE TABLE `m03_product` (
  `M03_ID` int(11) NOT NULL,
  `M03_NAME` varchar(200) NOT NULL,
  `M03_SIZE` varchar(200) NOT NULL,
  `M03_UNIT_PRICE` double NOT NULL,
  `M03_QUANTITY` int(11) NOT NULL,
  `M03_CATEGORY_ID_M04` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `m03_product`
--

INSERT INTO `m03_product` (`M03_ID`, `M03_NAME`, `M03_SIZE`, `M03_UNIT_PRICE`, `M03_QUANTITY`, `M03_CATEGORY_ID_M04`) VALUES
(1, 'a1', 'M', 120, 2, 1),
(2, 'a2', 'L', 20, 3, 1),
(3, 'b1', 'M', 300, 4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `m04_product_category`
--

CREATE TABLE `m04_product_category` (
  `M04_ID` int(11) NOT NULL,
  `M04_NAME` varchar(200) NOT NULL,
  `M04_IS_MAIN_CATEGORY` tinyint(1) NOT NULL,
  `M04_MAIN_CATEGORY_ID_M04` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `m04_product_category`
--

INSERT INTO `m04_product_category` (`M04_ID`, `M04_NAME`, `M04_IS_MAIN_CATEGORY`, `M04_MAIN_CATEGORY_ID_M04`) VALUES
(1, 'Pet food ', 1, NULL),
(2, 'cat food', 0, 1),
(3, 'Dog food', 0, 1),
(4, 'Rabbit Food', 0, 1),
(5, 'Pigeon Food', 0, 1),
(6, 'Tank Set', 1, NULL),
(7, 'Tank', 0, 2),
(8, 'Tank top(roof)', 0, 2),
(9, 'Tank Stand', 0, 2);

-- --------------------------------------------------------

--
-- Table structure for table `m05_order`
--

CREATE TABLE `m05_order` (
  `M05_ID` int(11) NOT NULL,
  `M05_CODE` int(11) NOT NULL,
  `M05_PRODUCT_ID_M03` int(11) NOT NULL,
  `M05_QUANTITY` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `m05_order`
--

INSERT INTO `m05_order` (`M05_ID`, `M05_CODE`, `M05_PRODUCT_ID_M03`, `M05_QUANTITY`) VALUES
(1, 1, 1, 1),
(2, 1, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `m06_bill`
--

CREATE TABLE `m06_bill` (
  `M06_ID` int(11) NOT NULL,
  `M06_ORDER_CODE` int(11) NOT NULL,
  `M06_DATE_AND_TIME` datetime NOT NULL,
  `M06_CASHIER_ID_M01` int(11) NOT NULL,
  `M06_PAYMENT_METHOD` tinyint(1) NOT NULL,
  `M06_TOTAL_PRICE` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Stand-in structure for view `vw_bill_info`
-- (See below for the actual view)
--
CREATE TABLE `vw_bill_info` (
`M05_CODE` int(11)
,`TOTAL_AMOUNT` double
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `vw_order_info`
-- (See below for the actual view)
--
CREATE TABLE `vw_order_info` (
`M05_ID` int(11)
,`M05_CODE` int(11)
,`M05_PRODUCT_ID_M03` int(11)
,`M05_QUANTITY` int(11)
,`M03_ID` int(11)
,`M03_NAME` varchar(200)
,`M03_SIZE` varchar(200)
,`M03_UNIT_PRICE` double
,`M03_QUANTITY` int(11)
,`M03_CATEGORY_ID_M04` int(11)
);

-- --------------------------------------------------------

--
-- Structure for view `vw_bill_info`
--
DROP TABLE IF EXISTS `vw_bill_info`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vw_bill_info`  AS  select `m05`.`M05_CODE` AS `M05_CODE`,sum(`m03`.`M03_UNIT_PRICE`) AS `TOTAL_AMOUNT` from (`m05_order` `m05` join `m03_product` `m03` on(`m03`.`M03_ID` = `m05`.`M05_PRODUCT_ID_M03`)) group by `m05`.`M05_CODE` ;

-- --------------------------------------------------------

--
-- Structure for view `vw_order_info`
--
DROP TABLE IF EXISTS `vw_order_info`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vw_order_info`  AS  select `m05`.`M05_ID` AS `M05_ID`,`m05`.`M05_CODE` AS `M05_CODE`,`m05`.`M05_PRODUCT_ID_M03` AS `M05_PRODUCT_ID_M03`,`m05`.`M05_QUANTITY` AS `M05_QUANTITY`,`m03`.`M03_ID` AS `M03_ID`,`m03`.`M03_NAME` AS `M03_NAME`,`m03`.`M03_SIZE` AS `M03_SIZE`,`m03`.`M03_UNIT_PRICE` AS `M03_UNIT_PRICE`,`m03`.`M03_QUANTITY` AS `M03_QUANTITY`,`m03`.`M03_CATEGORY_ID_M04` AS `M03_CATEGORY_ID_M04` from (`m05_order` `m05` join `m03_product` `m03` on(`m03`.`M03_ID` = `m05`.`M05_PRODUCT_ID_M03`)) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `m01_employee`
--
ALTER TABLE `m01_employee`
  ADD PRIMARY KEY (`M01_ID`);

--
-- Indexes for table `m02_employee_type`
--
ALTER TABLE `m02_employee_type`
  ADD PRIMARY KEY (`M02_ID`);

--
-- Indexes for table `m03_product`
--
ALTER TABLE `m03_product`
  ADD PRIMARY KEY (`M03_ID`);

--
-- Indexes for table `m04_product_category`
--
ALTER TABLE `m04_product_category`
  ADD PRIMARY KEY (`M04_ID`);

--
-- Indexes for table `m05_order`
--
ALTER TABLE `m05_order`
  ADD PRIMARY KEY (`M05_ID`);

--
-- Indexes for table `m06_bill`
--
ALTER TABLE `m06_bill`
  ADD PRIMARY KEY (`M06_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `m01_employee`
--
ALTER TABLE `m01_employee`
  MODIFY `M01_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `m02_employee_type`
--
ALTER TABLE `m02_employee_type`
  MODIFY `M02_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `m03_product`
--
ALTER TABLE `m03_product`
  MODIFY `M03_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `m04_product_category`
--
ALTER TABLE `m04_product_category`
  MODIFY `M04_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `m05_order`
--
ALTER TABLE `m05_order`
  MODIFY `M05_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `m06_bill`
--
ALTER TABLE `m06_bill`
  MODIFY `M06_ID` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
