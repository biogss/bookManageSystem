package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ValueConfig
 * @Description TODO
 * @Author wangHao
 * @DATE 2020/4/30 23:36
 * @Version 1.0
 */
@Configuration
public class ValueConfig {

    @Value("${system.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
