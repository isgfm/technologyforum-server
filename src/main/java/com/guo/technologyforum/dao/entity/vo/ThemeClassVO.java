package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.ThemeClass;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThemeClassVO {
    private List<ThemeClass> tabs;
    private Map<Integer,List<ThemeClass>> parentIdMap;

    public static ThemeClassVO init(List<ThemeClass> tabs, List<ThemeClass> node){
        ThemeClassVO themeClassVO = new ThemeClassVO(tabs);
        themeClassVO.setParentIdMap(node.stream().collect(Collectors.groupingBy(ThemeClass::getnParentid)));
        return themeClassVO;
    }

    public ThemeClassVO(List<ThemeClass> tabs) {
        this.tabs = tabs;
    }

    public List<ThemeClass> getTabs() {
        return tabs;
    }

    public void setTabs(List<ThemeClass> tabs) {
        this.tabs = tabs;
    }

    public Map<Integer, List<ThemeClass>> getParentIdMap() {
        return parentIdMap;
    }

    public void setParentIdMap(Map<Integer, List<ThemeClass>> parentIdMap) {
        this.parentIdMap = parentIdMap;
    }
}
