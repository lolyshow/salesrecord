package com.example.salesrecordapp.salesrecord.payload.Request;

import javax.validation.constraints.NotBlank;

public class LoginRequest{
//    @NotBlank
   private  String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;

    public LoginRequest(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public LoginRequest() {
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}