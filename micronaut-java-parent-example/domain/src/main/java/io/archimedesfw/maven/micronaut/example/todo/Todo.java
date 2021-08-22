package io.archimedesfw.maven.micronaut.example.todo;

//import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Data;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.time.LocalDateTime;

@Data
@MappedEntity
public class Todo {
    @Id
    @GeneratedValue
    public final Integer id;

    public final @NonNull String title;
    public final @NonNull LocalDateTime creationDate;
    public final @Nullable LocalDateTime doneDate;

}
