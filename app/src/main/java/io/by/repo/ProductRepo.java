package io.by.repo;

import io.by.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {
    public List<Product> findByCategory(String category);
}
