package com.amexcode.salemanagementsystem.products.repository;

import com.amexcode.salemanagementsystem.products.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    @Query(value = "update carts_items set shopping_cart_id = null where shopping_cart_id = ?1",
                      nativeQuery = true)
    void deleteCartItemById(Long cartId);
}
