package io.archimedesfw.maven.micronaut.example.todo.persistence.jdbc;

import io.archimedesfw.maven.micronaut.example.todo.Todo;
import io.archimedesfw.maven.micronaut.example.todo.persistence.TodoRepository;
import io.micronaut.data.jdbc.runtime.JdbcOperations;

import javax.inject.Singleton;
import java.util.List;

import static java.util.stream.Collectors.toUnmodifiableList;

@Singleton
class JdbcTodoRepository implements TodoRepository {

    private static final String TABLE = "todo";
    private static final String COLUMNS = "id, title, creation_date, done_date";
    private static final String SELECT = "select " + COLUMNS + " from " + TABLE;
    private static final String SELECT_ALL = SELECT + " order by creation_date asc";
    private static final String SELECT_BY_ID = SELECT + " where id=? order by creation_date asc";

    private final JdbcOperations jdbc;

    JdbcTodoRepository(JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Todo> findAll() {
        return jdbc.prepareStatement(SELECT_ALL, ps -> {
            final var rs = ps.executeQuery();
            return jdbc.entityStream(rs, Todo.class)
                    .collect(toUnmodifiableList());
        });
    }

    @Override
    public Todo findBy(int id) {
        return jdbc.prepareStatement(SELECT_BY_ID, ps -> {
            ps.setInt(1, id);
            final var rs = ps.executeQuery();
            if (!rs.next()) throw new IllegalArgumentException("Cannot find id " + id);
            return jdbc.readEntity(rs, Todo.class);
        });
    }

}
