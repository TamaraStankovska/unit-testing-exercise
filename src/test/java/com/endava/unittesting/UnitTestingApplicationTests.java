package com.endava.unittesting;

import com.endava.unittesting.model.Student;
import com.endava.unittesting.repository.StudentJPARepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitTestingApplicationTests {

    @Autowired
    StudentJPARepository studentJPARepository;




    @Test
    public void contextLoads() {
    }


}
