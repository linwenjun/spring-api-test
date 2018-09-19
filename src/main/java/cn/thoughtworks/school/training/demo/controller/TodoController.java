package cn.thoughtworks.school.training.demo.controller;

import cn.thoughtworks.school.training.demo.model.Todo;
import cn.thoughtworks.school.training.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAll() {

        return todoService.getAll();

    }
}
