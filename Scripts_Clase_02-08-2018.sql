use ventas

CREATE TABLE Cliente(
	codCliente INT NOT NULL AUTO_INCREMENT,
    nombreCliente VARCHAR(100),
    tipoCliente VARCHAR(10),
    PRIMARY KEY (codCliente)
);

CREATE TABLE Producto(
	codProducto INT NOT NULL AUTO_INCREMENT,
    producto VARCHAR(100),
    precio INT,
    PRIMARY KEY (codProducto)
);

insert into cliente (nombreCliente, tipoCliente) values ('Alvaro','vip');
insert into cliente (nombreCliente, tipoCliente) values ('Carlo','normal');

insert into producto (producto, precio) values ('Escritorio',150000);
insert into producto (producto, precio) values ('Silla',55000);

select * from usuario

/*APACHE COMMONS IO/ LANG / 3,7 */

create table Venta(
	numDocumento INT NOT NULL AUTO_INCREMENT,
    fechaDocumento date,
    codProducto int,
	cantidad int,
    codCliente int,
    totalVenta int(9),
    primary key(numDocumento)
);


