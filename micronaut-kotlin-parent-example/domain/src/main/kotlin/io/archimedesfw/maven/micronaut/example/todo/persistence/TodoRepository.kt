package io.archimedesfw.maven.micronaut.example.todo.persistence

import io.archimedesfw.maven.micronaut.example.todo.Todo
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = POSTGRES)
interface TodoRepository : CrudRepository<Todo, Int>
