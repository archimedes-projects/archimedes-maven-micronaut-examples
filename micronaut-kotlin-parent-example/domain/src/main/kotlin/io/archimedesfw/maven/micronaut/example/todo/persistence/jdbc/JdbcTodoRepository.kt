package io.archimedesfw.maven.micronaut.example.todo.persistence.jdbc

import io.archimedesfw.maven.micronaut.example.todo.Todo
import io.archimedesfw.maven.micronaut.example.todo.persistence.TodoRepository
import io.micronaut.data.jdbc.runtime.JdbcOperations
import javax.inject.Singleton
import kotlin.streams.toList

@Singleton
internal class JdbcTodoRepository(private val jdbc: JdbcOperations) : TodoRepository {

    override fun findAll(): List<Todo> =
        jdbc.prepareStatement(SELECT_ALL) {
            val rs = it.executeQuery()
            jdbc.entityStream(rs, Todo::class.java)
                .toList()
        }

    override fun findBy(id: Int): Todo =
        jdbc.prepareStatement(SELECT_BY_ID) {
            it.setInt(1, id)
            val rs = it.executeQuery()
            require(rs.next())
            jdbc.readEntity(rs, Todo::class.java)
        }

    private companion object {
        private const val TABLE = "todo"
        private const val COLUMNS = "id, title, creation_date, done_date"
        private const val SELECT = "select $COLUMNS from $TABLE"
        private const val SELECT_ALL = "$SELECT order by creation_date asc"
        private const val SELECT_BY_ID = "$SELECT where id=? order by creation_date asc"
    }

}
