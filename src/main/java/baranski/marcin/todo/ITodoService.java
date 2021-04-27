package baranski.marcin.todo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ITodoService {

    List<Todo> getTodosByUser(String user);

    Optional<Todo> getTodoById(long id);

    void addTodo(String name, String desc, Date date, boolean isDone);

    void saveTodo(Todo todo);

    void updateTodo(Todo todo);

    void deleteTodo(long id);

}
