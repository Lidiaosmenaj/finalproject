package com.project.finalproject.service;

import com.project.finalproject.entities.Course;
import com.project.finalproject.models.AppCourseModel;
import com.project.finalproject.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements IAppCourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public AppCourseModel saveCourse(AppCourseModel appCourseModel) {
        Course savedCourse = courseRepository.save(convertToEntity(appCourseModel));
        return convertToModel(savedCourse);
    }

    @Override
    public List<AppCourseModel> getAll() {
       return courseRepository.findAll().stream()
                .map(this::convertToModel).toList();
//        List<Course> allCourses = courseRepository.findAll();
//        List<AppCourseModel> courseModels = new ArrayList<>();
//        for (Course course : allCourses){
//            courseModels.add(convertToModel(course));
//        }
//        return courseModels;
    }

    @Override
    public void deleteCourse(String courseName) {
        Course courseByName = courseRepository.findCourseByName(courseName);
        courseRepository.delete(courseByName);
    }

    private AppCourseModel convertToModel(Course course) {
        AppCourseModel appCourseModel = new AppCourseModel();
        appCourseModel.setCourseName(course.getCourseName());
        appCourseModel.setStartDate(course.getStartDate());
        appCourseModel.setEndDate(course.getEndDate());
        return appCourseModel;
    }

    private Course convertToEntity(AppCourseModel appCourseModel) {
        Course course = new Course();
        course.setCourseName(appCourseModel.getCourseName());
        course.setStartDate(appCourseModel.getStartDate());
        course.setEndDate(appCourseModel.getEndDate());
        return course;

    }
}