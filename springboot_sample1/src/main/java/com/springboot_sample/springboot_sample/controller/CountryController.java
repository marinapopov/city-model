package com.springboot_sample.springboot_sample.controller;

import org.springframework.web.bind.annotation.*;
import com.springboot_sample.springboot_sample.services.CountryService;

@RestController
public class CountryController {
//    CountriesRepository countriesRepository = new CountriesRepository();
    CountryService countryService = new CountryService();

    @PostMapping("countries")
    public String create(@RequestParam String countryName){
        return countryService.create(countryName);
    }

    @GetMapping("countries/{id}")
    public String read(@PathVariable Integer id){
        return countryService.read(id);
    }

    @GetMapping("countries")
    public String readAll(){
        return countryService.readAll();
    }

    @PutMapping("countries/{id}")
    public String update(@PathVariable Integer id, @RequestParam String countryName){
        return countryService.update(id, countryName);
    }

    @DeleteMapping("countries/{id}")
    public String delete(@PathVariable Integer id){
        return countryService.delete(id);
    }
}
