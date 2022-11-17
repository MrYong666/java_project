package com.atguigu.boot.mapper;

import com.atguigu.boot.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface CityMapper {
    @Select("select * from city where id=#{id}")
    public City getById(Long id);

//    @Insert("INSERT INTO `db_account`.`city` (`name`, `state`, `country`) VALUES (#{name},#{state},#{country});")
//    @Options(useGeneratedKeys = true,keyProperty = "id")
    public  void  insert(City city);
}
