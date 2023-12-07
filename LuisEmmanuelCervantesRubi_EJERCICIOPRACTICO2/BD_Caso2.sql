-- Crear la base de datos
drop schema if exists AerolineaDB;
CREATE DATABASE AerolineaDB;
drop user if exists usuario_caso2;
-- Usar la base de datos
USE AerolineaDB;

create user 'usuario_caso2'@'%' identified by 'clave_caso2';
grant all privileges on AerolineaDB.* to 'usuario_caso2'@'%';

-- Crear la tabla Vuelos
CREATE TABLE Vuelos (
    id_vuelo INT AUTO_INCREMENT PRIMARY KEY,
    numero_vuelo VARCHAR(20) NOT NULL,
    destino VARCHAR(100) NOT NULL,
    lugar_salida VARCHAR(100) NOT NULL,
    hora_salida TIME NOT NULL,
    fecha_salida DATE NOT NULL,
    fecha_llegada DATE NOT NULL,
    modelo_avion VARCHAR(50) NOT NULL
);

-- Crear la tabla Roles
CREATE TABLE Roles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL
);

-- Crear la tabla Cliente
CREATE TABLE Cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    telefono VARCHAR(20) NOT NULL,
    nombre_usuario VARCHAR(50) NOT NULL,
    contrasena VARCHAR(100) NOT NULL,
    id_rol INT,
    activo bool,
    FOREIGN KEY (id_rol) REFERENCES Roles(id)
);


-- Crear la tabla Prereservas
CREATE TABLE Prereservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_vuelo INT NOT NULL,
    id_cliente INT NOT NULL,
    FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_vuelo),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

-- Crear la tabla Reserva
CREATE TABLE Reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_vuelo INT NOT NULL,
    id_cliente INT NOT NULL,
    fecha_reserva DATETIME NOT NULL,
    FOREIGN KEY (id_vuelo) REFERENCES Vuelos(id_vuelo),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

-- Insertar roles
INSERT INTO Roles (nombre)
VALUES ('administrador'), ('usuario');

-- Insertar datos de ejemplo en la tabla Cliente
INSERT INTO Cliente (nombre, apellido, correo, telefono, nombre_usuario, contrasena, id_rol)
VALUES
    ('Juan', 'Pérez', 'juan@example.com', '123-456-7890', 'juan_perez', 'secretpassword', 2),
    ('María', 'García', 'maria@example.com', '987-654-3210', 'maria_garcia', 'mypassword', 2),
    ('Carlos', 'López', 'carlos@example.com', '555-123-4567', 'carlos_lopez', '123456', 2),
    ('Admin', 'Admin', 'admin@example.com', '111-111-1111', 'admin', 'adminpassword', 1);
    
INSERT INTO Vuelos (numero_vuelo, destino, lugar_salida, hora_salida, fecha_salida, fecha_llegada, modelo_avion)
VALUES 
	('V1', 'Irlanda', 'San José', '12:30:00', '2023-12-01', '2023-12-02', 'Avión Modelo a'),
	('V2', 'Cartagena', 'San José', '14:45:00', '2023-12-03', '2023-12-04', 'Avión Modelo b'),
	('V3', 'Argentina', 'San José', '09:00:00', '2023-12-05', '2023-12-06', 'Avión Modelo c'),
    ('V4', 'Colombia', 'San José', '18:15:00', '2023-12-07', '2023-12-08', 'Avión Modelo d');

