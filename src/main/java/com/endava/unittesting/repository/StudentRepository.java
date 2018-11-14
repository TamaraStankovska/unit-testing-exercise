package com.endava.unittesting.repository;

import com.endava.unittesting.model.Student;
import org.springframework.stereotype.Repository;


public interface StudentRepository {
    Boolean checkMaxSubjectsForStudent(Student student);
}
