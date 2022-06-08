package com.sapient.pocSB.LearningSpringBoot.courses.controller;

import com.sapient.pocSB.LearningSpringBoot.courses.bean.Course;
import com.sapient.pocSB.LearningSpringBoot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses")
    public List<Course> getallcourses(){
        return repository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course GetCourses(@PathVariable int id){
        // returns optional
        Optional<Course> course = repository.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("Course is not found " + id);
        }
        return course.get();
    }

    @PostMapping("/courses")
    public void createcourse(@RequestBody Course course){
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void createcourse(@PathVariable int id, @RequestBody Course course){
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deletecourse(@PathVariable int id){
        repository.deleteById(id);
    }
}


