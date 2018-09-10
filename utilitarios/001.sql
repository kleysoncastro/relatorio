show databases;
create database login;
use login;

create table lider(
id_lider int(11) primary key,
nome varchar(15) not null,
tipo int(2) not null default 1) charset=utf8;