package com.endava.unittesting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private
    String firstName;

    String lastName;

    Integer studentNumber;

    @ManyToMany
    List<Subject> listOfSubjects;

    public Student(String firstName, String lastName, Integer studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;

    }


    public List<Subject> getListOfSubjects() {
        return listOfSubjects;
    }


    public Long getId() {
        return id;
    }

    public void setListOfSubjects(List<Subject> subjectList) {
        this.listOfSubjects=subjectList;
    }
}
