desc customer;

desc address;

select * from address;

select a.address, a.district, c.city 
from address a inner join city c using (city_id);

select a.address, a.district, c.city , cn.country
from address a inner join city c using (city_id)
inner join country cn using(country_id);

select concat_ws(' ', cs.first_name, cs.last_name) as 'Customer', cs.email, a.address, a.postal_code, a.district, c.city , cn.country
from customer cs 
inner join address a using (address_id)
inner join city c using (city_id)
inner join country cn using(country_id);


select c.first_name, c.last_name , a.address
from customer c left join address a
using (address_id);

desc customer;

insert into customer (store_id, first_name, last_name, email, address_id, active, create_date, last_update)
values(1, 'Ashish', 'S', 'ashish.s.@gmail.com', null, 1, now(), now());