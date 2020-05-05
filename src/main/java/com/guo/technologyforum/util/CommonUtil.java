package com.guo.technologyforum.util;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import org.apache.commons.lang3.StringUtils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CommonUtil {

    public static Date getNowDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zoneId).toInstant();
        return Date.from(instant);
    }

    /**
     * TODO 将搜索内容分词，然后拼成正则表达式方便数据库查询
     * @param searchContent 搜索内容
     * @return java.lang.String
     */
    public static String regexSearchWords(String searchContent){
        String searchWordsRegex =
                HanLP.segment(searchContent)
                        .stream()
                        .map(term -> term.word)
                        .filter(StringUtils::isNotBlank)
                        .collect(Collectors.joining("|"));
//        searchWordsRegex = "("+searchWordsRegex+")";
        return searchWordsRegex;
    }
}
