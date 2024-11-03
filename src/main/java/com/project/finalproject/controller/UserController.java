package com.project.finalproject.controller;

import com.project.finalproject.models.AppUserModel;
import com.project.finalproject.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1")
public class UserController {

    private final IAppUserService userService;

    public UserController(IAppUserService userService) {
        this.userService = userService;
    }


    @PostMapping("save")
    public AppUserModel saveUser(AppUserModel userTobeSaved){
        return userService.saveUser(userTobeSaved);
    }


}
