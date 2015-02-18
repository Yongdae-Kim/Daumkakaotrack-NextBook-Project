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
	

INSERT INTO users(username,password,enabled)
VALUES ('test@hanmail.net','1234', TRUE);
INSERT INTO user_roles (username, ROLE)
VALUES ('zxc@hanmail.net', 'ROLE_USER');

select * from nextbook.`users`

SELECT * FROM nextbook.`users` WHERE username = 'admin@hanmail.net' AND password = '1234';

use nextbook; 
IF EXISTS (SELECT * FROM nextbook.user_roles WHERE name = 'zxc@hanmail.net') DROP USER ['zxc@hanmail.net']
IF EXISTS (SELECT * FROM nextbook.users WHERE name = 'zxc@hanmail.net') DROP USER ['zxc@hanmail.net']

use nextbook;
DELETE FROM nextbook.user_roles WHERE username='rty@hanmail.net';
DELETE FROM nextbook.users WHERE username='rty@hanmail.net';

use nextbook;
SELECT COUNT(*) FROM nextbook.users WHERE username ='rty@hanmail.net'

