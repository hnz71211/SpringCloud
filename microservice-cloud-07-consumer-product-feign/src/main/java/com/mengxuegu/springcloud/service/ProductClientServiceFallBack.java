package com.mengxuegu.springcloud.service;

import com.mengxuegu.springcloud.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by xiaoxi on 2019/8/10.
 */
@Component //一定要加上它,将它纳入到容器中
public class ProductClientServiceFallBack implements ProductClientService {


    @Override
    public boolean add(@RequestBody Product product) {
        return false;
    }

    @Override
    public Product get(@PathVariable("id") Long id) {
        return new Product(id, "id="+ id + "无数据--feign&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
