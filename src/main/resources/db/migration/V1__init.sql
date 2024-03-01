BEGIN;

CREATE SEQUENCE account_id_seq;
CREATE SEQUENCE user_id_seq;

CREATE TABLE category (id integer not null default nextval ('category_id_seq') primary key, title varchar(255));
INSERT INTO category (title) values
('Sneck'),
('TEA'),
('Ckitchen');

CREATE TABLE product (
id integer not null default nextval ('product_id_seq') primary key, title varchar(255), price integer, category_id integer REFERENCES category (id) ) ;
--FOREIGN KEY (category_id) REFERENCES category (id)
INSERT INTO product (title, price) values
('Product1', 100),
('Product2', 200),
('Product3', 300),
('Product4', 400),
('Product5', 500),
('Product6', 600),
('Product7', 700),
('Product8', 800),
('Product9', 900),
('Product10', 1000),
('Product11', 1100);