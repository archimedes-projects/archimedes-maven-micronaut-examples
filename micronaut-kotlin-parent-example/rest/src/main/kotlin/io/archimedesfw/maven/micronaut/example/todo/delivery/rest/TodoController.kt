package io.archimedesfw.maven.micronaut.example.todo.delivery.rest

import io.archimedesfw.maven.micronaut.example.todo.Todo
import io.archimedesfw.maven.micronaut.example.todo.persistence.TodoRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.slf4j.LoggerFactory
import javax.transaction.Transactional

@Controller("/todos")
internal open class TodoController(private val todoRepository: TodoRepository) {

    @Transactional
    @Get
    open fun getAll(): List<Todo> {
        log.debug("Get all to-dos")
        return todoRepository.findAll()
    }

    @Transactional
    @Get("/{id}")
    open fun get(id: Int): Todo {
        log.debug("Get just one to-do by id {}", id)
        return todoRepository.findBy(id)
    }

    private companion object {
        private val log = LoggerFactory.getLogger(TodoController::class.java)
    }

}
