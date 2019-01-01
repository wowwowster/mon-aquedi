package com.claurier.MonAquedi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MonAquediApplication {

	public static void main(String[] args) {

		SpringApplication.run(MonAquediApplication.class, args);
		String toto="";
	}

}

