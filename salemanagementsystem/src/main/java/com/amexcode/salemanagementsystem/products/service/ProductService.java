package com.amexcode.salemanagementsystem.products.service;

import com.amexcode.salemanagementsystem.products.dto.ProductDto;
import com.amexcode.salemanagementsystem.products.entity.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    List<ProductDto> products();
    List<ProductDto> allProducts();
    void enableById(Long id);
    void deleteById(Long id);
    ProductDto getById(Long id);
    Product findById(Long id);
    List<ProductDto> randomProduct();
    Page<ProductDto> searchProducts(int pageNo,  String keyword);
    Page<ProductDto> getAllProducts(int pageNo);
    Page<ProductDto> getAllProductsForCustomer(int pageNo);
    List<ProductDto> findAllByCategory(String category);
    List<ProductDto> filterHighProducts();
    List<ProductDto> filterLowerProducts();
    List<ProductDto> listViewProducts();
    List<ProductDto> findByCategoryId(Long id);
    List<ProductDto> searchProducts(String keyword);
}
