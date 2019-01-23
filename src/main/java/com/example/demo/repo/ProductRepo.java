package com.example.demo.repo;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by oa on 1/21/2019.
 */
public interface ProductRepo extends JpaRepository<Product, Long>
{


List<Product> findByProductNameAndPrice(String productName, Double price);

}
