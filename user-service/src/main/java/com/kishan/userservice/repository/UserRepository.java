package com.kishan.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kishan.userservice.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{
	User findByUsername(String username);
}
