package com.claurier.MonAquedi.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="employee", schema = "test")
//@DiscriminatorValue(value="E")
@PrimaryKeyJoinColumn(name="user_id")
public class Employee extends User implements Serializable {

    /**
     * Employee title
     */
    private String title;

    /**
     * Default constructor for JPA
     */
    public Employee() {}


    public Employee(String username) {
        super(username);
        this.title = title;
    }

    @Column(name="employee_title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets the employee's title
     * @param title - title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}