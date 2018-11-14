package com.endava.unittesting.integration;

import com.endava.unittesting.model.Student;
import com.endava.unittesting.model.Subject;
import com.endava.unittesting.model.TimeSlot;
import com.endava.unittesting.services.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentIntegrationTest {

    @Autowired
    StudentService studentService;

    @Autowired
    EntityManager entityManager;


    @Test
    @Transactional
    public void  checkMaxSubjectsForStudentTrue() {
        Subject mathematics=new Subject("Mathematics", TimeSlot.ONE);
        Subject calculus=new Subject("Calculus",TimeSlot.TWO);
        Subject javaProgramming=new Subject("Java Programming",TimeSlot.THREE);
        entityManager.persist(mathematics);
        entityManager.persist(calculus);
        entityManager.persist(javaProgramming);
        entityManager.flush();


        List<Subject> subjectList= new ArrayList<>();
        subjectList.add(mathematics);
        subjectList.add(calculus);
        subjectList.add(javaProgramming);

        Student student=new Student("Nikola","Sokolov",342322);
        student.setListOfSubjects(subjectList);
        entityManager.flush();
        Assert.assertTrue(studentService.checkMaxSubjectsForStudent(student));
    }


    @Test
    @Transactional
    public void  checkMaxSubjectsForStudentFalse() {
        Subject mathematics=new Subject("Mathematics", TimeSlot.ONE);
        Subject calculus=new Subject("Calculus",TimeSlot.TWO);
        Subject javaProgramming=new Subject("Java Programming",TimeSlot.THREE);
        Subject englishCourse=new Subject("English Course", TimeSlot.FOUR);
        Subject OOP=new Subject("OOP",TimeSlot.ONE);

        entityManager.persist(mathematics);
        entityManager.persist(calculus);
        entityManager.persist(javaProgramming);
        entityManager.persist(englishCourse);
        entityManager.persist(OOP);
        entityManager.flush();


        List<Subject> subjectList= new ArrayList<>();
        subjectList.add(mathematics);
        subjectList.add(calculus);
        subjectList.add(javaProgramming);
        subjectList.add(englishCourse);
        subjectList.add(OOP);

        Student student=new Student("Nikola","Sokolov",342322);
        student.setListOfSubjects(subjectList);
        entityManager.flush();
        Assert.assertFalse(studentService.checkMaxSubjectsForStudent(student));
    }



    @Test
    @Transactional
    public void checkAccurateSubjectAttendanceTrue(){

        Student student=new Student("Tamara","Stan",123008);

        Subject subject1=new Subject("Mathematics",TimeSlot.ONE);
        Subject subject2=new Subject("Calculus",TimeSlot.THREE);
        Subject subject3=new Subject("English Course",TimeSlot.TWO);


        entityManager.persist(subject1);
        entityManager.persist(subject2);
        entityManager.persist(subject3);

        List<Subject> subjects=new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);

        student.setListOfSubjects(subjects);
        entityManager.persist(student);
        entityManager.flush();
        Assert.assertTrue(studentService.checkAccurateSubjectAttendance(student));
    }



    @Test
    @Transactional
    public void checkAccurateSubjectAttendanceFalse(){

        Student student=new Student("Tamara","Stan",123008);

        Subject subject1=new Subject("Mathematics",TimeSlot.ONE);
        Subject subject2=new Subject("Calculus",TimeSlot.THREE);
        Subject subject3=new Subject("English Course",TimeSlot.TWO);
        Subject subject4=new Subject("Italian Course",TimeSlot.TWO);

        entityManager.persist(subject1);
        entityManager.persist(subject2);
        entityManager.persist(subject3);
        entityManager.persist(subject4);

        List<Subject> subjects=new ArrayList<>();
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);

        student.setListOfSubjects(subjects);
        entityManager.persist(student);
        entityManager.flush();

        Assert.assertFalse(studentService.checkAccurateSubjectAttendance(student));
    }




}
