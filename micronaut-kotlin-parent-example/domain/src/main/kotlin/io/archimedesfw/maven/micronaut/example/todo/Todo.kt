package io.archimedesfw.maven.micronaut.example.todo

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import java.time.LocalDateTime

@Serdeable
@MappedEntity
data class Todo(
    @field:Id
    @field:GeneratedValue
    val id: Int? = null,

    val title: String,
    val creationDate: LocalDateTime,
    val doneDate: LocalDateTime? = null
)
