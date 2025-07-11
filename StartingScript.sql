DROP SCHEMA IF EXISTS `i-heart-world`;
CREATE SCHEMA `i-heart-world`;
USE `i-heart-world`;

CREATE TABLE IF NOT EXISTS `i-heart-world`.`app_user` (
`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
`user_name` VARCHAR(255) NOT NULL,
`user_password` VARCHAR(255) NOT NULL,
`profile_img_url` VARCHAR(255),
`about` VARCHAR(255),
PRIMARY KEY (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS `i-heart-world`.`user_post` (
`post_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
`user_id` VARCHAR(255) NOT NULL,
`post_text` VARCHAR(255),
`post_img_url` VARCHAR(255),
`post_video_url` VARCHAR(255),
`date_created` DATETIME(6) DEFAULT NULL,
`last_updated` DATETIME(6) DEFAULT NULL,
PRIMARY KEY (`post_id`),
KEY `fk_post_id` (`post_id`),
CONSTRAINT 	`fk_post_id` FOREIGN KEY (`post_id`) REFERENCES `app_user` (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

INSERT INTO app_user(user_name, user_password, profile_img_url, about) VALUES ('worldmaster', 'masterofpuppets', 'https://photos.google.com/photo/AF1QipPgIux9oVOI5qnoyt02mxgzCj13tc_lf4RVf6Yb', 'All things in the universe exist in the universe...or something.');
INSERT INTO user_post(user_id, post_text, post_img_url, date_created) VALUES ('worldmaster', 'I AM HERE!', 'https://photos.google.com/photo/AF1QipPgIux9oVOI5qnoyt02mxgzCj13tc_lf4RVf6Yb', NOW());
