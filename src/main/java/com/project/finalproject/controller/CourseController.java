package com.project.finalproject.controller;


import com.project.finalproject.models.AppCourseModel;
import com.project.finalproject.service.IAppCourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    private final IAppCourseService courseService;

    public CourseController(IAppCourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/save")
    public AppCourseModel saveCourse(@RequestBody AppCourseModel courseTobeSaved) {
        return courseService.saveCourse(courseTobeSaved);
    }

    @GetMapping("/getAll")
    public List<AppCourseModel> getCourses(){
        return courseService.getAll();
    }
    @DeleteMapping ("/deleteCourse")
    public void deleteCourse (@RequestParam String courseName){
        courseService.deleteCourse(courseName);
    }
}
