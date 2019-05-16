package com.xc.wms.sys.cache;

import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CacheConfig {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Bean(name = "redisCacheManager")
    @Primary
    public RedisCacheManager redisCacheManager() {
        logger.info("--------------redis cache init---------------");
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager());
        redisCacheManager.setPrincipalIdFieldName("userUuid");
        logger.info("--------------redis cache ---------------" + redisCacheManager);
        return redisCacheManager;
    }




    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.password}")
    private String password;
    @Value("${spring.redis.database}")
    private int database;

    public RedisManager redisManager() {
        RedisManager redisManager = new RedisManager();
        redisManager.setHost(host);
        redisManager.setPassword(password);
        redisManager.setDatabase(database);
        return redisManager;
    }


}
