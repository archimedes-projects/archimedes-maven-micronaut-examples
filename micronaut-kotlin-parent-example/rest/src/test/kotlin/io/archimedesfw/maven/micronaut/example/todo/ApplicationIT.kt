package io.archimedesfw.maven.micronaut.example.todo

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

@MicronautTest
internal class ApplicationIT {

    @Inject
    lateinit var application: EmbeddedApplication<*>

    @Test
    fun bootstrap() {
        assertTrue(application.isRunning)
    }

}
