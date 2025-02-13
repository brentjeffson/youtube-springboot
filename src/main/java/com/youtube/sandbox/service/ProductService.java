package com.youtube.sandbox.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.youtube.sandbox.mapper.ProductMapper;
import com.youtube.sandbox.model.Product;

@Service
public class ProductService {
    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public Product getProduct(int id) {
        return productMapper.get(id);
    }

    public List<Product> getProducts() {
        return productMapper.getAll();
    }

    public int addProduct(Product product) {
        return productMapper.add(product);
    }
}
