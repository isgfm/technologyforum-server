package com.guo.technologyforum.service;

import com.guo.technologyforum.constant.ThemeConstant;
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

@Service
public class ThemeService {

    @Autowired
    ThemeClassMapper themeClassMapper;

    @Autowired
    CustomThemeMapper customThemeMapper;

    @Autowired
    ThemeMapper themeMapper;

    @Autowired
    UserService userService;

    public List<ThemeClass> getHomeTabs(){
        ThemeClassExample themeClassExample = new ThemeClassExample();
        ThemeClassExample.Criteria criteria = themeClassExample.createCriteria();
        criteria.andCTypeEqualTo(ThemeConstant.THEME_CLASS_TABS);
        return themeClassMapper.selectByExample(themeClassExample);
    }

    public int addTheme(Theme theme){
        return themeMapper.insert(theme);
    }

    public List<ThemeClass> getThemeClass(int depth){
        ThemeClassExample themeClassExample = new ThemeClassExample();
        ThemeClassExample.Criteria criteria = themeClassExample.createCriteria();
        criteria.andCTypeEqualTo(ThemeConstant.THEME_CLASS_NODE);
        criteria.andNDepthEqualTo(String.valueOf(depth));
        return themeClassMapper.selectByExample(themeClassExample);
    }

    public List<ThemeListVO> getThemeListByNodeId(int nodeId,int offset,int pageSize){
        return customThemeMapper.getThemeList(null,nodeId,offset,pageSize);
    }

    public List<ThemeListVO> getThemeListByTabId(int tabId,int offset,int pageSize){
        return customThemeMapper.getThemeList(tabId,null,offset,pageSize);
    }

    public List<ThemeListVO> getTodayHotTheme(int limit){
        return customThemeMapper.getTodayHotTheme(limit);
    }

    public List<ThemeClass> getHotClassNode(int limit){
        return customThemeMapper.getHotClassNode(limit);
    }
}
