package com.claurier.MonAquedi.repository;

import com.claurier.MonAquedi.model.Employee;
import com.claurier.MonAquedi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select e from Employee e")
    List<User> findAllEmployees();
}