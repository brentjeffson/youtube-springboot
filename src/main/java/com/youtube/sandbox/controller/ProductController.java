package com.youtube.sandbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.sandbox.mapper.ProductMapper;
import com.youtube.sandbox.model.Product;
import com.youtube.sandbox.service.ProductService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Product>  getProduct(@PathVariable int id) {
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    @PostMapping("/")
    public ResponseEntity<Product>  addProduct(@RequestBody Product product) {
        int id = productService.addProduct(product);
        product.setId(id);
        return ResponseEntity.ok(product);
    }

}
