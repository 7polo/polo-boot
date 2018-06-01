package com.polo.core.base;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.FieldFill;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 22:14
 */
@Data
public abstract class BaseEntity<T> extends Model {

    protected String id;

    @TableField(fill = FieldFill.INSERT, update="now()")
    protected Date createDate;

    @TableField(fill = FieldFill.INSERT_UPDATE, update="now()")
    protected Date modifyDate;

    @TableLogic
    protected Boolean vaild;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
