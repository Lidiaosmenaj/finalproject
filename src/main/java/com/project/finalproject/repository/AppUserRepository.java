package com.project.finalproject.repository;

import com.project.finalproject.entities.BlockOfClasses;
import com.project.finalproject.entities.Role;
import com.project.finalproject.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{

    AppUser findByUsername(String username);
    AppUser findByGenerality_Email(String email);
    AppUser getUserByRoles (Set<Role> roles);
    AppUser getUserByBlockOfClasses(Set<BlockOfClasses> className);

}
