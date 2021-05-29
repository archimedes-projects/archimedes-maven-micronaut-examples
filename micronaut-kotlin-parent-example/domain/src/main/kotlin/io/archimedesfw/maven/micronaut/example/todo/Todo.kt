package io.archimedesfw.maven.micronaut.example.todo

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.time.LocalDateTime

@MappedEntity
data class Todo(
    @field:Id
    @GeneratedValue
    val id: Int? = null,

    val title: String,
    val creationDate: LocalDateTime,
    val doneDate: LocalDateTime? = null
)
