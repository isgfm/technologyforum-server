package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.bo.NotifyBO;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-05-04 20:01
 **/
@Data
public class NotifyVO {
    private List<NotifyBO> notifyBOList;
    private long notifyCount;
}
