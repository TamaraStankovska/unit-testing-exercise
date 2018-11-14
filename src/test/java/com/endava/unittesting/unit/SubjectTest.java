package com.endava.unittesting.unit;

import com.endava.unittesting.model.Student;
import com.endava.unittesting.model.Subject;
import com.endava.unittesting.model.TimeSlot;
import com.endava.unittesting.services.SubjectService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectTest {

    @Autowired
    SubjectService subjectService;


    @Test
    public void checkMaxUsersPerSubjectFalse(){

        Subject subj=new Subject("Mathematics", TimeSlot.ONE);


        Student student=new Student("Tam","Stan",345233);
        Student student2=new Student("Sam","Smith",345633);
        Student student3=new Student("Nick","James",233211);
        Student student4=new Student("Cam","B.",345675);
        Student student5=new Student("Mila","Jovkov",3456001);
        Student student6=new Student("Hris","Milic",123009);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

        subj.setListOfStudents(studentList);

        Assert.assertFalse(subjectService.checkMaxUsersPerSubject(subj));
    }


    @Test
    public void checkMaxUsersPerSubjectTrue(){
        Subject subj=new Subject("Mathematics", TimeSlot.ONE);


        Student student=new Student("Tam","Stan",345233);
        Student student2=new Student("Sam","Smith",345633);
        Student student3=new Student("Nick","James",233211);
        Student student4=new Student("Cam","B.",345675);

        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        subj.setListOfStudents(studentList);

        Assert.assertTrue(subjectService.checkMaxUsersPerSubject(subj));
    }
}
