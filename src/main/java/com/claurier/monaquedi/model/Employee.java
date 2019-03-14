package com.claurier.monaquedi.model;

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

    private Date dateModification;

    /**
     * Default constructor for JPA
     */
    public Employee() {}


    public Employee(String username, String title) {
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_modification", nullable = true)
    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }
}
