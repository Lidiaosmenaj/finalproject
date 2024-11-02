package com.project.finalproject.service;

import com.project.finalproject.entities.AppUser;
import com.project.finalproject.models.AppUserModel;

import java.util.List;

public interface IAppUserService {

    AppUserModel saveUser(AppUserModel user);

    List<AppUserModel> getAllUsers();

    AppUserModel getUserById(Long id);

    void deleteUserById(Long id);

    AppUser convertToEntity(AppUserModel userModel);
}
