package com.example.bookmanagesystem;

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
    Jedis jedis;
    @Test
    void contextLoads() {
        jedis.set("app","124");
        logger.error(jedis.get("hello"));
        logger.error(jedis.get("app"));
    }

}
