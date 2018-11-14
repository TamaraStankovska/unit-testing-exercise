package com.endava.unittesting;

import com.endava.unittesting.model.Student;
import com.endava.unittesting.model.Subject;
import com.endava.unittesting.model.TimeSlot;
import com.endava.unittesting.repository.StudentJPARepository;
import com.endava.unittesting.repository.SubjectJPARepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class UnitTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitTestingApplication.class, args);
    }

  /*  @Bean
    CommandLineRunner runner(StudentJPARepository studentJPARepository, SubjectJPARepository subjectJPARepository) {

        return args -> {
            studentJPARepository.save(new Student("Tamara","Kitan",134908,new ArrayList<Subject>()));
            studentJPARepository.save(new Student("Nikola","Sokolov",234567,new ArrayList<Subject>()));



            Subject subject1=new Subject("Mathematics", TimeSlot.ONE);
            Subject subject2=new Subject("Calculus",TimeSlot.FOUR);
            List<Subject> subjects=new ArrayList<>();
            subjects.add(subject1);
            subjects.add(subject2);
            subjectJPARepository.save(subject1);
            subjectJPARepository.save(subject2);


            Student student=new Student("Tamara","Stankovska",134099,subjects);
            studentJPARepository.save(student);

        };

    }
        }*/

}
