package com.yida.cloud.service.impl;

import com.yida.cloud.dao.OrderDao;
import com.yida.cloud.entity.Order;
import com.yida.cloud.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

}
