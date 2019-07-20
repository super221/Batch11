create database 7a;
use 7a;

CREATE TABLE category (
  id int(11) NOT NULL AUTO_INCREMENT,
  salary int(11) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE nama (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(25) DEFAULT NULL,
  id_work int(11) DEFAULT NULL,
  id_salary int(11) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE work (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(25) DEFAULT NULL,
  id_salary int(11) DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO category(salary) VALUES(10000000);
INSERT INTO category(salary) VALUES(12000000);

INSERT INTO nama(name, id_work, id_salary) VALUES('Rebecca', 1, 1);
INSERT INTO nama(name, id_work, id_salary) VALUES('Vita', 2, 2);

INSERT INTO work(name, id_salary) VALUES('FrontEnd Dev', 1);
INSERT INTO work(name, id_salary) VALUES('BackEnd Dev', 2);

select * from nama;
select * from category;
select * from work;

select nama.name as name, work.name as work, category.salary from nama
inner join work on nama.id_work=work.id
inner join category on nama.id_salary=category.id;
