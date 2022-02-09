package com.kishan.catalogservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kishan.catalogservice.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer>{

}
