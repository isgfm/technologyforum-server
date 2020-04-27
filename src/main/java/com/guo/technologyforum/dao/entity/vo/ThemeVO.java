package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.User;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class ThemeVO {
    private Long id;
    private User themeOwner;
    private Theme theme;
    private ThemeReply lastThemeReply = new ThemeReply();
    private Integer countReply;
    private String themeClassName;
    private Long keepCount;
}
