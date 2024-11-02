package com.project.finalproject.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roliId;
    //"rolet" eshte variabli qe deklaruam te klasa useri per bashkimin
    @ManyToMany(mappedBy = "roles")
    private Set<AppUser> userList;

    private String roleName;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public int getRoliId() {
        return roliId;
    }

    public void setRoliId(int roliId) {
        this.roliId = roliId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String rolName) {
        this.roleName = rolName;
    }

    public Set<AppUser> getUserList() {
        return userList;
    }

    public void setUserList(Set<AppUser> userList) {
        this.userList = userList;
    }
}
