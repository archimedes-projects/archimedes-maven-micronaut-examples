package io.archimedesfw.maven.micronaut.example.todo.persistence

import io.archimedesfw.maven.micronaut.example.todo.Todo

interface TodoRepository {

    fun findAll(): List<Todo>

    fun findBy(id: Int): Todo

}
