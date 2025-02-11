package com.youtube.sandbox.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.youtube.sandbox.model.Product;

@Mapper
public interface ProductMapper {
    List<Product> findAll();

    Product find(int id);

    int add(Product entity);
}
