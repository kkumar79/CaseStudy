package com.kishan.catalogservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kishan.catalogservice.model.IdGenerator;

@Repository
public interface IdRepository extends MongoRepository<IdGenerator, String>{

}
