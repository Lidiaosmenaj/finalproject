package com.project.finalproject.controller;

import com.project.finalproject.models.AppUserModel;
import com.project.finalproject.service.IAppUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AppUserController {
    /*
    E barazvlershme me
    @Autowired
    private IAppUserService appUserService;
     */
    private final IAppUserService appUserService;

    public AppUserController(IAppUserService appUserService) {
        this.appUserService = appUserService;
    }


    @PostMapping("/save")
    public AppUserModel save(@RequestBody AppUserModel appUserModel) {
        return appUserService.saveUser(appUserModel);
    }


}
