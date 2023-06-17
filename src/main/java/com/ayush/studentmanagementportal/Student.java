package com.ayush.studentmanagementportal;

public class Student {
    private int admissionNo;
    private String name;
    private int age;
    private String course;
    public Student() {

    }
    public Student(int admissionNo,String name,int age,String course) {
        this.admissionNo = admissionNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(int admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
