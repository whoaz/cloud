package com.yida.cloud.controller;

import com.yida.cloud.entity.Product;
import com.yida.cloud.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {


    private @Resource ProductService productService;

    @GetMapping("/{id}")
    public Product product(@PathVariable Long id) {
        return productService.findById(id);
    }

}
