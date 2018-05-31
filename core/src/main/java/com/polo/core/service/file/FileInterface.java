package com.polo.core.service.file;

import com.polo.core.entity.PoloFile;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 文件接口
 * @author: bqy
 * @date: 2018-05-27 18:17
 */
public interface FileInterface {

    /**
     * 添加文件
     * @param file
     * @return 返回 PoloFile
     */
    PoloFile addFile(PoloFile file);

    /**
     * 更新文件
     * @param file
     * @return
     */
    PoloFile updateFile(PoloFile file);

    /**
     * 删除文件
     * @param file
     * @return
     */
    PoloFile deleteFile(PoloFile file);
}
