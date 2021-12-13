-- DDL Data definition Lanaguage

-- Library

use dxc;



Create Table Books (
	book_id int,
    title varchar(100),
    author varchar(100),
    publish_date date,
    isbn13 varchar(13)
);

desc books;

drop table books;

alter table books add isbn10 varchar(10);

desc books;

alter table books drop column isbn10;

desc books;

alter table books add isbn10 varchar(10) first;

desc books;

alter table books add isbn10 varchar(10) after publish_date;

desc books;

alter table books modify isbn10 char(10);

desc books;

alter table books rename to book_details;

desc book_details;

alter table book_details rename to books;

desc books;

insert into books values ( 'some new book', 'new author', now(), '123-123', '1235-123-1');

insert into books (book_id, title, author) values (2, 'another book', 'another author');

select * from books;

update books set isbn13 = '123-124-5' where book_id = 2;

update books set isbn13 = '123-124-5';

delete from books where book_id = 2;

select * from books;

delete from books;

select * from books;

truncate table books;

show tables;

drop table address;

drop table customer;

drop  table books;

show tables;

Create Table Books (
	book_id int primary key auto_increment,
    title varchar(100) unique,
    author varchar(100) not null,
    publish_date date not null,
    isbn13 varchar(13) null
);

Create table authors (
	author_id int auto_increment,
    name varchar(100),
    email varchar(100),
    primary key (author_id)
);

desc books;

desc authors;

alter table authors add unique index ux_email (email asc);

alter table books add constraint uq_title unique(title);

create table reminders (
	id int primary key auto_increment,
    reminder varchar(100) not null,
    created_at datetime not null
);

desc reminders;

insert into reminders ( reminder, created_at) 
values 
	('try', now()),
    ('56456', now()),
    ('nmnmnm', now()),
    ('aqss', now()),
    ('zzz', now());
	
select * from reminders;

select curdate(), now();