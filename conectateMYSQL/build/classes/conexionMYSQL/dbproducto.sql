-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-03-2015 a las 18:08:59
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dbproducto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tproducto`
--

CREATE TABLE IF NOT EXISTS `tproducto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) NOT NULL,
  `precioVenta` decimal(8,2) NOT NULL,
  `fechaVencimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaModificacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `tproducto`
--

INSERT INTO `tproducto` (`idProducto`, `nombre`, `precioVenta`, `fechaVencimiento`, `estado`, `fechaRegistro`, `fechaModificacion`) VALUES
(1, 'AAAhhhhh', '14.00', '2015-03-18', 1, '2015-03-12 13:47:11', '2015-03-12 14:07:49'),
(4, 'kiko', '6.00', '2015-03-11', 1, '2015-03-12 16:27:01', '2015-03-12 16:27:01'),
(5, 'kiko', '6.00', '2015-03-11', 1, '2015-03-12 16:29:05', '2015-03-12 16:29:05');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
