create database dxc;

use dxc;

create table customer (
customer_id int primary key auto_increment, 
name varchar(100), 
email varchar(100),
address_id int,
constraint fk_address foreign key (address_id) references address(address_id)
);

create table address (address_id int primary key auto_increment, state varchar(100), city varchar(100));

alter table customer add address_id int ;

drop table customer;

desc customer;

insert into address (state, city) values ('Kerala', 'Tvpm');

select * from address;

insert into customer (name, email, address_id) values('ashish', 'ashish.s', 1);
insert into customer (name, email, address_id) values('arun', 'arun.s', null);

select * from customer;

select c.name, c.email , a.city, a.state
from customer c inner join address a using (address_id);

select c.name, c.email , a.city, a.state
from customer c left join address a using (address_id);
