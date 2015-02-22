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
CREATE TABLE books (
  	isdn VARCHAR(45) NOT NULL ,
	title VARCHAR(45) NOT NULL ,
	author VARCHAR(45) NOT NULL ,
	publisher VARCHAR(45) NOT NULL ,
	genre_num INT(11) NOT NULL ,
	PRIMARY KEY (isdn));

use nextbook;
INSERT INTO books(isdn, title, author, publisher, genre_num)
VALUES ('978-86-6077-438-4','미래를 바꾼 아홉가지 알고리즘', '존 맥코빅 지음 / 민병교 옮김', '에이콘', '1');
	
use nextbook;
INSERT INTO books(isdn, title, author, publisher, genre_num)
VALUES ('978-89-8437-075-3','구해줘', '기욤 뮈소 지음 / 윤미연 옮김', '밝은세상', '2');

INSERT INTO books(isdn, title, author, publisher, genre_num)
VALUES ('978-89-509-2629-8','생각 버리기 연습', '코이케 류노스케 지음 / 유윤환 옮김', '21세기북스', '3');

use nextbook;
CREATE TABLE read_books (
	read_book_id INT(11) NOT NULL AUTO_INCREMENT,
  	username VARCHAR(45) NOT NULL ,
	isdn VARCHAR(45) NOT NULL ,
	PRIMARY KEY (read_book_id),
	FOREIGN KEY (username) REFERENCES users (username),
	FOREIGN KEY (isdn) REFERENCES books (isdn));

use nextbook;
INSERT INTO read_books(username, isdn)
VALUES ('yongdae91@hanmail.net', '978-86-6077-438-4');

use nextbook;
INSERT INTO read_books(username, isdn)
VALUES ('yongdae91@hanmail.net', '978-89-8437-075-3');

use nextbook;
INSERT INTO read_books(username, isdn)
VALUES ('admin@hanmail.net', '978-89-8437-075-3');

use nextbook;
SELECT *
FROM read_books rb LEFT OUTER JOIN books b
ON rb.isdn = b.isdn
WHERE username = 'yongdae91@hanmail.net'
