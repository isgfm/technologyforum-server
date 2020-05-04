package com.guo.technologyforum.dao.entity.bo;

import com.guo.technologyforum.dao.entity.Notify;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.User;
import lombok.Data;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-05-04 19:16
 **/
@Data
public class NotifyBO {
    private User sendUser;
    private Theme occurTheme;
    private Notify notify;
}
