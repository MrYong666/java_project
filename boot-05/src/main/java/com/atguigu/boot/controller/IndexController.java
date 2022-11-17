package com.atguigu.boot.controller;

import com.atguigu.boot.bean.City;
import com.atguigu.boot.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class IndexController {

    @Autowired
    CityService cityService;

    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id) {

        return cityService.getById(id);
    }

    @PostMapping("/saveCity")
    public City saveCity(City city) {
        cityService.insert(city);
        return city;
    }
}
