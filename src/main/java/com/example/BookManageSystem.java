package com.example;

import com.example.config.SystemConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import redis.clients.jedis.Jedis;

/**
 * @ClassName BookManageSystem
 * @Description 启动类
 * @Author wangHao
 * @DATE 2020/4/18 17:02
 * @Version 1.0
 */
@SpringBootApplication
public class BookManageSystem {
    public static void main(String[] args) {
        SpringApplication.run(BookManageSystem.class, args);
    }
}
