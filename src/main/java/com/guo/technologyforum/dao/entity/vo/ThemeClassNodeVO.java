package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.ThemeClass;
import lombok.Data;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-17 20:02
 **/
@Data
public class ThemeClassNodeVO {
    private ThemeClass themeClass;
    private Integer themeCount;
}
