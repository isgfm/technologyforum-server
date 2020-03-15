package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomUserMapper {

    List<User> getUserListFromThemeReply(long themeId);
}
