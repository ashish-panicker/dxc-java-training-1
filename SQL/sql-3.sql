select * from film;

select title as 'Movie Name', description as 'Movie Summary', rating from film;

select f.title as 'Movie' from film f;

select concat('welcome', 'to', 'mysql', 'database') as 'result';

select concat_ws(' ', 'welcome', 'to', 'mysql', 'database') as 'result';

select now();

desc actor;

select concat_ws(' ', first_name, last_name) as 'Full Name' from actor;

select length(concat_ws(' ', first_name, last_name)) as 'Chars in Name' from actor;

select length(trim(concat_ws(' ', first_name, last_name))) as 'Chars in Name' from actor;

select reverse(concat_ws(' ', first_name, last_name)) as 'Full Name' from actor;

select replace('hello world', 'hello', 'hey');
