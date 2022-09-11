CREATE SCHEMA IF NOT EXISTS agenda DEFAULT CHARACTER SET utf8 ;
USE agenda ;

CREATE TABLE IF NOT EXISTS agenda (
  contact_id INT NOT NULL AUTO_INCREMENT,
  contact_name VARCHAR(25) NOT NULL,
  contact_number VARCHAR(15) NOT NULL,
  contact_email VARCHAR(40) NOT NULL,
  contact_born VARCHAR(45) NOT NULL,
  PRIMARY KEY (`contact_id`))
ENGINE = InnoDB;

INSERT INTO agenda (contact_name, contact_number, contact_email, contact_born)
VALUES ('Cristian Gallego', '3147146565', 'cris.gahur@hotmail.com', '26/12/1996');