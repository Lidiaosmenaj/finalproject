package com.project.finalproject.service;


import com.project.finalproject.entities.AppUser;
import com.project.finalproject.models.AppUserModel;
import com.project.finalproject.repository.AppUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class AppUserService {


    private final AppUserRepository appUserRepository;

    private final PasswordEncoder passwordEncoder;

    public AppUserService(AppUserRepository appUserRepository, PasswordEncoder passwordEncoder) {
        this.appUserRepository = appUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public AppUserModel saveUser(AppUserModel useri) {

        useri.setPassword(passwordEncoder.encode(useri.getPassword()));

        return convertToModel(appUserRepository.save(convertToEntity(useri)));
    }

    public AppUserModel convertToModel(AppUser appUser) {
        AppUserModel appUserModel = new AppUserModel();
        appUserModel.setUserName(appUser.getUsername());
        appUserModel.setPassword(appUser.getPassword());
        appUserModel.setRole(appUser.getRoles().stream().map(entity -> {
            return RoleService.convertToModel(entity);
        }).collect(Collectors.toSet()));

/*
Set <Roli> set = new Hashset<>();
        for (Roli roli : useri.getRolet()) {
            RoliModel roliModel = RoliService.convertToModel(roli);
            set.add(roliModel);
        }
        useriModel.setRole(set);
*/
        return appUserModel;

    }

    public AppUser convertToEntity(AppUserModel appUserModel) {
        AppUser appUser = new AppUser();
        appUser.setUsername(appUserModel.getUserName());
        appUser.setPassword(appUserModel.getPassword());
        appUser.setRoles(appUserModel.getRolet().stream().map(RoleService::convertToEntity).collect(Collectors.toSet()));
        return appUser;
    }
}
