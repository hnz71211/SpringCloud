package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.entities.Product;

import java.util.List;

/**
 * Created by xiaoxi on 2019/8/6.
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
