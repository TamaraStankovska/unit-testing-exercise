package com.endava.unittesting.repository;

import com.endava.unittesting.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentJPARepository extends CrudRepository<Student,Long> {
}
