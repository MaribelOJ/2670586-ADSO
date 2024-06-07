-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 07, 2024 at 10:16 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `api_deportes`
--

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nombre`) VALUES
(1, 'deporte de campo'),
(2, 'deporte acuático'),
(3, 'deporte de contacto'),
(4, 'deporte de resistencia');

-- --------------------------------------------------------

--
-- Table structure for table `deportes`
--

CREATE TABLE `deportes` (
  `id_deporte` int NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `modalidad` enum('individual','equipos','dobles','mixtos') DEFAULT NULL,
  `participantes_min` int DEFAULT NULL,
  `participantes_max` int DEFAULT NULL,
  `implementos` varchar(255) NOT NULL,
  `categoria` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `deportes`
--

INSERT INTO `deportes` (`id_deporte`, `nombre`, `modalidad`, `participantes_min`, `participantes_max`, `implementos`, `categoria`) VALUES
(1, 'Tenis', 'individual', 1, 1, 'Raquetas,pelotas,red', 1),
(2, 'Tenis', 'dobles', 2, 2, 'Raquetas,pelotas,red', 1),
(3, 'Ciclismo', 'individual', 1, 1, 'Bicicleta, Casco', 4),
(4, 'Futbol', 'equipos', 11, 14, 'pelotas', 1),
(5, 'Hockey sobre Hielo', 'equipos', 6, 14, 'Palo, Disco, Patines', 3),
(6, 'Surf', 'individual', 1, 1, 'Tabla de surf', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indexes for table `deportes`
--
ALTER TABLE `deportes`
  ADD PRIMARY KEY (`id_deporte`),
  ADD KEY `categoria` (`categoria`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `deportes`
--
ALTER TABLE `deportes`
  MODIFY `id_deporte` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `deportes`
--
ALTER TABLE `deportes`
  ADD CONSTRAINT `deportes_ibfk_1` FOREIGN KEY (`categoria`) REFERENCES `categoria` (`id_categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
