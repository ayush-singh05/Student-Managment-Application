package com.ayush.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {
    @Autowired
    StudentService std;

    @GetMapping("/get")
    public Student getStudent(@RequestParam("ID") int addmision) {

        return std.getStudent(addmision);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student st) {
        std.addStudent(st);
        return "Student added sucessfully";
    }

    @GetMapping("/get_info/{id}")
    public Student getStudentPath(@PathVariable("id") int adm) {

        return std.getStudent(adm);
    }
    // Delete a student by admnNo
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id") int admn) {
        std.deleteStudent(admn);
        return "Student Delete Successfully";
    }

    @DeleteMapping("/dele/{id}")
    public String deleteStudentByPath(@PathVariable("id") int admn) {
        std.deleteStudent(admn);
        return "Student Delete Successfully";
    }
    // update the course of a student based admnNo
    @PutMapping("/update")
    public String updateCourse(@RequestParam("id") int admn,@RequestParam("course") String newCourse) {

        return std.updateCourse(admn,newCourse);
    }
    // total number of students whose age is greater than 25
    @GetMapping("/age")
    public int getAge() {
        return std.getAge();
    }
    @GetMapping("/get_age")
    public int getAgebyage(@RequestParam("age") int age){
        return std.getAgebyage(age);
    }
}
