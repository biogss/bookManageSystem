package com.example.bookmanagesystem;

import com.example.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
class BookmanagesystemApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(BookmanagesystemApplicationTests.class);

    @Autowired
    RedisUtil redisUtil;

    @Test
    void contextLoads() {
        for (int i = 0; i < 100; i++) {
            Jedis jedis = redisUtil.getJedis();
            logger.error(jedis.set("app",jedis.toString()));
            logger.error(jedis.get("app"));
            jedis.close();
        }
    }

}
