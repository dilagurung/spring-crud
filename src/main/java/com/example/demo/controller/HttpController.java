package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by oa on 1/21/2019.
 */
@RestController
public class HttpController
{

    @Autowired
    ProductService productService;
    @RequestMapping(method = RequestMethod.POST, value = "/product")
    public ResponseEntity<Product> save(@RequestBody Product product)
    {
        productService.create(product);
        return new ResponseEntity<Product>(product, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product")
    public ResponseEntity<List<Product>>  findAll()
    {
        return new ResponseEntity<List<Product>>(productService.findAll(),HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product/{id}")
    public ResponseEntity<Product>  findById(@PathVariable Long id)
    {
        return new ResponseEntity<Product>(productService.findById(id),HttpStatus.ACCEPTED);
    }


}
