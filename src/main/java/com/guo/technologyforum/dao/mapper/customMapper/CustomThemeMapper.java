package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.vo.ThemeClassVO;
import com.guo.technologyforum.dao.entity.vo.ThemeListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomThemeMapper {

    List<ThemeListVO> getThemeList(Integer tabId,Integer nodeId,int offset,int pageSize);

    List<ThemeListVO> getThemeListByNodeId(int nodeId,int offset,int pageSize);

    List<ThemeListVO> getTodayHotTheme(int limit);

    List<ThemeClass> getHotClassNode(int limit);
}
