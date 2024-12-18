package com.example.studentcourse.controller;

import com.example.studentcourse.entity.Course;
import com.example.studentcourse.repository.CourseRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @QueryMapping
    public List<Course> allCourses() {
        return courseRepository.findAll();
    }

    @QueryMapping
    public Course courseById(@Argument Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Course addCourse(@Argument String name) {
        Course course = new Course();
        course.setName(name);
        return courseRepository.save(course);
    }

}
