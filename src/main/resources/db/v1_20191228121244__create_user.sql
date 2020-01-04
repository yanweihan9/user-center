CREATE TABLE `user_center`.`user`(
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `wx_id` VARCHAR(64),
  `wx_nickname` VARCHAR(64),
  `roles` VARCHAR(100),
  `avatar_url` VARCHAR(255),
  `create_time` DATETIME,
  `update_time` DATETIME,
  `bonus` INT(11),
  PRIMARY KEY (`id`)
);
