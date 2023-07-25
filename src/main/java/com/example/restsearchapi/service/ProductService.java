package com.example.restsearchapi.service;

import com.example.restsearchapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
