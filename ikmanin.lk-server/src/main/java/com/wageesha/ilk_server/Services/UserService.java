package com.wageesha.ilk_server.Services;

import com.wageesha.ilk_server.DataModels.User;
import com.wageesha.ilk_server.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class UserService {
/*
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<User> createUser(@RequestBody User user) {
        try {
            User _user = userRepository.save(new User(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword()));

            return new ResponseEntity<>(_user, HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }*/
}
