package com.claurier.MonAquedi.model;

import java.io.Serializable;
import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

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

    @SequenceGenerator(name = "generator", sequenceName = "test.user_id_seq", allocationSize=1)
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name="user_id", unique=true, nullable=false)
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
