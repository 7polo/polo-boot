package com.polo.core.base;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 22:17
 */
public interface BaseDao<T> {

    void insert(T t);

    void update(T t);

    void deleteById(Serializable id);
}
