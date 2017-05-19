create table user (
id int(11) primary key,
username varchar(30) not null UNIQUE,
password varchar(30) not null
);