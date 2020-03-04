package com.guo.technologyforum.redis.prefix;


import com.guo.technologyforum.redis.RedisManage;

public final class ThemeClickKey extends BasePrefix{

    public ThemeClickKey(long expire, String prefix) {
        super(expire, prefix);
    }

    public static ThemeClickKey themeClickKey = new ThemeClickKey(RedisManage.NOT_EXPIRE,"themeclick");
}
