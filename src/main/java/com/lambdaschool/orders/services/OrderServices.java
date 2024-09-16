package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;

import java.util.List;

public interface OrderServices
{
    Order save(Order order);

    List<Order> findAllOrders();
}
