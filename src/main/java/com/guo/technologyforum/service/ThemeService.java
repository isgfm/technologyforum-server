package com.guo.technologyforum.service;

import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.ThemeClassExample;
import com.guo.technologyforum.dao.entity.vo.ThemeListVO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomThemeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.ThemeClassMapper;
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
    UserService userService;

    public List<ThemeClass> getHomeTabs(){
        ThemeClassExample themeClassExample = new ThemeClassExample();
        ThemeClassExample.Criteria criteria = themeClassExample.createCriteria();
        criteria.andCTypeEqualTo(ThemeConstant.THEME_CLASS_TABS);
        return themeClassMapper.selectByExample(themeClassExample);
    }

    public List<ThemeClass> getThemeClass(int depth){
        ThemeClassExample themeClassExample = new ThemeClassExample();
        ThemeClassExample.Criteria criteria = themeClassExample.createCriteria();
        criteria.andCTypeEqualTo(ThemeConstant.THEME_CLASS_NODE);
        criteria.andNDepthEqualTo(String.valueOf(depth));
        return themeClassMapper.selectByExample(themeClassExample);
    }

    public List<ThemeListVO> getThemeList(){
        return customThemeMapper.getThemeListByNodeId(3);
    }

}
