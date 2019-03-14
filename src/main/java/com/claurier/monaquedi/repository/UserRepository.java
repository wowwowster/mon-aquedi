package com.claurier.monaquedi.repository;

import com.claurier.monaquedi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u")
    List<User> findAllUsers();
}