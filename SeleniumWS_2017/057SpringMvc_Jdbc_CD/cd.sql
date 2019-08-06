create database cd;
DROP TABLE IF EXISTS cd.`items`;
CREATE TABLE cd.`items` (
  `item_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) NOT NULL,
  `item_price` double unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`item_id`)
);


insert  into cd.`items`(`item_id`,`item_name`,`item_price`) values (1,'CD',100),(2,'DVD',150),(3,'ABC',24),(4,'XYZ',25.32),(5,'CD Player',30.02);


drop table test.employee;

create table test.employee(empid integer,firstname varchar(40),lastname varchar(40));

insert into test.employee values(101,'smita','kumar');