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

    public String deleteStudent(int admn) {
        return studentRepo.deleteStudent(admn);
    }

    public String updateCourse(int admn, String newCourse) {
        return studentRepo.updateCourse(admn,newCourse);

    }
    public int getAge(){
        return studentRepo.getAge();
    }

    public int getAgebyage(int age) {
       return studentRepo.getagebyage(age);
    }
}
