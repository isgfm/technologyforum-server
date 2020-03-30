package com.guo.technologyforum.advice;

import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.result.Result;
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
}
