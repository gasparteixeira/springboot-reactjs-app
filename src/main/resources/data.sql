insert into author (first_name, last_name) values ('John', 'Doe');
insert into author (first_name, last_name) values ('Fabien', 'Potencier');

insert into book (title, isbn, publisher) values ('Spring Boot', 'ISBN9878', 'Djando');
insert into book (title, isbn, publisher) values ('ReactJS', 'ISBN001235', 'Da Vinci');
insert into book (title, isbn, publisher) values ('Symfony PHP', 'ISBN988898', 'Fabien');
insert into book (title, isbn, publisher) values ('Bootstrap 4', 'ISBN93938', 'Djando');
insert into book (title, isbn, publisher) values ('HTML5', 'ISBN89378', 'Maujor');

insert into author_book (book_id, author_id) values (1, 1);
insert into author_book (book_id, author_id) values (2, 1);
insert into author_book (book_id, author_id) values (3, 2);
insert into author_book (book_id, author_id) values (4, 2);
insert into author_book (book_id, author_id) values (5, 1);