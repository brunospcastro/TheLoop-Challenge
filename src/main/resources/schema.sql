CREATE TABLE IF NOT EXISTS `Brand` (
  `id`    INT             AUTO_INCREMENT     PRIMARY KEY,
  `name`  varchar(128)    NOT NULL
);


CREATE TABLE IF NOT EXISTS `Price` (
  `id`          INT             AUTO_INCREMENT  PRIMARY KEY,
  `brand_id`    INT             AUTO_INCREMENT  NOT NULL,
  `priority`    INT             NOT NULL, 
  `product_id`  INT,
  `price`       DECIMAL(6,2)    NOT NULL,
  `curr`        varchar(10)     NOT NULL,
  `start_date`  TIMESTAMP       NOT NULL,
  `end_date`    TIMESTAMP       NOT NULL,
  FOREIGN KEY(brand_id) REFERENCES Brand(id) 
);



 

