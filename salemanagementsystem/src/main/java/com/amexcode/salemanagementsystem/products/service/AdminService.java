package com.amexcode.salemanagementsystem.products.service;

import com.amexcode.salemanagementsystem.products.dto.AdminDto;
import com.amexcode.salemanagementsystem.products.entity.Admin;

public interface AdminService {
    Admin save (AdminDto adminDto);

    Admin findByUserName(String username);
}
