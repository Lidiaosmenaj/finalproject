package com.project.finalproject.service;

import com.project.finalproject.entities.Role;
import com.project.finalproject.models.RoleModel;
import com.project.finalproject.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.stream.Collectors;

public class RoleService {
    @Autowired
     private RoleRepository roleRepository;

    private Set<RoleModel> getAllRoles(){
        return roleRepository
                .findAll()
                .stream()
                .map(RoleService::convertToModel)
                .collect(Collectors.toSet());
    }

    public static RoleModel convertToModel(Role entity){
        RoleModel roleModel = new RoleModel();

        roleModel.setRoliName(entity.getRoleName());

        return roleModel;
    }

    public static Role convertToEntity(RoleModel roleModel){
        Role role = new Role();

        role.setRoleName(roleModel.getRoliName());

        return role;
    }
}
