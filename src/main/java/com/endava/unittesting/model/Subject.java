package com.endava.unittesting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToMany(mappedBy = "listOfSubjects")
    List<Student> listOfStudents;

    @Enumerated(value=EnumType.STRING)
    TimeSlot timeSlot;


    public Subject() {

    }

    public Subject(String name, TimeSlot timeSlot) {
        this.name = name;

        this.timeSlot = timeSlot;
    }




    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setName(String mathematics) {
        this.name=mathematics;
    }

    public void setListOfStudents(List<Student> studentList) {
        this.listOfStudents=studentList;
    }
}
