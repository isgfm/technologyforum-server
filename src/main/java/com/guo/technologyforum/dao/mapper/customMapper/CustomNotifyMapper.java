package com.guo.technologyforum.dao.mapper.customMapper;

import com.guo.technologyforum.dao.entity.bo.NotifyBO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomNotifyMapper {
    List<NotifyBO> getNotifyVOList(long userId,int pageSize,int offset);
}
