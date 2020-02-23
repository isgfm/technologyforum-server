package com.guo.technologyforum.redis.prefix;

public final class CaptchaKey extends BasePrefix{
    public CaptchaKey(long expire, String prefix) {
        super(expire, prefix);
    }

    public CaptchaKey(String prefix) {
        super(prefix);
    }

    public static CaptchaKey captcha = new CaptchaKey(60*5,"captcha");
}
