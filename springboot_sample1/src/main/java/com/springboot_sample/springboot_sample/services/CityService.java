package com.springboot_sample.springboot_sample.services;

import com.springboot_sample.springboot_sample.repository.CitiesRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    CitiesRepository citiesRepository = new CitiesRepository();

    public String create(String cityName,Integer countryId){
        return citiesRepository.create(cityName, countryId);
    }

    public String read(Integer id){
        return citiesRepository.read(id);
    }

    public String readAll(){ return citiesRepository.readAll();
    }

    public String update(Integer id, String cityName){
        return citiesRepository.update(id, cityName);
    }

    public String delete(Integer id){
        return citiesRepository.delete(id);
    }
}
