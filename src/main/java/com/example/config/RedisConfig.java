package com.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.SubstituteLogger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @ClassName RedisConfig
 * @Description TODO
 * @Author wangHao
 * @DATE 2020/5/6 21:47
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "spring.redis")
@Configuration
public class RedisConfig {

    private final Logger logger = LoggerFactory.getLogger(RedisConfig.class);
    /**端口*/
    private int port;

    /**redis服务器地址*/
    private String host;

    /**密码*/
    private String password;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
