package com.caloger.social.ladder.Users;

import com.caloger.social.ladder.Roles.UserRole;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userName;
    private String password;
    private boolean active;
    private UserRole role;

    public UserModel() {
    }

    public UserModel(long id, String userName, String password, boolean active, UserRole role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public UserModel(String userName, String password, boolean active, UserRole role) {
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.role = role;
    }

    public UserModel(String username, String password) {
        this.userName = userName;
        this.password = password;
        this.active = true;
        this.role = UserRole.USER;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", role=" + role +
                '}';
    }
}
