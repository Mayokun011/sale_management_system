package com.amexcode.salemanagementsystem.products.service;

import com.amexcode.salemanagementsystem.products.dto.CategoryDto;
import com.amexcode.salemanagementsystem.products.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category save(Category category);
    Category update(Category category);
    List<Category> findAllByTheActivated();
    List<Category> findAll();
    Optional<Category> findById(Long id);
    void deleteById(Long id);
    void enableById(Long id);
    List<CategoryDto> getCategoriesAndSize();

}
