package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Course;
import com.example.demo.Model.EnrolledCourse;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.EnrolledCourseRepository;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private EnrolledCourseRepository enrolledCourseRepository;

    // Get all available courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // Get all enrolled students
    public List<EnrolledCourse> getAllEnrolledStudents() {
        return enrolledCourseRepository.findAll();
    }

    // Register a student
    public EnrolledCourse registerStudent(EnrolledCourse student) {
        return enrolledCourseRepository.save(student);
    }
}
