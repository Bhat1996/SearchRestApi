package com.example.restsearchapi.controller;

import com.example.restsearchapi.entity.Product;
import com.example.restsearchapi.service.ProductService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
//   @Cacheable(value = "productService", key = "#query")
    public ResponseEntity<?> searchProducts(@RequestParam String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
