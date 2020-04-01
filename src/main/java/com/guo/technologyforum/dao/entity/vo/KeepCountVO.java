package com.guo.technologyforum.dao.entity.vo;

import lombok.Data;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-04-01 08:32
 **/
@Data
public class KeepCountVO {
    private long keepNodeCount;
    private long keepThemeCount;
    private long attentionCount;
    private long notifyCount;
}
