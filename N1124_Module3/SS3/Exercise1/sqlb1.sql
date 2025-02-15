CREATE DATABASE BOOK_MANAGEMENT;

USE BOOK_MANAGEMENT;

CREATE TABLE AUTHOR (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(50) NOT NULL
);

CREATE TABLE STAFF (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(50) NOT NULL,
    DIACHI VARCHAR(225)
);

CREATE TABLE BOOK (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(50) NOT NULL,
    GIA DECIMAL,
    AUTHOR_ID INT NOT NULL,
    STAFF_ID INT NOT NULL,
    FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR(ID),
    FOREIGN KEY (STAFF_ID) REFERENCES STAFF(ID)
);

