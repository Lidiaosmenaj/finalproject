package com.project.finalproject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
    @Table
    public class User {

        @Id
        private int id;
        @Column(name = "username")
        private String username;
        @Column(name = "email")
        private String email;
        @Column(name = "password")
        private String password;

        public User(int id, String username, String email, String password) {
            this.id = id;
            this.username = username;
            this.email = email;
            this.password = password;
        }
    }
