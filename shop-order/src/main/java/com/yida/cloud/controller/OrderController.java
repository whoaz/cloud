package com.yida.cloud.controller;

import com.yida.cloud.entity.Order;
import com.yida.cloud.entity.Product;
import com.yida.cloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    private @Autowired RestTemplate restTemplate;

    private @Resource OrderService orderService;



    @GetMapping("/prod/{pid}")
    public Order order(@PathVariable Long pid) {

        String url = "service-product";
        Product product = restTemplate.getForObject("http://" + url + "/product/" + pid, Product.class);
        Order order = new Order();
        order.setUserId(1L);
        order.setUserName("测试用户");
        order.setProductId(product.getId());
        order.setProductName(product.getName());
        order.setProductPrice(product.getPrice());
        order.setNumber(1);
        orderService.save(order);

        return order;

    }

}
