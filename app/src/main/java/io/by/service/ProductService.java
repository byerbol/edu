package io.by.service;

import io.by.model.Product;
import io.by.repo.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private final ProductRepo productRepo;

    private final Logger logger = LoggerFactory.getLogger(ProductService.class);

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public ResponseEntity<Product> getProductById(String id) {
        logger.info(id);
        return productRepo.findById(id)
                .map(product -> ResponseEntity.ok().body(product))
                .orElse(ResponseEntity.notFound().build());
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public ResponseEntity<Product> updateProduct(String id, Product updated) {

        return productRepo.findById(id)
                .map(productData -> {
                    productData.setTitle(updated.getTitle());
                    productData.setPrice(updated.getPrice());
                    productData.setCategory(updated.getCategory());
                    Product updatedProduct = productRepo.save(productData);
                    return ResponseEntity.ok().body(updatedProduct);
                }).orElse(ResponseEntity.notFound().build());

    }

    public ResponseEntity<?> deleteProduct(String id) {
        return productRepo.findById(id)
                .map(product -> {
                    productRepo.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
