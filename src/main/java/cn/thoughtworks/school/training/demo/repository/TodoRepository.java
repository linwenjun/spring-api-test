package cn.thoughtworks.school.training.demo.repository;

import cn.thoughtworks.school.training.demo.model.Todo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoRepository {
    private List<Todo> todoList = new ArrayList<>();

    public List<Todo> getAll() {
        return todoList;
    }
}
