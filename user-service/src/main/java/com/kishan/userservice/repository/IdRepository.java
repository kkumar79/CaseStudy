package com.kishan.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kishan.userservice.model.IdGenerator;

@Repository
public interface IdRepository extends MongoRepository<IdGenerator, String> {

}
