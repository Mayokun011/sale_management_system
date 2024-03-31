package com.amexcode.salemanagementsystem.products.serviceimpl;

import com.amexcode.salemanagementsystem.products.entity.City;
import com.amexcode.salemanagementsystem.products.repository.CityRepository;
import com.amexcode.salemanagementsystem.products.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
