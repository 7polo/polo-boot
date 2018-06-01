package com.polo.core.base;

import lombok.Data;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 22:14
 */
@Data
public abstract class BaseEntity {

    protected String id;

    protected Date createDate;

    protected Date modifyDate;

    protected Boolean vaild;
}
