package org.acalltoauction.data.repository;

import org.acalltoauction.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User, String> {

}
