package com.mengxuegu.springcloud.mapper;

import com.mengxuegu.springcloud.entities.Product;

import java.util.List;

/**
 * Created by xiaoxi on 2019/8/6.
 */
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);

}
