package com.guo.technologyforum.advice;

import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.exception.ThemeNotFoundException;
import com.guo.technologyforum.exception.UserNotFoundException;
import com.guo.technologyforum.result.Result;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:全局异常处理
 * @author: guofeiming
 * @create: 2020-03-30 23:20
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateKeyException.class)
    @ResponseBody
    public Result duplicateKeyExceptionHandler(HttpServletRequest request, Exception e){
        Result result = new Result();
        result.setResultCode(ResultCode.DATA_IS_WRONG);
        return result;
    }

    @ExceptionHandler(ThemeNotFoundException.class)
    @ResponseBody
    public Result themeNotFoundExceptionHandler(HttpServletRequest request, Exception e){
        Result result = new Result();
        result.setResultCode(ResultCode.RESULE_DATA_NONE);
        return result;
    }

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    public Result userNotFoundExceptionHandler(HttpServletRequest request, Exception e){
        Result result = new Result();
        result.setResultCode(ResultCode.USER_NOT_EXIST);
        return result;
    }

    @ExceptionHandler(UnauthenticatedException.class)
    @ResponseBody
    public Result unauthenticatedException(HttpServletRequest request, Exception e){
        Result result = new Result();
        result.setResultCode(ResultCode.USER_NOT_LOGGED_IN);
        return result;
    }

    @ExceptionHandler(AuthorizationException.class)
    @ResponseBody
    public Result authorizationException(HttpServletRequest request, Exception e){
        Result result = new Result();
        result.setResultCode(ResultCode.PERMISSION_NO_ACCESS);
        return result;
    }

}
