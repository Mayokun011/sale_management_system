package com.amexcode.salemanagementsystem.products.repository;

import com.amexcode.salemanagementsystem.products.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
