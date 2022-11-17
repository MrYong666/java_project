package com.atguigu.boot.service;

import com.atguigu.boot.bean.City;
import com.atguigu.boot.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City getById(Long id)
    {
       return cityMapper.getById(id);
    }
    public  void  insert(City city)
    {
        cityMapper.insert(city);
    }
}

