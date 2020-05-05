package com.guo.technologyforum.service;

import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.ThemeExample;
import com.guo.technologyforum.dao.entity.vo.ThemePageVO;
import com.guo.technologyforum.dao.entity.vo.ThemeVO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomThemeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.ThemeMapper;
import com.guo.technologyforum.util.CommonUtil;
import org.apache.commons.collections.CollectionUtils;
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


    public long addTheme(Theme theme){
        themeMapper.insert(theme);
        return theme.getnId();
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

    public Long countThemeByUserId(long userId){
        ThemeExample themeExample = new ThemeExample();
        ThemeExample.Criteria criteria = themeExample.createCriteria();
        criteria.andNUserIdEqualTo(userId);
        return themeMapper.countByExample(themeExample);
    }

    public List<ThemeVO> getThemeListByUserId(long userId, int page, int pageSize){
        return customThemeMapper.getThemeListByUserId(userId,(page-1)*pageSize,pageSize);
    }

    public List<ThemeVO> getThemeListByUserAttention(long userId, int page, int pageSize){
        return customThemeMapper.getThemeListByUserAttention(userId,(page-1)*pageSize,pageSize);
    }

    public List<ThemeVO> getThemeListByUserKeep(long userId, int page, int pageSize){
        return customThemeMapper.getThemeListByUserKeep(userId,(page-1)*pageSize,pageSize);
    }

    public long countThemeByUserAttention(long userId){
        return customThemeMapper.countThemeByUserAttention(userId);
    }

    public int updateThemeStatus(long themeId,int status){
        Theme theme = new Theme();
        theme.setnId(themeId);
        theme.setnThemeStatus(status);
        return themeMapper.updateByPrimaryKeySelective(theme);
    }

    public ThemePageVO getThemeListBySearch(String searchContent,int page, int pageSize){
        String searchWordsRegex = CommonUtil.regexSearchWords(searchContent);
        List<Object> result = customThemeMapper.getThemeListBySearch(searchWordsRegex,(page-1)*pageSize,pageSize);
        ThemePageVO themePageVO;
        if(CollectionUtils.isNotEmpty(result))
            themePageVO = new ThemePageVO((List<ThemeVO>) result.get(0),((List<Long>)result.get(1)).get(0));
        else
            themePageVO = new ThemePageVO(ThemeConstant.RMPTY_THEME_LIST,0L);
        return themePageVO;
    }

}
