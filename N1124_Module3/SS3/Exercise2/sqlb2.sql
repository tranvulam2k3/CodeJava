CREATE DATABASE information_management;

USE information_management;

CREATE TABLE CON_NGUOI (
	 id INT PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(50) NOT NULL
);

CREATE TABLE PHONE (
	 id INT PRIMARY KEY AUTO_INCREMENT,
    sdt VARCHAR(50) NOT NULL,
    nguoi_id int,
    FOREIGN KEY (nguoi_id) REFERENCES CON_NGUOI(id)
);

CREATE TABLE EMAIL (
	id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(50) NOT NULL,
    nguoi_id int,
    FOREIGN KEY (nguoi_id) REFERENCES CON_NGUOI(id)
);