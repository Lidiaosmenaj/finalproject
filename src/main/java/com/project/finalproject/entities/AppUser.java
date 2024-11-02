package com.project.finalproject.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(unique = true)
    private String username;
    private String password;
    private boolean userEnabled;
    @Embedded
    private Generality generality;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "Useri_Roli",
            joinColumns = {@JoinColumn(name = "User_Id")},
            inverseJoinColumns = {@JoinColumn(name = "Role_Id")
            })
    private Set<Role> roles;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "Useri_Klasa",
            joinColumns = {@JoinColumn(name = "User_Id")},
            inverseJoinColumns = {@JoinColumn(name = "Klasa_ID")})
    private Set<BlockOfClasses> blockOfClasses;


    public AppUser() {
    }

    public AppUser(Long userId, String username, String password, boolean userEnabled, Generality generality, Set<Role> roles, Set<BlockOfClasses> blockOfClasses) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userEnabled = userEnabled;
        this.generality = generality;
        this.roles = roles;
        this.blockOfClasses = blockOfClasses;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isUserEnabled() {
        return userEnabled;
    }

    public void setUserEnabled(boolean userEnabled) {
        this.userEnabled = userEnabled;
    }

    public Generality getGenerality() {
        return generality;
    }

    public void setGenerality(Generality generality) {
        this.generality = generality;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<BlockOfClasses> getBlockOfClasses() {
        return blockOfClasses;
    }

    public void setBlockOfClasses(Set<BlockOfClasses> blockOfClasses) {
        this.blockOfClasses = blockOfClasses;
    }
}

