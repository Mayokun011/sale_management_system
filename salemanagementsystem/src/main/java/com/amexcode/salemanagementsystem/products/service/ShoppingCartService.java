package com.amexcode.salemanagementsystem.products.service;

import com.amexcode.salemanagementsystem.products.dto.ProductDto;
import com.amexcode.salemanagementsystem.products.dto.ShoppingCartDto;
import com.amexcode.salemanagementsystem.products.entity.ShoppingCart;


public interface ShoppingCartService {

    ShoppingCart addItemToCart(ProductDto productDto, int quantity, String username);
    ShoppingCart updateCart(ProductDto productDto, int quantity, String  username);
    ShoppingCart removeItemFromCart(ProductDto productDto, String username);
    ShoppingCartDto addItemToCart(ShoppingCartDto cartDto, ProductDto productDto, int quantity);
    ShoppingCartDto updateCart(ShoppingCartDto cartDto, ProductDto productDto, int quantity);
    ShoppingCartDto removeItemFromCart(ShoppingCartDto cartDto, ProductDto productDto, int quantity);
    ShoppingCart  addCart(ShoppingCartDto cartDto, ShoppingCart cart);
    void deleteCartById(Long id);
    ShoppingCart getCart(String username);
}
