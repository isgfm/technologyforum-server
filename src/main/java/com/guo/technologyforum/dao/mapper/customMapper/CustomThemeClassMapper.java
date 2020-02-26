package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.ThemeClass;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomThemeClassMapper {

    List<ThemeClass> getHotClassNode(int limit);

    List<ThemeClass> getNodesByTabRouter(String tabRouter);
}
