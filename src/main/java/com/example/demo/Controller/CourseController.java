package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Model.Course;
import com.example.demo.Model.EnrolledCourse;
import com.example.demo.Service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/Course")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Allow frontend access
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get available courses
    @GetMapping("/available")
    public List<Course> getAvailableCourses() {
        return courseService.getAllCourses();
    }

    // Get registered students
    @GetMapping("/registered")
    public List<EnrolledCourse> getRegisteredStudents() {
        return courseService.getAllEnrolledStudents();
    }

    // Register a student
    @PostMapping("/StudentRegister")
    public String registerStudent(@ModelAttribute EnrolledCourse student) {
        courseService.registerStudent(student);
        return "Congratulations " + student.getName() + 
               "! You have successfully enrolled in " + student.getCourseName() + ".";
    }
}
