package com.yida.cloud.service.impl;

import com.yida.cloud.dao.ProductDao;
import com.yida.cloud.entity.Product;
import com.yida.cloud.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {

    private @Resource ProductDao productDao;


    @Override
    public Product findById(Long id) {
        return productDao.findById(id).orElse(null);
    }

}
