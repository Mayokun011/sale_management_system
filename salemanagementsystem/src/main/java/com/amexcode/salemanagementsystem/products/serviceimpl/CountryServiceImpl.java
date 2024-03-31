package com.amexcode.salemanagementsystem.products.serviceimpl;

import com.amexcode.salemanagementsystem.products.entity.Country;
import com.amexcode.salemanagementsystem.products.repository.CountryRepository;
import com.amexcode.salemanagementsystem.products.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;
    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
