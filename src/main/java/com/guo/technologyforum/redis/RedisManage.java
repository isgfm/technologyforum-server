package com.guo.technologyforum.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisManage {

    /**
     * 默认过期时间
     * 单位：秒
     */
    public final static long DEFAULT_EXPIRE = 60*30*1;

    public final static long NOT_EXPIRE = -1;

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    public Object get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public <T> T get(String key,Class<T> tClass){
        return tClass.cast(redisTemplate.opsForValue().get(key));
    }

    public void set(String key,Object value){
        redisTemplate.opsForValue().set(key,value,DEFAULT_EXPIRE);
    }

    public void set(String key,Object value,long expire){
        if(expire==NOT_EXPIRE){
            redisTemplate.opsForValue().set(key,value);
        }else{
            redisTemplate.opsForValue().set(key,value,expire, TimeUnit.SECONDS);
        }

    }

    public long decrement(String key){
        return redisTemplate.opsForValue().decrement(key);
    }

    public long increment(String key){
        return redisTemplate.opsForValue().increment(key);
    }

    public boolean delete(String key){
        return redisTemplate.delete(key);
    }

    public boolean exist(String key){
        return redisTemplate.hasKey(key);
    }


}
