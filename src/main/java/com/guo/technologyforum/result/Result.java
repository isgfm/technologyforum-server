package com.guo.technologyforum.result;

import com.guo.technologyforum.constant.ResultCode;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Result implements Serializable {
    private static final long serialVersionUID = 6458519873284778530L;
    private Object data;
    private Integer code;
    private String message;

    public static Result success(Object data){
        Result r = new Result();
        r.setData(data);
        r.setResultCode(ResultCode.SUCCESS);
        return r;
    }

    public static Result success(){
        Result r = new Result();
        r.setResultCode(ResultCode.SUCCESS);
        return r;
    }

    public static Result error(){
        Result r = new Result();
        r.setResultCode(ResultCode.ERROR);
        return r;
    }

    public static Result error(Object data){
        Result r = new Result();
        r.setData(data);
        r.setResultCode(ResultCode.ERROR);
        return r;
    }

    public static Result customize(ResultCode resultCode,Object data){
        Result r = new Result();
        r.setData(data);
        r.setResultCode(resultCode);
        return r;
    }

    public Map<String,Object> customize(){
        if(!(this.data instanceof Map)){
            Map<String,Object> map = new HashMap<>();
            this.data = map;
        }
        return (Map<String, Object>) this.data;
    }

    public void setResultCode(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
