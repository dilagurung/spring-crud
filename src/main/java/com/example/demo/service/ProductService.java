package com.example.demo.service;
import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by oa on 1/21/2019.
 */
@Service
public class ProductService
{
    @Autowired
    ProductRepo productRepo;
    public  void create(Product product)
    {
        productRepo.save(product);
    }

    public List<Product> findAll()
    {
        return  productRepo.findAll();
    }
    public void delete(Long id)
    {
        productRepo.deleteById(id);
    }
    public Product findById(Long id )
    {
        return productRepo.findById(id).get();
    }




}
