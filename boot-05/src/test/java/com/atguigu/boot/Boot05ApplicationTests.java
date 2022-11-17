package com.atguigu.boot;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.service.UserService;
import com.atguigu.boot.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Boot05ApplicationTests {

    @Autowired(required = false)
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {
        Integer integer = jdbcTemplate.queryForObject("SELECT count(*) FROM account_tb1", Integer.class);
        log.info("记录总数：{}；",integer);
        log.info("数据源类型：{}；",dataSource.getClass());
    }

    @Test
    void testUserMapper()
    {
        User user = userService.getById(1);
        log.info("用户信息：{}",user);
    }

}
