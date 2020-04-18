package com.wageesha.ilk_server.Repositories;



import com.wageesha.ilk_server.DataModels.Advertisement;
import com.wageesha.ilk_server.DataModels.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

        Optional<User> findByUsername(String username);

        Boolean existsByUsername(String username);

        Boolean existsByEmail(String email);

        User findUserById(String userId);

        @Query(value = "{ 'roles.id' : ?0 }")
        List<User> findByRole(String roleId);
    }


