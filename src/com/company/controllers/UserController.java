package com.company.controllers;

import com.company.entities.User;
import com.company.repositories.interfaces.IUserRepository;

import java.util.Locale;

public class UserController {
    private final IUserRepository repo;

    public UserController(IUserRepository repo) {
        this.repo = repo;
    }

    public String createUser(String name, String surname, String gender) {
        boolean male = gender.equalsIgnoreCase("male");
        User user = new User(name, surname, male);

        boolean created = repo.createUser(user);
        return (created ? "User was created!" : "User creation was failed!");

    }
}
