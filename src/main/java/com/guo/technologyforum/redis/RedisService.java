package com.guo.technologyforum.redis;

import com.guo.technologyforum.redis.prefix.BasePrefix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    @Autowired
    RedisManage redisManage;

    public void set(BasePrefix basePreFix, String key, Object value){
        set(basePreFix,key,value,basePreFix.getExpire());
    }

    public void set(BasePrefix basePreFix, String key, Object value,long expire){
        String realKey = basePreFix.getPreFix()+key;
        redisManage.set(realKey,value,expire);
    }

    public void get(BasePrefix basePreFix, String key, Object value){
        String realKey = basePreFix.getPreFix()+key;
        redisManage.set(realKey,value,basePreFix.getExpire());
    }

    public Object get(BasePrefix basePreFix, String key){
        String realKey = basePreFix.getPreFix()+key;
        return redisManage.get(realKey);
    }

    public <T> T get(BasePrefix basePreFix, String key, Class<T> tClass){
        String realKey = basePreFix.getPreFix()+key;
        return tClass.cast(redisManage.get(realKey));
    }

    public boolean delete(BasePrefix basePreFix, String key){
        String realKey = basePreFix.getPreFix()+key;
        return redisManage.delete(realKey);
    }

    public boolean exist(BasePrefix basePreFix, String key){
        String realKey = basePreFix.getPreFix()+key;
        return redisManage.exist(realKey);
    }

    public long decrement(BasePrefix basePreFix,String key){
        String realKey = basePreFix.getPreFix()+key;
        return redisManage.decrement(realKey);
    }

    public long increment(BasePrefix basePreFix,String key){
        String realKey = basePreFix.getPreFix()+key;
        return redisManage.increment(realKey);
    }

    public Boolean setIfAbsent(BasePrefix basePreFix, String key, Object value){
        String realKey = basePreFix.getPreFix()+key;
        return redisManage.setIfAbsent(realKey,value);
    }

    public RedisManage getRedisManage(){return redisManage;}
}
