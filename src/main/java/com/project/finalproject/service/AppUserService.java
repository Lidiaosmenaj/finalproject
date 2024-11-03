package com.project.finalproject.service;


import com.project.finalproject.entities.AppUser;
import com.project.finalproject.entities.Role;
import com.project.finalproject.models.AppUserModel;
import com.project.finalproject.models.RoleModel;
import com.project.finalproject.repository.AppUserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AppUserService implements IAppUserService {


    private final AppUserRepository appUserRepository;

    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public AppUserModel saveUser(AppUserModel useri) {
        return convertToModel(appUserRepository.save(convertToEntity(useri)));
    }


    private AppUserModel convertToModel(AppUser appUser) {
        AppUserModel appUserModel = new AppUserModel();
        appUserModel.setUsername(appUser.getUsername());
        appUserModel.setPassword(appUser.getPassword());
        appUserModel.setGenerality(appUser.getGenerality());
        appUserModel.setRolet(appUser.getRoles().stream().map(RoleService::convertToModel).collect(Collectors.toSet()));

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
        appUser.setUsername(appUserModel.getUsername());
        appUser.setPassword(appUserModel.getPassword());
        appUser.setGenerality(appUserModel.getGenerality());
        appUser.setUserEnabled(true);
        appUser.setRoles(Set.of(
                new Role("USER")
        ));
        //appUser.setRoles(appUserModel.getRolet().stream().map(RoleService::convertToEntity).collect(Collectors.toSet()));
        return appUser;
    }
}
