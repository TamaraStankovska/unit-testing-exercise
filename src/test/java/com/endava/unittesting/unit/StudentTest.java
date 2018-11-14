package com.endava.unittesting.unit;

import com.endava.unittesting.model.Student;
import com.endava.unittesting.model.Subject;
import com.endava.unittesting.model.TimeSlot;
import com.endava.unittesting.repository.StudentJPARepository;
import com.endava.unittesting.repository.SubjectJPARepository;
import com.endava.unittesting.services.StudentService;
import com.endava.unittesting.services.SubjectService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.tomcat.jni.Time;
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
public class StudentTest {



    @Autowired
    StudentService studentService;




    @Test
    public void checkMaxSubjectsForStudentTrue() {

        Subject mathematics=new Subject("Mathematics", TimeSlot.ONE);
        Subject calculus=new Subject("Calculus",TimeSlot.TWO);
        Subject javaProgramming=new Subject("Java Programming",TimeSlot.THREE);

        List<Subject> subjectList=new ArrayList<>();
        subjectList.add(mathematics);
        subjectList.add(calculus);
        subjectList.add(javaProgramming);


        Student student=new Student("Nikola","Sokolov",342322);
        student.setListOfSubjects(subjectList);
        Assert.assertTrue(studentService.checkMaxSubjectsForStudent(student));
    }


    @Test
    public void checkMaxSubjectsForStudentFalse() {

        Subject mathematics=new Subject("Mathematics", TimeSlot.ONE);
        Subject calculus=new Subject("Calculus",TimeSlot.TWO);
        Subject javaProgramming=new Subject("Java Programming",TimeSlot.THREE);
        Subject englishCourse=new Subject("English Course", TimeSlot.FOUR);
        Subject OOP=new Subject("OOP",TimeSlot.ONE);

        List<Subject> subjectList=new ArrayList<>();
        subjectList.add(mathematics);
        subjectList.add(calculus);
        subjectList.add(javaProgramming);
        subjectList.add(englishCourse);
        subjectList.add(OOP);

        Student student=new Student("Nikola","Sokolov",342322);
        student.setListOfSubjects(subjectList);
        Assert.assertFalse(studentService.checkMaxSubjectsForStudent(student));
    }




    @Test
    public void checkAccurateSubjectAttendanceTrue(){

      Student student=new Student("Tamara","Stan",123008);

      Subject subject1=new Subject("Mathematics",TimeSlot.ONE);
      Subject subject2=new Subject("Calculus",TimeSlot.THREE);
      Subject subject3=new Subject("English Course",TimeSlot.TWO);

      List<Subject> subjects=new ArrayList<>();
      subjects.add(subject1);
      subjects.add(subject2);
      subjects.add(subject3);

      student.setListOfSubjects(subjects);

      Assert.assertTrue(studentService.checkAccurateSubjectAttendance(student));
    }



    @Test
    public void checkAccurateSubjectAttendanceFalse(){

        Student student=new Student("Tamara","Stan",123008);

        Subject subject1=new Subject("Mathematics",TimeSlot.ONE);
        Subject subject2=new Subject("Calculus",TimeSlot.THREE);
        Subject subject3=new Subject("English Course",TimeSlot.TWO);
        Subject subject4=new Subject("Italian Course",TimeSlot.TWO);

        List<Subject> subjects=new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);

        student.setListOfSubjects(subjects);

        Assert.assertFalse(studentService.checkAccurateSubjectAttendance(student));
    }









}


