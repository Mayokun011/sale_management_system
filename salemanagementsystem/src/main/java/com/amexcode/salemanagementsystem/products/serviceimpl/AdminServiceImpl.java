package com.amexcode.salemanagementsystem.products.serviceimpl;

import com.amexcode.salemanagementsystem.products.dto.AdminDto;
import com.amexcode.salemanagementsystem.products.entity.Admin;
import com.amexcode.salemanagementsystem.products.repository.AdminRepository;
import com.amexcode.salemanagementsystem.products.repository.RoleRepository;
import com.amexcode.salemanagementsystem.products.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;
    private final RoleRepository roleRepository;
    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }

    @Override
    public Admin findByUserName(String username) {
        return adminRepository.findByUsername(username);
    }
}
