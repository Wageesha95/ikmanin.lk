package com.wageesha.ilk_server.Services;

import com.wageesha.ilk_server.DataModels.User;
import com.wageesha.ilk_server.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface UserService {



    //ResponseEntity<User> findUserById(String id);
    ResponseEntity<User> updateUserById(String id, User user);
    ResponseEntity<HttpStatus>deleteUserByUserId(String userId);
    ResponseEntity<List<User>>getAllUsers(String role);
    ResponseEntity<HttpStatus>deleteAllUserUsers();


}
