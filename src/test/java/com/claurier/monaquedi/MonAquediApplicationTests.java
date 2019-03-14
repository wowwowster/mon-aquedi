package com.claurier.monaquedi;

import com.claurier.monaquedi.model.Employee;
import com.claurier.monaquedi.model.User;
import com.claurier.monaquedi.repository.EmployeeRepository;
import com.claurier.monaquedi.repository.UserRepository;
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
@Transactional
@Rollback(false)
public class MonAquediApplicationTests {

    @Autowired
    private UserRepository userRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void testGenerateId() {
	    try {
            List<User> userList =userRepository.findAll();
           //User user = new User("Administrator");
			// userRepository.save(user);
            Employee employee = new Employee("Administrator","Mon titre");
            employeeRepository.save(employee);
        } catch (Exception e) {
	        e.printStackTrace();
        }
	}

}

