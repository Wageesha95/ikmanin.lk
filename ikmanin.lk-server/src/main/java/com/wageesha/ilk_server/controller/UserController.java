package com.wageesha.ilk_server.controller;

import com.wageesha.ilk_server.DataModels.User;
import com.wageesha.ilk_server.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {/*

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createTutorial(@RequestBody User user) {
        return  ResponseEntity.ok().body(this.userService.createUser(user).getBody());
    }*/
}
