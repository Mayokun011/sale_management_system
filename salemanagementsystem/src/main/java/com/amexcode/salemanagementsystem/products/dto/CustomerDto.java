package com.amexcode.salemanagementsystem.products.dto;

import com.amexcode.salemanagementsystem.products.entity.City;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    @Size(min = 3, max = 20, message = "First name contains 3-20 characters")
    private String firstName;
    @Size(min = 3, max = 20, message = "Last name contains 3-20 characters")

    private String lastName;
    private String username;
    @Size(min = 5, max = 20, message = "Password contains 5-20 characters")

    private String password;
    @Size(min = 10, max = 20, message = "Phone number contains 10-20 characters")
    private String phoneNumber;
    private String address;
    private String confirmPassword;
    private City city;
    private String country;
}
