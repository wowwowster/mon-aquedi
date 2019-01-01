package com.claurier.MonAquedi;

import com.claurier.MonAquedi.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MonAquediApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	@Transactional
    @Rollback(false)
	public void testGenerateId() {
	    try {
            Employee employee = new Employee("Administrator");
        } catch (Exception e) {
	        e.printStackTrace();
        }
	}

}

