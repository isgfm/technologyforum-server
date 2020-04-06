package com.guo.technologyforum.service;

import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.ThemeClassExample;
import com.guo.technologyforum.dao.entity.vo.ThemeClassNodeVO;
import com.guo.technologyforum.dao.entity.vo.ThemeVO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomThemeClassMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.ThemeClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeClassService {

    @Autowired
    ThemeClassMapper themeClassMapper;

    @Autowired
    CustomThemeClassMapper customThemeClassMapper;

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

    public List<ThemeClass> getHotClassNode(int limit){
        return customThemeClassMapper.getHotClassNode(limit);
    }

    public List<ThemeClass> getNodesByTabRouter(String tabRouter){
        return customThemeClassMapper.getNodesByTabRouter(tabRouter);
    }

    public List<ThemeClassNodeVO> getNodesByUserKeep(long userId){
        return customThemeClassMapper.getNodesByUserKeep(userId);
    }

    public ThemeClass getThemeClassByThemeClassId(Integer id){
        return  themeClassMapper.selectByPrimaryKey(id);
    }

    public void setThemeClassName(List<ThemeVO> themeClassVOList){
        themeClassVOList.forEach(themeVO ->
                themeVO.setThemeClassName(getThemeClassByThemeClassId(themeVO.getTheme().getnThemeClass()).getcName()));
    }

    public Optional<ThemeClassNodeVO> getThemeClassByRouter(String nodeRouter){
//        ThemeClassExample themeClassExample = new ThemeClassExample();
//        ThemeClassExample.Criteria criteria = themeClassExample.createCriteria();
//        criteria.andCRouterEqualTo(router);
//        List<ThemeClass> themeClasses = themeClassMapper.selectByExample(themeClassExample);
//        if(themeClasses.size()==0)
//            return Optional.ofNullable(null);
//        else
//            return Optional.of(themeClasses.get(0));
        return Optional.ofNullable(customThemeClassMapper.getNodeVOByNodeRouter(nodeRouter));
    }
}
