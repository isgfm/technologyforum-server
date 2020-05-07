package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-05-07 22:43
 **/
@Data
@AllArgsConstructor
public class UserPageVO {
    private List<User> userList;
    private long userCount;
}
