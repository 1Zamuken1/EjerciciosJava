-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2022 a las 04:11:45
-- Versión del servidor: 5.6.26
-- Versión de PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `programadores`
--
CREATE DATABASE IF NOT EXISTS `programadores` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `programadores`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `cli_codigo` int(10) NOT NULL,
  `cli_nombres` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `cli_apellidos` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `cli_direccion` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `cli_telefono` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `edad` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cli_codigo`, `cli_nombres`, `cli_apellidos`, `cli_direccion`, `cli_telefono`, `edad`) VALUES
(1, 'victor', 'rincon', 'cra 34 45 ', '22234556', 0),
(2, 'hernando', 'melin', 'cra 23 34 21', '7775565', 0),
(3, 'vanessa', 'aguirre', 'cra 45 # 12 - 90', '2334425', 0),
(4, 'alejandro', 'munevar', 'av 34 # 23 - 67', '5676764', 0),
(5, 'manuel', 'perixio', 'hgh455', '98088', 0),
(6, 'crispulo', 'walteros', 'cra 34 45 ', '23332123', 34),
(7, 'Maria Renata', 'Zamora Benitez', 'Cra 28 # 12-90', '4455665', 32),
(8, 'hugo', 'peresa', 'cra34 56 56', '6667777', 23),
(9, 'polioas', 'asavax', 'cra34 56 7', '3334545', 34),
(10, 'gustavo', 'perdomo', 'cra 34 12 35', '2334567', 34),
(11, 'victor asprilla', 'asprilla', 'cra b56 34 56', '1234555', 23);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cli_codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `cli_codigo` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
