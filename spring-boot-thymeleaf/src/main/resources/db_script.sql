CREATE SCHEMA `spring_thymeleaf` ;

CREATE TABLE `spring_thymeleaf`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `price` DECIMAL NOT NULL,
  PRIMARY KEY (`id`));