package com.polo.core.base;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * 自动填充
 * @Description:
 * @author: bqy
 * @date: 2018-06-01 21:56
 */
public class MyMetaObjectHandler extends MetaObjectHandler {

    //新增填充
    @Override
    public void insertFill(MetaObject metaObject) {

        Object createDate = metaObject.getValue("createDate");
        Object modifyDate = metaObject.getValue("modifyDate");

        if (null == createDate) {
            metaObject.setValue("createDate", new Date());
        }
        if (null == modifyDate) {
            metaObject.setValue("modifyDate", new Date());
        }
    }

    //更新填充
    @Override
    public void updateFill(MetaObject metaObject) {
        Object modifyDate = metaObject.getValue("modifyDate");
        if (null == modifyDate) {
            metaObject.setValue("modifyDate", new Date());
        }
    }
}

