CREATE SCHEMA IF NOT EXISTS store DEFAULT CHARACTER SET utf8 ;
USE store ;


-- -----------------------------------------------------
-- Table `products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS products (
  prod_id INT NOT NULL AUTO_INCREMENT,
  prod_name VARCHAR(25) NOT NULL,
  prod_suppl VARCHAR(25) NOT NULL,
  PRIMARY KEY (prod_id))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`custom`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS custom (
  id_cust INT NOT NULL AUTO_INCREMENT,
  cus_kind_document VARCHAR(15) NOT NULL,
  cus_document VARCHAR(12) NOT NULL,
  products_prod_id INT NOT NULL,
  PRIMARY KEY (id_cust, products_prod_id),
  INDEX fk_custom_products_idx (products_prod_id ASC) VISIBLE,
  CONSTRAINT fk_custom_products
    FOREIGN KEY (products_prod_id)
    REFERENCES products (prod_id)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;

-- Insert new products in the products table--
INSERT INTO products (prod_name, prod_suppl)
VALUES ('Sparkies', 'Sweets INC');

INSERT INTO products (prod_name, prod_suppl)
VALUES ('Soda', 'Postobon SA');

INSERT INTO products (prod_name, prod_suppl)
VALUES ('Suggar', 'Azucareros SAS');


INSERT INTO products (prod_name, prod_suppl)
VALUES ('Milk', 'Colanta');

INSERT INTO products (prod_name, prod_suppl)
VALUES ('Mr Roa', 'Arroz Colombiano SA');

-- Insert new sells in the customs table --
insert into custom(cus_kind_document, cus_document, products_prod_id)
values ('TI', '12345568', 4);

SELECT id_cust, cus_kind_document, cus_document, products_prod_id
FROM custom;

-- Delete lines of the custom table --
DELETE FROM custom
where id_cust = 5;


-- Modify products, and supplier of products --
UPDATE products
set prod_name = 'Lecherita', prod_suppl = 'La Lechera SA' where prod_id = 3;

UPDATE products
set prod_name = 'Margaritas', prod_suppl = 'Pepsico' where prod_id = 1;

UPDATE products
set prod_name = 'Orea', prod_suppl = 'Galletas SI' where prod_id = 4;