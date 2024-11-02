package com.project.finalproject.models;

import com.project.finalproject.entities.Generality;

import java.util.Set;

public class AppUserModel {
    private Long userId;
    private String username;
    private String password;
    private Generality generality;
    private Set<RoleModel> rolet;

    public Long getUserId() { return userId;}
    public void setUserId(Long userId) {this.userId = userId;}
    public String getUserName() {
        return username;
    }
    public void setUserName(String username) {
        this.username = this.username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) { this.password = password; }
    public Generality getGjeneralitetet() {return generality;}
    public void setGjeneralitetet(Generality generality) {
        this.generality = generality;
    }

    public Set<RoleModel> getRolet() {
        return rolet;
    }
    public void setRole(Set<RoleModel> roles) {
        this.rolet = roles;
    }
    public void addRole(RoleModel role) {
        this.rolet.add(role);
    }

}
