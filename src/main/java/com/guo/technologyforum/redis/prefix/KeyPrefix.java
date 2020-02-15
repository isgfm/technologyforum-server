package com.guo.technologyforum.redis.prefix;

public interface KeyPrefix {
    long getExpire();
    String getPreFix();
}
