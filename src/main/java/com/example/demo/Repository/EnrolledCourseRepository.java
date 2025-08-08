package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.EnrolledCourse;

public interface EnrolledCourseRepository extends JpaRepository<EnrolledCourse, Long>{

}
