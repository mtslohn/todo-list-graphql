package io.github.mtslohn.todolist.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Task extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String description;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date accomplishmentDate;

    public Task id(final Long id) {
        this.id = id;
        return this;
    }

    public Task name(final String name) {
        this.name = name;
        return this;
    }

    public Task description(final String description) {
        this.description = description;
        return this;
    }

    public Task accomplishmentDate(final Date accomplishmentDate) {
        this.accomplishmentDate = accomplishmentDate;
        return this;
    }

}
