package com.guo.technologyforum.service;

import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.Keep;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.ThemeClassExample;
import com.guo.technologyforum.dao.entity.vo.ThemeListVO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomThemeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.ThemeClassMapper;
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

    public List<ThemeListVO> getThemeListByNodeId(String nodeRouter,int offset,int pageSize){
        return customThemeMapper.getThemeList(null,nodeRouter,offset,pageSize);
    }

    public List<ThemeListVO> getThemeListByTabId(String tabRouter,int offset,int pageSize){
        return customThemeMapper.getThemeList(tabRouter,null,offset,pageSize);
    }

    public List<ThemeListVO> getTodayHotTheme(int limit){
        return customThemeMapper.getTodayHotTheme(limit);
    }

    public Optional<Theme> getThemeById(long id){
        return Optional.ofNullable(themeMapper.selectByPrimaryKey(id));
    }


}
