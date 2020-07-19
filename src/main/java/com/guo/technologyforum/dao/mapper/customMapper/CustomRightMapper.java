package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.bo.RightBO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomRightMapper {

    List<RightBO> selectAllUserRight();

}
