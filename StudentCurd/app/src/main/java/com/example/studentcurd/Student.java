package com.example.studentcurd;

import java.io.Serializable;

public class Student implements Serializable {
    private  int rollno;
    private String name;
    private String course;
    private int age;
    private String gender;
    public Student() {
    }

    public Student(int rollno, String name, String course, int age, String gender) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.age = age;
        this.gender = gender;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
