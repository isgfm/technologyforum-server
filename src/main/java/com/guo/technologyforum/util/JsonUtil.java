package com.guo.technologyforum.util;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

public class JsonUtil {
    public static String ListToJsonString(Object list){
        return JSONArray.parseArray(JSON.toJSONString(list)).toString();
    }

    public static String ObjectToJsonString(Object data){
        return JSON.toJSONString(data);
    }

    /**
     * 参数例如为"[1,2,3,4,5]"
     * */
    public static Integer[] StringToIntegerArray(String data){
        List<Integer> result = JSON.parseArray(data,Integer.class);
        return result.toArray(new Integer[result.size()]);
    }
}
