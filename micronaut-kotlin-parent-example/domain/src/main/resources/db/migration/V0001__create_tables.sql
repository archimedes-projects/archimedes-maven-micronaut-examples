create table todo
(
    id            integer primary key generated always as identity,
    title         varchar(255) not null,
    creation_date timestamp    not null,
    done_date     timestamp    null
);
create index idx_todo_creation_date on Todo (creation_date);
