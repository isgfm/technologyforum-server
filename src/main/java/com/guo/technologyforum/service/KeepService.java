package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.Keep;
import com.guo.technologyforum.dao.mapper.generateMapper.KeepMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

@Service
public class KeepService {

    @Autowired
    KeepMapper keepMapper;

    public int addKeep(Keep keep) throws DuplicateKeyException {
        return keepMapper.insert(keep);
    }
}
