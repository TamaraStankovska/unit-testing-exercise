package com.endava.unittesting.repository;


import com.endava.unittesting.model.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SubjectJPARepository extends CrudRepository<Subject,Long> {

}
