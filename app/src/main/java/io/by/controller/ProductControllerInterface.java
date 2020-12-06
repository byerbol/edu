package io.by.controller;

import io.by.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductControllerInterface {
    public List<Product> getAll();
    public ResponseEntity<Product> getProductById(String id);
    public Product addProduct(Product p);
    public ResponseEntity<Product> updateProduct(String id, Product updated);
    public ResponseEntity<?> deleteProduct(String id);
}
