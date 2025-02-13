package com.youtube.sandbox.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.youtube.sandbox.model.Product;

@Mapper
public interface ProductMapper {
    Product get(int id);
    List<Product> getAll();
    int add(Product product);
}
