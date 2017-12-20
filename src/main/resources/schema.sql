drop table author if exists;

create table author (
    id bigint auto_increment,
    first_name varchar(80) null,
    last_name varchar(80) null,
    primary key (id)
);

drop table book if exists;

create table book (
    id bigint auto_increment,
    title varchar(80) null,
    isbn varchar(32) null,
    publisher varchar(80) null,
    primary key (id)
);

drop table author_book if exists;

create table author_book (
    book_id bigint not null REFERENCES book (id),
    author_id bigint not null REFERENCES author (id),
    primary key (book_id, author_id)
);

        

