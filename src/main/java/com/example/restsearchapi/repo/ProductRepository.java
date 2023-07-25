package com.example.restsearchapi.repo;

import com.example.restsearchapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Long> {

    //jpa query
//    @Query("SELECT p FROM PRODUCT p WHERE " +
//            "p.name LIKE CONCAT('%',:query,'%')" +
//            "p.description LIKE CONCAT('%',:query,'%')")

    //native query
    @Query(value = "SELECT * FROM products p WHERE " +
            "p.name LIKE CONCAT('%' , :query, '%') AND " +
            "p.description LIKE CONCAT('%' , :query, '%')", nativeQuery = true)
    List<Product> searchProducts(String query);
}
