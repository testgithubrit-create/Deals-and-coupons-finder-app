package com.Payment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.Payment.Model.OrderResponse;

@EnableMongoRepositories
public interface PaymentRepository extends MongoRepository<OrderResponse, Integer> {

}
