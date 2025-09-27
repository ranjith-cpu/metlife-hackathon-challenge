package com.metlife.arogyasutra.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Table(name = "User_Details")
@Entity
public class UserDetailPO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private int id;

    @Column(name= "username")
    private String username;

    @Column(name= "password")
    private String password;

    @Column(name="unique_id")
    private String unique_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    @Override
    public String toString() {
        return "UserDetailPO{" +
                "id=" + id +
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", unique_id='" + unique_id + '\'' +
                '}';
    }
}
