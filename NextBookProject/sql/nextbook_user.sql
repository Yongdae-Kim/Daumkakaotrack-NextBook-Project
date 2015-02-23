CREATE database nextbook;
	  
use nextbook;
CREATE  TABLE users (
	username VARCHAR(45) NOT NULL ,
	password VARCHAR(45) NOT NULL ,
	enabled TINYINT NOT NULL DEFAULT 1 ,
	PRIMARY KEY (username));

use nextbook;
CREATE TABLE user_roles (
  	user_role_id INT(11) NOT NULL AUTO_INCREMENT,
 	username VARCHAR(45) NOT NULL,
  	ROLE VARCHAR(45) NOT NULL,
  	PRIMARY KEY (user_role_id),
  	UNIQUE KEY uni_username_role (ROLE,username),
  	KEY fk_username_idx (username),
  	CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));
 
use nextbook; 	
INSERT INTO users(username,password,enabled)
VALUES ('admin@hanmail.net','1234', TRUE);
INSERT INTO user_roles (username, ROLE)
VALUES ('admin@hanmail.net', 'ROLE_USER');
INSERT INTO user_roles (username, ROLE)
VALUES ('admin@hanmail.net', 'ROLE_ADMIN');


use nextbook;
ALTER TABLE users convert to charset utf8;
ALTER TABLE user_roles convert to charset utf8;

use nextbook;
alter table users convert to character set utf8 username utf8_general_ci 
alter table user_roles convert to character set utf8 username utf8_general_ci 
