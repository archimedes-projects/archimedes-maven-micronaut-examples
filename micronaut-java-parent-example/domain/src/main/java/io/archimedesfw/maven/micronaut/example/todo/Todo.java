package io.archimedesfw.maven.micronaut.example.todo;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDateTime;

@MappedEntity
@Serdeable
public record Todo(
        @Id
        @GeneratedValue
        @Nullable Integer id,

        String title,
        LocalDateTime creationDate,
        @Nullable LocalDateTime doneDate
) {}
