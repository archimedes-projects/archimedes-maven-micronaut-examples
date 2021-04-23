package io.archimedesfw.maven.micronaut.example.todo

import org.junit.jupiter.api.Test

import java.time.LocalDateTime

import org.junit.jupiter.api.Assertions.assertEquals

internal class TodoTest {

    @Test
    fun equals() {
        val todo1 = Todo(1, "title", TS, null)
        val todo2 = Todo(1, "title", TS, null)

        assertEquals(todo1, todo2)
    }

    companion object {

        private val TS = LocalDateTime.now()
    }

}
