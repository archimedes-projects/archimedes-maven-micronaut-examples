package io.archimedesfw.maven.micronaut.example.todo.persistence;

import io.archimedesfw.maven.micronaut.example.todo.Todo;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;

import static io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES;

@JdbcRepository(dialect = POSTGRES)
public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
