package com.project.finalproject.service;

import com.project.finalproject.models.AppCourseModel;
import com.project.finalproject.models.AppUserModel;

import java.util.List;

public interface IAppCourseService {
    AppCourseModel saveCourse(AppCourseModel course);

    List<AppCourseModel> getAll();

    void deleteCourse(String courseName);
}
