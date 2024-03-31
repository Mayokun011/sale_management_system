package com.amexcode.salemanagementsystem.products.service;

import com.amexcode.salemanagementsystem.products.dto.CustomerDto;
import com.amexcode.salemanagementsystem.products.entity.Customer;

public interface CustomerService {
    Customer save(CustomerDto customerDto);
    Customer findByUsername(String username);
    Customer update(CustomerDto customerDto);
    Customer changePass(CustomerDto customerDto);
    CustomerDto getCustomer(String username);
}
