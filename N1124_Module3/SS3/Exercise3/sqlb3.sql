CREATE DATABASE bank_management;

USE bank_management;

CREATE TABLE `CLIENT` (
	 id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL
);

CREATE TABLE `ACCOUNT` (
	id INT PRIMARY KEY AUTO_INCREMENT,
    so_du DECIMAL(15,2),
    khach_hang_id INT UNIQUE,
    FOREIGN KEY (khach_hang_id) REFERENCES CLIENT(id)
)