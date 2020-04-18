package com.wageesha.ilk_server.controller;

import com.wageesha.ilk_server.DataModels.Advertisement;
import com.wageesha.ilk_server.DataModels.User;
import com.wageesha.ilk_server.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/user/{id}")
    public ResponseEntity<User> createTutorial(@PathVariable("id") String id, @RequestBody User user) {
        return userService.updateUserById(id,user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<HttpStatus> createTutorial(@PathVariable("id") String userId) {
        return userService.deleteUserByUserId(userId);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String roleId) {
        return userService.getAllUsers(roleId);
    }


    @DeleteMapping("/users")
    public ResponseEntity<HttpStatus> deleteAllUserUsers() {
        return userService.deleteAllUserUsers();
    }

}
