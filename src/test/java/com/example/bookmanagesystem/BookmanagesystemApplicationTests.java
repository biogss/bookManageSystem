package com.example.bookmanagesystem;

import com.example.util.RedisUtil;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.util.Slowlog;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
class BookmanagesystemApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(BookmanagesystemApplicationTests.class);

    @Autowired
    RedisUtil redisUtil;

    @Test
    void contextLoads() {
//        不释放链接会因为链接不够报错
//        for (int i = 0; i < 100; i++) {
//            Jedis jedis = redisUtil.getJedis();
//            logger.error(jedis.set("app",jedis.toString()));
//            logger.error(jedis.get("app"));
//            jedis.close();
//        }

//        STRING
//
//        logger.info(jedis.set("hello","redis"));
//        logger.info(String.valueOf(jedis.exists("hello")));
//        logger.info(jedis.get("hello"));
//        logger.info(jedis.get("hello1"));
//        logger.info(jedis.setex("java", 100, "study"));
//        logger.info(String.valueOf(jedis.setnx("java", "studyhard")));
//        logger.info(String.valueOf(jedis.setnx("python", "studyhard")));
//        logger.info(jedis.mset("a", "1", "b", "2", "c", "jedis"));
//        List<String> result = jedis.mget("a","b","c");
//        result.stream().forEach((str) -> {
//            logger.info(str);
//        });
//        logger.info(String.valueOf(jedis.ttl("a")));
//        jedis.set("num", 1);//ERROR
//        logger.info(jedis.type("NUM"));
//        logger.info(jedis.type("num"));
//        jedis.set("exp", "timeout", "nx", "ex", 1000);
//        logger.info(String.valueOf(jedis.strlen("exp")));
//        HASH
//        Jedis jedis = redisUtil.getJedis();
//        logger.info(String.valueOf(jedis.hset("personHash","name", "wanghao")));
//        jedis.hset("personHash", "age", "12");
//        List<String> hmget = jedis.hmget("personHash", "name", "age", "sex");
//        hmget.stream().forEach((str) -> {
//            logger.info(str);
//        });
//        Map<String, String> personHash = jedis.hgetAll("personHash");
//        personHash.forEach( (key, val) -> {
//            logger.info(key);
//            logger.info(val);
//        });
//        jedis.hset("personHash", "ageH", "11");
//        Set<String> age = jedis.hkeys("personHash");
//        age.stream().forEach((str) -> {
//            logger.info(str);
//        });
//        Set<Map.Entry<String, String>> entrySet = personHash.entrySet();
//        entrySet.stream().forEach((entry) -> {
//            logger.info(entry.getKey());
//            logger.info(entry.getValue());
//        });

//        LIST
//        Jedis jedis = redisUtil.getJedis();
//        logger.info(String.valueOf(jedis.lpush("leftList",
//                "c", "java", "python", "c#", "php", "plsql")));
//        logger.info(jedis.lpop("leftList"));
//        logger.info(String.valueOf(jedis.llen("leftList")));
//        logger.info(jedis.lindex("leftList", 0));
//        List<String> leftList = jedis.lrange("leftList", 0, -1);
//        leftList.stream().forEach((str) -> {
//            logger.info("遍历" + str);
//        });

//        jedis.expire("leftList", 1000);
//        logger.info(String.valueOf(jedis.ttl("leftList")));
//        logger.info(String.valueOf(jedis.lrem("leftList", 2, "java")));
//        logger.info(jedis.lset("leftList", 0, "php2"));

//        SET
//        Jedis jedis = redisUtil.getJedis();
//        jedis.sadd("mySet", "apple", "pear", "blueberry", "peach", "strawberry");
//        logger.info(String.valueOf(jedis.sismember("mySet", "apple")));
//        logger.info(String.valueOf(jedis.scard("mySet")));
//        Set<String> mySet = jedis.smembers("mySet");
//        mySet.stream().forEach((str) -> {
//            logger.info("遍历：" + str);
//        });
//        logger.info(jedis.spop("mySet"));
//        List<String> stringSet = jedis.srandmember("mySet", 5);
//        stringSet.stream().forEach( (param) -> {
//            logger.info(param);
//        });

        //OTHER
        Jedis jedis = redisUtil.getJedis();
        jedis.multi();
//        jedis.rename("mySet", "mySetNew");
//        List<String> configList = jedis.configGet("*");
//        configList.stream().forEach((param) -> {
//            logger.info(param);
//        });
//        jedis.configSet("slowlog-log-slower-than", "0");
//        List<Slowlog> slowlogs = jedis.slowlogGet();
//        slowlogs.stream().forEach((param) -> {
//            param.toString();
//        });

    }



}
