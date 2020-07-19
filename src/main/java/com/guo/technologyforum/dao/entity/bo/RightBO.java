package com.guo.technologyforum.dao.entity.bo;

import com.guo.technologyforum.dao.entity.Right;

import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-07-13 22:45
 **/
public class RightBO {
    private Long userId;

    private List<Right> rights;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Right> getRights() {
        return rights;
    }

    public void setRights(List<Right> rights) {
        this.rights = rights;
    }
}
