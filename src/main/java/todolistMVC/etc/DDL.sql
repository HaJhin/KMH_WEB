drop database if exists prac1;
create database prac1;
use prac1;

create table todo(
lno int unsigned auto_increment ,
lcontent longtext not null ,
lstatus boolean not null ,
primary key(lno)
);

insert into todo(lcontent , lstatus) values('샘플 할 일 1' , true);
insert into todo(lcontent , lstatus) values('샘플 할 일 2' , false);

select * from todo;