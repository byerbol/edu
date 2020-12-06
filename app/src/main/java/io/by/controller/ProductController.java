package io.by.controller;

import io.by.model.Product;
import io.by.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ProductController implements ProductControllerInterface {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // successfully
    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    // successfully
    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    // successfully
    @PostMapping
    public Product addProduct(@Valid @RequestBody Product product) {
        return productService.addProduct(product);
    }

    // successfully
    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable String id,
                                                 @RequestBody Product updated) {
        return productService.updateProduct(id, updated);
    }

    // successfully
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable String id) {
        return productService.deleteProduct(id);
    }

}
