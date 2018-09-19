package cn.thoughtworks.school.training.demo.service;

import cn.thoughtworks.school.training.demo.model.Todo;
import cn.thoughtworks.school.training.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAll() {
        return todoRepository.getAll();

    }
}
