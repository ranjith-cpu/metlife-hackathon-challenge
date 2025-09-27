package com.metlife.arogyasutra.model;

public class UserDetails {

    private String username;

    private String password;

    private String unique_id;

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
        return "UserDetails{" +
                "userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", unique_id='" + unique_id + '\'' +
                '}';
    }
}
