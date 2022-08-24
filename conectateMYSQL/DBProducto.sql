create database DBProducto;
use DBProducto;

create table TProducto
(
idProducto int NOT NULL AUTO_INCREMENT,
nombre varchar(700) NOT NULL,
precioVenta decimal(8,2) NOT NULL,
fechaVencimiento date NOT NULL,
estado bool NOT NULL,
fechaRegistro timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
fechaModificacion timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
PRIMARY KEY (idProducto)
);