package com.springrest.springrest.repository;

import com.springrest.springrest.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
