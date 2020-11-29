package com.opac.scms.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="user_name")
    private String userName;
    private String password;
    private int active;
    private String roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active==1;
    }

    public void setActive(boolean active) {
        this.active = active?1:0;
    }

    public String getRoles() {
        //return roles;
        return "ROLE_USER";
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
