package org.acalltoauction.data.repositories;

import org.acalltoauction.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String username);
}
