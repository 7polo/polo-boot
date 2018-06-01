package com.polo.core.entity;

import com.polo.core.base.BaseEntity;
import lombok.Data;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * 文件实体类
 * 文件的绝对路径 = 系统文件目录 + filePath + fileName
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 18:19
 */
@Data
public class PoloFile extends BaseEntity{

    /**
     * 文件的相对路径
     */
    private String filePath;

    /**
     * 文件名
     */
    private String fileName;


    /**
     * 真实文件名
     */
    private String realName;

    /**
     * 后缀名
     */
    private String suffix;

    /**
     * md5值
     */
    private String md5;

    /**
     * 文件大小
     */
    private long size;

    private transient File file;

}
