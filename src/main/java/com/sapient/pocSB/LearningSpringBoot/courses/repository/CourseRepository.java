package com.sapient.pocSB.LearningSpringBoot.courses.repository;

import com.sapient.pocSB.LearningSpringBoot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
