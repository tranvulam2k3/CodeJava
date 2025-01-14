CREATE DATABASE store_management;

USE store_management;

CREATE TABLE product(
	id int primary key auto_increment,
    name varchar(225) not null,
    description varchar(225),
    price float,
    stock float
);

/*  Thêm dữ liệu */
-- b
INSERT INTO product VALUES (null , 'product 1' , 'description 1' , 10000, 50);
-- c
INSERT INTO product (name, description, price, stock) 
VALUES ('product 2', 'description 2', 300000, 20);
-- d 
INSERT INTO product (name, price) 
VALUES ('product 3', 500000);

/*  Truy vấn dữ liệu */
-- a
SELECT * FROM store_management.product;
-- b
SELECT id, name, price FROM product;
-- c
SELECT id, name, price 
FROM product 
WHERE price < 10000000;

/*  Cập nhật dữ liệu */
-- a
UPDATE product 
SET price = price * 1.1;
-- b 
UPDATE product 
SET stock = stock - 5 
WHERE id = 1;

/*  Chỉnh sửa bảng */
-- a
ALTER TABLE product 
ADD COLUMN barcode VARCHAR(100) DEFAULT NULL;
-- b
ALTER TABLE product 
ADD COLUMN warranty INT DEFAULT 6;

/*  Xóa dữ liệu  */
-- a
DELETE FROM product;
-- b
DELETE FROM product 
WHERE price > 500000;

/*  Xóa bảng  */
DROP TABLE product;

/*  Xóa csdl  */
DROP DATABASE IF EXISTS database_name;