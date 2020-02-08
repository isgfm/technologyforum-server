package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.vo.ForumStateVO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomForumMapper {
    ForumStateVO getForumState();

    int getRegisterNumber();

    int getThemeNumber();

    int getThemeReplyNumber();
}
