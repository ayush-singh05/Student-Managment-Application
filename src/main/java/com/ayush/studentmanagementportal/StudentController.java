package com.ayush.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {
    @Autowired
    StudentService std;

    @GetMapping("/get")
    public ResponseEntity getStudent(@RequestParam("ID") int addmision) {
            Student s = std.getStudent(addmision);
        if(s == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(s, HttpStatus.ACCEPTED);
    }

    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student st) {
        String str = std.addStudent(st);
        return new ResponseEntity(str,HttpStatus.CREATED);
    }

    @GetMapping("/get_info/{id}")
    public ResponseEntity getStudentPath(@PathVariable("id") int adm) {
        Student s = std.getStudent(adm);
        if(s == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(s,HttpStatus.ACCEPTED);
    }
    // Delete a student by admnNo
    @DeleteMapping("/delete")
    public ResponseEntity deleteStudent(@RequestParam("id") int admn) {
        String st = std.deleteStudent(admn);
        if(st == null) {
            return new ResponseEntity("Student Not Found",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(st,HttpStatus.FOUND);
    }

    @DeleteMapping("/delete_student/{id}")
    public ResponseEntity deleteStudentByPath(@PathVariable("id") int admn) {
        String st = std.deleteStudent(admn);
        if(st == null) {
            return new ResponseEntity("Student Not Found",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(st,HttpStatus.FOUND);
    }
    // update the course of a student based admnNo
    @PutMapping("/update")
    public ResponseEntity updateCourse(@RequestParam("id") int admn,@RequestParam("course") String newCourse) {
        String st = std.updateCourse(admn,newCourse);
        if(st == null){
            return new ResponseEntity("Incorrect Admission Number",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(st,HttpStatus.FOUND);
    }
    // total number of students whose age is greater than 25
    @GetMapping("/age")
    public ResponseEntity getAge() {
        return new ResponseEntity(std.getAge(),HttpStatus.FOUND);
    }
    @GetMapping("/get_age")
    public ResponseEntity getAgebyage(@RequestParam("age") int age){
        int a = std.getAgebyage(age);
        return new ResponseEntity(a,HttpStatus.FOUND);
    }
}
