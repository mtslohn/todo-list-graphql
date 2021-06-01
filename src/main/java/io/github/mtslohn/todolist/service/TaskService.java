package io.github.mtslohn.todolist.service;

import io.github.mtslohn.todolist.model.Task;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class TaskService {

    @Transactional
    public Task save(Task task) {
        task.persist();
        return task;
    }

}
