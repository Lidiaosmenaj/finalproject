package com.project.finalproject.models;

import com.project.finalproject.entities.Generality;

import java.util.Set;

public class AppUserModel {

    private String username;
    private String password;
    private Generality generality;
    private Set<RoleModel> rolet;

    public AppUserModel(String username, String password, Set<RoleModel> rolet, Generality generality) {
        this.username = username;
        this.password = password;
        this.rolet = rolet;
        this.generality = generality;
    }

    public AppUserModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Generality getGenerality() {
        return generality;
    }

    public void setGenerality(Generality generality) {
        this.generality = generality;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleModel> getRolet() {
        return rolet;
    }

    public void setRolet(Set<RoleModel> rolet) {
        this.rolet = rolet;
    }
}
