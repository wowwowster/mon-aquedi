package com.claurier.MonAquedi;

import com.claurier.MonAquedi.model.Employee;
import com.claurier.MonAquedi.model.User;
import com.claurier.MonAquedi.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MonAquediApplicationTests {

    @Autowired
    private UserRepository userRepository;


	@Test
	public void contextLoads() {
	}


	@Test
	@Transactional
    @Rollback(false)
	public void testGenerateId() {
	    try {
            List<User> userList =userRepository.findAll();
            Employee employee = new Employee("Administrator");
        } catch (Exception e) {
	        e.printStackTrace();
        }
	}

}

