package com.guo.technologyforum.annotation;

import java.lang.annotation.*;

/**
 * TODO 判断是否登录切面注解
 * {@link com.guo.technologyforum.aspect.RequestAspect}
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequireLogin {
    public boolean needAdmin() default false;

    public boolean needUserStateNormal() default false;
}
