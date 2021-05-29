package io.archimedesfw.maven.micronaut.example.todo.delivery.rest

import io.archimedesfw.maven.micronaut.example.todo.Todo
import io.archimedesfw.maven.micronaut.example.todo.persistence.TodoRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.scheduling.TaskExecutors.IO
import io.micronaut.scheduling.annotation.ExecuteOn
import org.slf4j.LoggerFactory
import javax.transaction.Transactional

@Controller("/todos")
internal open class TodoController(private val todoRepository: TodoRepository) {

    private val log = LoggerFactory.getLogger(TodoController::class.java)

    @Transactional
    @ExecuteOn(IO)
    @Get
    open fun getAll(): Iterable<Todo> {
        log.debug("Get all to-dos")
        return todoRepository.findAll()
    }

    @Transactional
    @ExecuteOn(IO)
    @Get("/{id}")
    open fun get(id: Int): Todo {
        log.debug("Get just one to-do by id {}", id)
        return todoRepository.findById(id).orElseThrow()
    }

}
