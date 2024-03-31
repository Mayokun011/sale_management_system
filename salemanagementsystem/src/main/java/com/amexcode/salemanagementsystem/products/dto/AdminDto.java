package com.amexcode.salemanagementsystem.products.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AdminDto {
    @Size(min = 3, max = 20, message = "First name contains 3-20 characters")
    private String firstName;
    @Size(min = 3, max = 20, message = "Last name contains 3-20 characters")

    private String lastName;
    private String username;
    @Size(min = 5, max = 20, message = "Password contains 5-20 characters")

    private String password;
    private String repeatPassword;
}
