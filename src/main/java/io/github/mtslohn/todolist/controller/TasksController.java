package io.github.mtslohn.todolist.controller;

import io.github.mtslohn.todolist.model.Task;
import io.github.mtslohn.todolist.service.TaskService;
import org.jboss.resteasy.annotations.Body;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/tasks")
public class TasksController {

    private final TaskService taskService;

    @Inject
    public TasksController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAll() {
        return "Hello RESTEasy";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Task save(Task task) {
        return taskService.save(task);
    }
}