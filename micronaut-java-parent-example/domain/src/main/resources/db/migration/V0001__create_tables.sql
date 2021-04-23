create table Todo
(
    id           integer primary key generated always as identity,
    title        varchar(255) not null,
    creation_date timestamp    not null,
    done_date     timestamp    null
);
create index idx_Todo_creationDate on Todo (creation_date);
