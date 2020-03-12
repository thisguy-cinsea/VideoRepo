package com.github.thisguy_cinsea.videorepo.model;

import javax.persistence.*;

@Entity
//@Table(name = "user")
public class User implements UserInterface {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "user_id")
    private Integer userId;
//    @Column(name = "user_name")
    private String userName;
//    @Column(name = "password")
    private String password;

    public User() {
    }

    public Integer getId() {
        return userId;
    }

    public void setId(Integer userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
