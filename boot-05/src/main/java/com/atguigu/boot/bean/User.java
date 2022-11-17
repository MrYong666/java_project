package com.atguigu.boot.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class User {

    @TableField(exist = false)
    private String tt;

    private Long id;
    private String name;
    private Integer age;
    private String email;
}
