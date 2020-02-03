package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.vo.ThemeClassVO;
import com.guo.technologyforum.dao.entity.vo.ThemeListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomThemeMapper {

    List<ThemeListVO> getThemeListByTabsId(int tabsId);

    List<ThemeListVO> getThemeListByNodeId(int nodeId);
}
