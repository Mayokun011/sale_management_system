package com.amexcode.salemanagementsystem.products.dto;

import com.amexcode.salemanagementsystem.products.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private int currentQuantity;
    private double costPrice;
    private double salePrice;
    private Category category;
    private boolean activated;
    private boolean deleted;
    private String currentPage;

}
