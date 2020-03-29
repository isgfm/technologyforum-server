package com.guo.technologyforum.dao.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-17 23:00
 **/
@Data
@AllArgsConstructor
public class ThemePageVO {
    private List<ThemeVO> themeVOList;
    private Long themeCount;
}
