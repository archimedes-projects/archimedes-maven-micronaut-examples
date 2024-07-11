package io.archimedesfw.maven.micronaut.example.todo;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class ApplicationIT {

    @Inject
    private EmbeddedApplication<?> application;

    @Test
    void bootstrap() {
        assertTrue(application.isRunning());
    }

}
