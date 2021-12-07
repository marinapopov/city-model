package com.springboot_sample.springboot_sample.services;

import com.springboot_sample.springboot_sample.repository.CountriesRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    CountriesRepository countriesRepository = new CountriesRepository();

    public String create(String countryName){
        return countriesRepository.create(countryName);
    }

    public String read(Integer id){
        return countriesRepository.read(id);
    }

    public String readAll(){
        return countriesRepository.readAll();
    }

    public String update(Integer id, String countryName){
        return countriesRepository.update(id, countryName);
    }

    public String delete(Integer id){
        return countriesRepository.delete(id);
    }
}
