package com.wageesha.ilk_server.ServiceIMPL;

import com.wageesha.ilk_server.DataModels.Advertisement;
import com.wageesha.ilk_server.DataModels.Role;
import com.wageesha.ilk_server.DataModels.User;
import com.wageesha.ilk_server.Repositories.AdvertisementRepository;
import com.wageesha.ilk_server.Repositories.RoleRepository;
import com.wageesha.ilk_server.Repositories.UserRepository;
import com.wageesha.ilk_server.Services.AdvertisementService;
import com.wageesha.ilk_server.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AdvertisementService advertisementService;

    public ResponseEntity<User> updateUserById(String id, User user) {

        Optional<User> userData = userRepository.findById(id);

        if (userData.isPresent()) {
            User _user = userData.get();

            _user.setFirstName(user.getFirstName());
            _user.setLastName(user.getLastName());
            _user.setUserLocation(user.getUserLocation());
            _user.setProfilePicture(user.getProfilePicture());
            _user.setEmailVerification(user.getEmailVerification());
            _user.setAccountCreatedDate(LocalDate.now());

            return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<HttpStatus> deleteUserByUserId( String userId) {
        try {
            advertisementService.deleteAdvertisementsByUserId(userId);
            userRepository.deleteById(userId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    public ResponseEntity<HttpStatus> deleteAllUserUsers() {

        try{
            String roleName = "ROLE_USER";
            Role role = roleRepository.findByName(roleName);

            List<User> users = new ArrayList<User>();

            userRepository.findByRole(role.getId()).forEach(users::add);

            for (User user:users) {
                advertisementService.deleteAdvertisementsByUserId(user.getId());
            }


                userRepository.deleteAll(users);

            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }

    }

    public ResponseEntity<List<User>> getAllUsers(String role) {
        try {
            List<User> users = new ArrayList<User>();

           // if (role == null)
                userRepository.findAll().forEach(users::add);
            //else
            //  userRepository.findByRoleContaining(role).forEach(users::add);

            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(users, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
