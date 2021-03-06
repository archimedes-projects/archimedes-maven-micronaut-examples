package io.archimedesfw.maven.micronaut.example.todo.persistence

import io.archimedesfw.maven.micronaut.example.todo.Todo
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

@MicronautTest
internal class TodoRepositoryIT {

    @Inject
    private lateinit var todoRepository: TodoRepository

    @Test
    internal fun find_all() {
        val actuals = todoRepository.findAll()

        assertEquals(
            listOf(
                Todo(
                    1,
                    "Ride in a hot air balloon",
                    LocalDateTime.parse("2017-07-16T15:36:42"),
                    LocalDateTime.parse("2018-04-02T11:17:32")
                ),
                Todo(
                    2,
                    "Ride a helicopter",
                    LocalDateTime.parse("2017-10-21T14:42:57")
                ),
                Todo(
                    3,
                    "Swim with dolphins",
                    LocalDateTime.parse("2018-04-02T09:46:13"),
                    LocalDateTime.parse("2019-03-14T09:13:28")
                )
            ),
            actuals
        )
    }

    @Test
    internal fun find_by_id() {
        val actual = todoRepository.findById(2).orElseThrow()

        assertEquals(
            Todo(2, "Ride a helicopter", LocalDateTime.parse("2017-10-21T14:42:57")),
            actual
        )
    }

}
