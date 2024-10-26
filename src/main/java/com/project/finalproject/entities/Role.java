package com.project.finalproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
    @ManyToMany
    private User user;
}
