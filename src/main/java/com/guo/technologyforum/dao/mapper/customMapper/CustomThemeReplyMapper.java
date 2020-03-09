package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.bo.ThemeReplyBO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomThemeReplyMapper {
    List<ThemeReplyBO> getThemeReplyBOByThemeId(long themeId,int pageSize,int offset);
}
