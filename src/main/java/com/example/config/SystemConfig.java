package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName SystemConfig
 * @Description TODO
 * @Author wangHao
 * @DATE 2020/4/30 22:19
 * @Version 1.0
 */

@ConfigurationProperties(prefix = "system.config")
@Configuration
public class SystemConfig {

    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
