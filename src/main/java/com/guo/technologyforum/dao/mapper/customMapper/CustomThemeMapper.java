package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.vo.ThemeVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomThemeMapper {

    List<ThemeVO> getThemeList(String tabRouter, String nodeRouter, int offset, int pageSize);

    List<ThemeVO> getThemeListByNodeId(int nodeId, int offset, int pageSize);

    List<ThemeVO> getTodayHotTheme(int limit);

    ThemeVO getThemeVOByThemeId(long themeId);

    Long countThemeByNodeRouter(String nodeRouter);

    List<ThemeVO> getThemeListByUserId(long userId, int offset, int pageSize);

    List<ThemeVO> getThemeListByUserAttention(long userId, int offset, int pageSize);

    List<ThemeVO> getThemeListByUserKeep(long userId, int offset, int pageSize);

    long countThemeByUserAttention(long userId);

    List<Object> getThemeListBySearch(String searchWordsRegex, int offset, int pageSize);
}
