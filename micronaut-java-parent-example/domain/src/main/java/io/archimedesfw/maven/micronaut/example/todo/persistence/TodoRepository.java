package io.archimedesfw.maven.micronaut.example.todo.persistence;

import io.archimedesfw.maven.micronaut.example.todo.Todo;

import java.util.List;

public interface TodoRepository {

    List<Todo> findAll();

    Todo findBy(int id);

}
