INSERT INTO `Brand` (`name`) VALUES ('BabyLoop');
INSERT INTO `Brand` (`name`) VALUES ('Book in Loop');

INSERT INTO `Tax` (`tax`) VALUES (10);
INSERT INTO `Tax` (`tax`) VALUES (15);
INSERT INTO `Tax` (`tax`) VALUES (20);


INSERT INTO `Price` (`brand_id`, `product_id`, `priority`, `price`, `curr`, `start_date`, `end_date`, `tax_id`) VALUES (1, 35455, 0, 35.50, 'EUR', '2020-06-14 00.00.00','2020-12-31 23.59.59', 1);
INSERT INTO `Price` (`brand_id`, `product_id`, `priority`, `price`, `curr`, `start_date`, `end_date`, `tax_id`) VALUES (1, 35455, 1, 25.45, 'EUR', '2020-06-14 15.00.00','2020-06-14 18.30.00', 2);
INSERT INTO `Price` (`brand_id`, `product_id`, `priority`, `price`, `curr`, `start_date`, `end_date`, `tax_id`) VALUES (1, 35455, 1, 30.50, 'EUR', '2020-06-15 00.00.00','2020-06-15 11.00.00', 1);
INSERT INTO `Price` (`brand_id`, `product_id`, `priority`, `price`, `curr`, `start_date`, `end_date`, `tax_id`) VALUES (1, 35455, 1, 38.95, 'EUR', '2020-06-15 16.00.00','2020-12-31 23.59.59', 3);


