package com.guo.technologyforum.constant;

import com.guo.technologyforum.dao.entity.vo.ThemeVO;

import java.util.ArrayList;
import java.util.List;

public final class ThemeConstant {

    /** tabs*/
    public static String THEME_CLASS_TABS = "tabs";

    /** node*/
    public static String THEME_CLASS_NODE = "node";

    /** tabs深度*/
    public static int THEME_CLASS_TABS_DEPTH = 1;

    /** node默认深度*/
    public static int THEME_CLASS_NODE_DEFAULT_DEPTH = 2;

    /** 主题点击初始值*/
    public static int THEME_CLICK_INITIAL = 1;

    /** 主题正常*/
    public static int THEME_STATUS_NORMAL = 1;

    /** 主题隐藏*/
    public static int THEME_STATUS_HIDE = 2;

    public static final List<ThemeVO> RMPTY_THEME_LIST = new ArrayList<>();
}
