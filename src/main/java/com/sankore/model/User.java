package com.sankore.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by josephmarcus on 22/08/2018.
 */
@Entity
@Table(name = "User Table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private UserStatus status;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    @Enumerated(value = EnumType.STRING)
    private UserStatus role;
    @OneToOne
    @JoinColumn(name = "department_id")
    private long departmentId;
    @Column
    private String avatar;
    @Column
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
