package com.endava.unittesting.repository;

import com.endava.unittesting.model.Subject;
import org.springframework.stereotype.Repository;


public interface SubjectRepository {
    Boolean checkMaxUsersPerSubject(Subject subject);
}
