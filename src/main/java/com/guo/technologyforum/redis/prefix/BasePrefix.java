package com.guo.technologyforum.redis.prefix;

public abstract class BasePrefix implements KeyPrefix {

    private long expire;
    private String prefix;

    public BasePrefix(long expire, String prefix){
        this.expire = expire;
        this.prefix = getClass().getSimpleName()+": "+prefix;
    }

    public BasePrefix(String prefix){
        this(-1,prefix);
    }

    @Override
    public long getExpire() {
        return expire;
    }

    @Override
    public String getPreFix() {
        return prefix;
    }
}
