package com.ayush.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepo;

    public Student getStudent(int addmision) {
        return studentRepo.getStudent(addmision);
    }
    public String addStudent(Student student) {
        return studentRepo.addStudent(student);

    }

    public void deleteStudent(int admn) {
        studentRepo.deleteStudent(admn);
    }

    public String updateCourse(int admn, String newCourse) {
        studentRepo.updateCourse(admn,newCourse);
        return  "Course update Successfully!";
    }
    public int getAge(){
        return studentRepo.getAge();
    }

    public int getAgebyage(int age) {
       return studentRepo.getagebyage(age);
    }
}
