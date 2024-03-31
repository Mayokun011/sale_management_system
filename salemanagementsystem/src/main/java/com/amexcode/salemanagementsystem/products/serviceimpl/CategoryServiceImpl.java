package com.amexcode.salemanagementsystem.products.serviceimpl;

import com.amexcode.salemanagementsystem.products.dto.CategoryDto;
import com.amexcode.salemanagementsystem.products.entity.Category;
import com.amexcode.salemanagementsystem.products.repository.CategoryRepository;
import com.amexcode.salemanagementsystem.products.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public Category save(Category category) {
        Category categorysave = new Category();
        categorysave.setName(category.getName());
        categorysave.setActivated(true);
        categorysave.setDeleted(false);
        return categoryRepository.save(categorysave);
    }

    @Override
    public Category update(Category category) {
        Category categoryUpdate = categoryRepository.getReferenceById(category.getId());
        categoryUpdate.setName(category.getName());
        return categoryRepository.save(categoryUpdate);
    }

    @Override
    public List<Category> findAllByTheActivated() {
        return categoryRepository.findAllByActivated();
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        Category categoryDelete = categoryRepository.getById(id);
        categoryDelete.setActivated(false);
        categoryDelete.setDeleted(true);
        categoryRepository.save(categoryDelete);
    }

    @Override
    public void enableById(Long id) {
        Category categoryEnable = categoryRepository.getById(id);
        categoryEnable.setActivated(true);
        categoryEnable.setDeleted(false);
        categoryRepository.save(categoryEnable);
    }

    @Override
    public List<CategoryDto> getCategoriesAndSize() {
        List<CategoryDto> categories =categoryRepository.getCategoriesAndSize();
        return categories;
    }
}
