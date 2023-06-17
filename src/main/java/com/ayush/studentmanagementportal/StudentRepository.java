package com.ayush.studentmanagementportal;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
@Repository
public class StudentRepository {

    HashMap<Integer,Student> manageDB = new HashMap<>();

    public Student getStudent(int admnNo) {
        return manageDB.get(admnNo);
    }
    public String addStudent(Student stdudent) {
        manageDB.put(stdudent.getAdmissionNo(),stdudent);
        return "Student added sucessfully";
    }

    public void deleteStudent(int admn) {
        manageDB.remove(admn);
    }

    public void updateCourse(int admn, String newCourse) {
        Student st = manageDB.get(admn);
        st.setCourse(newCourse);
    }
    public int getAge(){
        int cnt = 0;
        for(int ad : manageDB.keySet()) {
            if(manageDB.get(ad).getAge() > 25) {
                cnt++;
            }
        }
        return cnt;
    }

    public int getagebyage(int age) {
        int cnt = 0;
        for(int ad : manageDB.keySet()) {
            if(manageDB.get(ad).getAge() > age) {
                cnt++;
            }
        }
        return cnt;
    }
}
