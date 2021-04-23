package io.archimedesfw.maven.micronaut.example.todo.delivery.rest;


import java.util.List;

import javax.transaction.Transactional;

import io.archimedesfw.maven.micronaut.example.todo.Todo;
import io.archimedesfw.maven.micronaut.example.todo.persistence.TodoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/todos")
class TodoController {

    private static final Logger log = LoggerFactory.getLogger(TodoController.class);

    private final TodoRepository todoRepository;

    TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Transactional
    @Get
    List<Todo> getAll() {
        log.debug("Get all to-dos");
        return todoRepository.findAll();
    }

    @Transactional
    @Get("/{id}")
    Todo get(int id) {
        log.debug("Get just one to-do by id {}", id);
        return todoRepository.findBy(id);
    }

}
