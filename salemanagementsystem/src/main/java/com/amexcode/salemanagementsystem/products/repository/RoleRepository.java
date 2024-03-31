package com.amexcode.salemanagementsystem.products.repository;

import com.amexcode.salemanagementsystem.products.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
