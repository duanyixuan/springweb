create database if not exists springweb character set = 'utf8';
use springweb;
create table if not exists user (id int(11),name varchar(255));

insert into user(id,name) value (1,'zhang');
insert into user(id,name) value (2,'li');
