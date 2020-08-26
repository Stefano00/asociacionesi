create database asociacionesi;
use asociacionesi;
create table direccion(id integer not null auto_increment primary key, calle varchar(100), numero int, ciudad varchar(100), tipo varchar(100));
select * from direccion;

create table alumno (id integer not null auto_increment primary key, rut varchar(100), nombre varchar(100), apellido varchar(100), email varchar(100), edad int, fechaingreso date, idDireccion Integer not null, foreign key(idDireccion) references direccion(id));
select * from alumno;
insert into alumno values(1,'17953245-k','Stefano','Marin', 'stefano.marin@gmail.com', 28,'1992-07-01',1);
insert into alumno values(2,'17953245-k','Stefano','Marin', 'stefano.marin@gmail.com', 28,'1992-07-01',2);

select * from alumno a inner join direccion d on a.idDireccion = d.id where a.id=3;