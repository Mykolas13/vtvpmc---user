package com.mokykla.mm.projektas3.controllers;

import com.mokykla.mm.projektas3.dao.UserDao;
import com.mokykla.mm.projektas3.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;


@RestController
@Api(value = "user")
@RequestMapping(value = "/users")

public class UserController {



    private final UserDao userDao;
    @Autowired
    public UserController(UserDao userDao) {

        this.userDao = userDao;

    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Isrinkt vartotojus", notes = "Rodo registruotus vartotojus.")
    public List<User> getUsers() {

        return userDao.getUsers();

    }

//    @RequestMapping(method = RequestMethod.GET)
//    public List<User> getUsers() {
//
//        return Collections.emptyList();
//    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Prideda vartotojus", notes = "Prideda registruotus vartotojus.")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody @Valid final User createUserCommand) {

      userDao.createUser(createUserCommand);

    }

    @RequestMapping(path = "/{username}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Trinti vartotojus", notes = "Trina registruotus vartotojus.")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable final String username) {
//        System.out.println("Deleting user: " + username);
        userDao.deleteUser(username);

    }


}
