package com.amexcode.salemanagementsystem.products.repository;

import com.amexcode.salemanagementsystem.products.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
