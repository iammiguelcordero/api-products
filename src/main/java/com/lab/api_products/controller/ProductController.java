package com.lab.api_products.controller;

import com.lab.api_products.entity.Product;
import com.lab.api_products.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Product> findAll() {
        return service.findAll();
    }
}