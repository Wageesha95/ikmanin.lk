package com.wageesha.ilk_server.Repositories;

import com.wageesha.ilk_server.DataModels.ERole;
import com.wageesha.ilk_server.DataModels.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role,String> {

    Optional<Role> findByName(ERole name);
    Role findByName(String name);
}
