package com.claurier.MonAquedi;

import com.claurier.MonAquedi.model.Employee;
import com.claurier.MonAquedi.model.User;
import com.claurier.MonAquedi.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@SpringBootApplication
public class MonAquediApplication {

	public static void main(String[] args) {

		SpringApplication.run(MonAquediApplication.class, args);
		String toto="";

        Employee employee = new Employee("Administrator");
	}

}

