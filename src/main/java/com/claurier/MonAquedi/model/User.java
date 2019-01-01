package com.claurier.MonAquedi.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="user", schema = "test")
@Inheritance(strategy= InheritanceType.JOINED)
//@DiscriminatorColumn(name="USER_TYPE",discriminatorType = DiscriminatorType.STRING,length = 1)
public class User implements Serializable {

    private Long userId;

    private String username;

    public User() {
    }

    /**
     * Constructs a new user given basic information
     * @param username - username
     */
    public User(String username) {
        this.username = username;
    }

    @Id @GeneratedValue(strategy= GenerationType.TABLE)
    @Column(name="user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "user_name")
    public String getUsername() {
        return username;
    }

}
