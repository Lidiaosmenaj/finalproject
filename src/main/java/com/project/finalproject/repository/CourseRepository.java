package com.project.finalproject.repository;

import com.project.finalproject.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    @Query(value = "SELECT * FROM course WHERE course_name = :courseName", nativeQuery = true)
    Course findCourseByName(String courseName);
}
