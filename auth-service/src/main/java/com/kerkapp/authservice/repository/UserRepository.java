package com.kerkapp.authservice.repository;

import java.util.Optional;

import com.kerkapp.authservice.entity.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    Optional<User> findByUsername(String username);
}
