package com.amexcode.salemanagementsystem.products.repository;

import com.amexcode.salemanagementsystem.products.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
