package com.klu.model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student {


@Value("101")
private int studentId;


@Value("Deepu")
private String name;


private String course;
private int year;


// Constructor Injection
public Student(@Value("FSAD") String course, @Value("2026") int year) {
this.course = course;
this.year = year;
}


public void display() {
System.out.println("Student ID: " + studentId);
System.out.println("Name: " + name);
System.out.println("Course: " + course);
System.out.println("Year: " + year);
}
}