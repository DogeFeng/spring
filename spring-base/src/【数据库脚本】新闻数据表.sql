DROP DATABASE IF EXISTS lee ;
CREATE DATABASE lee CHARACTER SET UTF8 ;
USE lee ;
CREATE TABLE news(
  nid     BIGINT    AUTO_INCREMENT ,
  title   VARCHAR(50) ,
  note    TEXT ,
  pubdate   DATE ,
  price   DOUBLE ,
  readcount INT ,
  CONSTRAINT pk_nid PRIMARY KEY(nid)
) engine=innodb;