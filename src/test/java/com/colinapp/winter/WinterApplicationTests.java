package com.colinapp.winter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.Date;

@SpringBootTest
class WinterApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    //缓存测试
    @Test
    void contextLoads() {
        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();
        ops.set("name","colin");
        ops.set("date",new Date().toString());
    }


}
