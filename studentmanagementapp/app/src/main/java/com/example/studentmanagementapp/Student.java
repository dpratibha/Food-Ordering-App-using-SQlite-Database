package com.example.studentmanagementapp;

public class Student {
    private String name;
    private String mobile;
    private String school;

    public Student() {
    }

    public Student(String name, String mobile, String school) {
        this.name = name;
        this.mobile = mobile;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
