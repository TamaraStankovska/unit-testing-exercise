package com.endava.unittesting.services;

import com.endava.unittesting.model.Student;
import com.endava.unittesting.model.Subject;
import com.endava.unittesting.repository.SubjectJPARepository;
import com.endava.unittesting.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {


    @Autowired
    SubjectJPARepository subjectJPARepository;

    public Boolean checkMaxUsersPerSubject(Subject subject) {
       if(subject.getListOfStudents().size()<=5){ return true;} else return false;

    }


}
