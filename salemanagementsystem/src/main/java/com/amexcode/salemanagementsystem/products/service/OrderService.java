package com.amexcode.salemanagementsystem.products.service;

import com.amexcode.salemanagementsystem.products.entity.Order;
import com.amexcode.salemanagementsystem.products.entity.ShoppingCart;

import java.util.List;

public interface OrderService {
    Order save(ShoppingCart shoppingCart);
    List<Order> findAll(String username);
    List<Order> findAllOrders();
    Order acceptOrder(Long id);
    void  removeOrder(Long id);
}
