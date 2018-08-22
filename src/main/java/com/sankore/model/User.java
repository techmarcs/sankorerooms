package com.sankore.model;

import java.util.Date;

/**
 * Created by josephmarcus on 22/08/2018.
 */
public class User {
    private long id;
    private UserStatus status;
    private String username;
    private String password;
    private UserStatus role;
    private long departmentId;
    private String avatar;
    private Date lastloggedin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
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

    public UserStatus getRole() {
        return role;
    }

    public void setRole(UserStatus role) {
        this.role = role;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getLastloggedin() {
        return lastloggedin;
    }

    public void setLastloggedin(Date lastloggedin) {
        this.lastloggedin = lastloggedin;
    }
}
