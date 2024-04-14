package com.example.queenapp;

public class Usuario {
    private String user;
    private String password;

    public Usuario(String user_,String password_){
        this.user = user_;
        this.password = password_;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
