package io.github.mtslohn.todolist.resource;

import io.github.mtslohn.todolist.model.Task;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class TaskResource {

    @Query
    public List<Task> getTasks() {
        return Task.findAll().list();
    }

    @Query
    public Task getTaskById(@Name("taskId") Long id) {
        return Task.findById(id);
    }

    @Query
    public List<Task> getTaskByNameContains(@Name("nameContains") String name) {
        return Task.find("name LIKE ?1", '%' + name + '%').list();
    }

}
