drop database if exists myDB;
create database myDB;
use myDB;
create table ffUser(UserID int primary key auto_increment not null, FirstName varchar(50) not null, LastName varchar(50) not null, Email varchar(20) not null);