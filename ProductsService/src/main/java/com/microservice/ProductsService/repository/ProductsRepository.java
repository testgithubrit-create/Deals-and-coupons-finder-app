package com.microservice.ProductsService.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.microservice.ProductsService.models.Products;

@Repository
@EnableMongoRepositories
public interface ProductsRepository extends MongoRepository<Products, String> {

	List<Optional<Products>> findByCategory(String category);

	


	

}
