package com.example.util;

import com.example.config.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Component
public class RedisUtil {

	private RedisConfig redisConfig;

	private JedisPool jedisPool = null;
	@Autowired
	public RedisUtil (RedisConfig redisConfig) {
		this.redisConfig = redisConfig;
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		//最多连接数
		jedisPoolConfig.setMaxTotal(10);
		//最多空闲连接
		jedisPoolConfig.setMaxIdle(5);
		//最少空闲连接
		jedisPoolConfig.setMinIdle(1);
		//最多等待时间
		jedisPoolConfig.setMaxWaitMillis(6000);

		jedisPool = new JedisPool(jedisPoolConfig, this.redisConfig.getHost(),
				this.redisConfig.getPort(), 6000, this.redisConfig.getPassword());
	}

	public Jedis getJedis() {
		return this.jedisPool.getResource();
	}
}
