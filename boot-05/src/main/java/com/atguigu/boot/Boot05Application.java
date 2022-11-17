package com.atguigu.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan("com.atguigu.boot.mapper")
@SpringBootApplication
public class Boot05Application {

    //aa
    public static void main(String[] args) {
        ConfigurableApplicationContext run =SpringApplication.run(Boot05Application.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames)
//        {
//            System.out.println(name);
//        }
//        Pet tom = run.getBean("tom", Pet.class);
    }

}
