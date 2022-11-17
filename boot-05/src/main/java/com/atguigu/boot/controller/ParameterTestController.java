package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class ParameterTestController {

    @Autowired(required = false)
    JdbcTemplate jdbcTemplate;

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable Map<String,String> kv,
                                     @RequestHeader Map<String,String> header)
    {
        Map<String,Object> map = new HashMap<>();
//        map.put("id",id);
//        map.put("kv",kv);
        map.put("header",header);
        return  map;
    }
    @PostMapping("/savae")
    public  Map sava(@RequestBody String s)
    {
        Map<String,Object> map = new HashMap<>();
        map.put("content",s);
        return  map;
    }

    @PostMapping("/savaeobj")
    public Person savaeobj(Person person)
    {
        Integer integer = jdbcTemplate.queryForObject("SELECT count(*) FROM account_tb1", Integer.class);
        log.info("记录总数：{}；",integer);
        return  person;
    }

    @GetMapping("/sql")
    public String savaeobj( )
    {
        Integer integer = jdbcTemplate.queryForObject("SELECT count(*) FROM account_tb1", Integer.class);
        log.info("记录总数：{}；",integer);
        return  integer.toString();
    }

}
