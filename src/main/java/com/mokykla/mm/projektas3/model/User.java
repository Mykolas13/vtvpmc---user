package com.mokykla.mm.projektas3.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class User {

    @NotNull
    @Length(min = 1, max = 30)
    private String username;

    @NotNull
    @Length(min = 1, max = 100)
    private String firstName;

    @NotNull
    @Length(min = 1, max = 100)
    private String lastName;

    @NotNull
    @Length(min = 1, max = 200)
    @Email
    private String email;



    public User(){

    }

    public User(String username, String firstName, String lastName, String email) {

        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
