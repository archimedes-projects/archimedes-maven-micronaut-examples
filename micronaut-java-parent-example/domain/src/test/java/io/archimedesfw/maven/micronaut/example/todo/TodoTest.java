package io.archimedesfw.maven.micronaut.example.todo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoTest {

    private static final LocalDateTime TS = LocalDateTime.now();

    @Test
    void equals() {
        final var todo1 = new Todo(1, "title", TS, null);
        final var todo2 = new Todo(1, "title", TS, null);

        assertEquals(todo1, todo2);
    }

}
