package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.vo.ThemeVO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomThemeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.ThemeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {

    @Autowired
    CustomThemeMapper customThemeMapper;

    @Autowired
    ThemeMapper themeMapper;

    @Autowired
    UserService userService;


    public int addTheme(Theme theme){
        return themeMapper.insert(theme);
    }

    public List<ThemeVO> getThemeListByNodeId(String nodeRouter, int page, int pageSize){
        return customThemeMapper.getThemeList(null,nodeRouter,(page-1)*pageSize,pageSize);
    }

    public List<ThemeVO> getThemeListByTabId(String tabRouter, int page, int pageSize){
        return customThemeMapper.getThemeList(tabRouter,null,(page-1)*pageSize,pageSize);
    }

    public List<ThemeVO> getTodayHotTheme(int limit){
        return customThemeMapper.getTodayHotTheme(limit);
    }

    public Optional<Theme> getThemeByThemeId(long themeId){
        return Optional.ofNullable(themeMapper.selectByPrimaryKey(themeId));
    }

    public Optional<ThemeVO> getThemeVOByThemeId(long themeId){
        return Optional.ofNullable(customThemeMapper.getThemeVOByThemeId(themeId));
    }

    public Long countThemeByNodeRouter(String nodeRouter){
        return customThemeMapper.countThemeByNodeRouter(nodeRouter);
    }

    public List<ThemeVO> getThemeListByUserId(long userId, int page, int pageSize){
        return customThemeMapper.getThemeListByUserId(userId,(page-1)*pageSize,pageSize);
    }
}
