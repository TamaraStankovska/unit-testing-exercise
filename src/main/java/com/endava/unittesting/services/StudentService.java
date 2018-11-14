package com.endava.unittesting.services;

import com.endava.unittesting.model.Student;
import com.endava.unittesting.model.Subject;
import com.endava.unittesting.model.TimeSlot;
import com.endava.unittesting.repository.StudentJPARepository;
import com.endava.unittesting.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService{


    StudentJPARepository studentJPARepository;

    @Autowired
    public StudentService(StudentJPARepository studentJPARepository){
        this.studentJPARepository=studentJPARepository;
    }

    public Boolean checkMaxSubjectsForStudent(Student student) {
        if(student.getListOfSubjects().size()<=4){return true;}  return false;

    }

    public Boolean checkAccurateSubjectAttendance(Student student){
        List<Subject> subjects=student.getListOfSubjects();
        for(int i=0;i<subjects.size();i++){
            Subject subject=subjects.get(i);
            for(int j=i+1;j<subjects.size();j++){
                if(subject.getTimeSlot()==subjects.get(j).getTimeSlot()){
                    return false;
                }
            }
        }
        return true;

    }

}
