package com.project.finalproject.repository;

import com.project.finalproject.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role getRoliByRoliId(int roliId);
}
