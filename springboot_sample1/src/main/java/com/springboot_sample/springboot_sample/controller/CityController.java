package com.springboot_sample.springboot_sample.controller;

import org.springframework.web.bind.annotation.*;
import com.springboot_sample.springboot_sample.services.CityService;

@RestController
public class CityController {
//    CitiesRepository citiesRepository = new CitiesRepository();
    CityService cityService = new CityService();

    @PostMapping("cities")
    public String create(@RequestParam String cityName, @RequestParam Integer countryId){
        return cityService.create(cityName, countryId);
    }

    @GetMapping("cities/{id}")
    public String read(@PathVariable Integer id){
        return cityService.read(id);
    }

    @GetMapping("cities")
    public String readAll(){
        return cityService.readAll();
    }

    @PutMapping("cities/{id}")
    public String update(@PathVariable Integer id, @RequestParam String cityName){
        return cityService.update(id, cityName);
    }

    @DeleteMapping("cities/{id}")
    public String delete(@PathVariable Integer id){
        return cityService.delete(id);
    }
}
