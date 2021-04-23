package io.archimedesfw.maven.micronaut.example.todo;

import java.time.LocalDateTime;

import javax.annotation.Nullable;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;
import lombok.NonNull;

@Data
@Introspected
public class Todo {

    public final Integer id;
    public final @NonNull String title;
    public final @NonNull LocalDateTime creationDate;
    public final @Nullable LocalDateTime doneDate;

}
