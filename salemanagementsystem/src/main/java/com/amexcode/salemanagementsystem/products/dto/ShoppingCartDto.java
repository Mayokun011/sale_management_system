package com.amexcode.salemanagementsystem.products.dto;

import com.amexcode.salemanagementsystem.products.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartDto{
    private Long id;
    private Customer customer;
    private double totalPrice;
    private int totalItems;
    private Set<CartItemDto> cartItems;
}
