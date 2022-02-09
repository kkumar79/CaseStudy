package com.kishan.orderservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kishan.orderservice.model.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {

}
