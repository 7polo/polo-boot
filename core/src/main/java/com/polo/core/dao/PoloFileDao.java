package com.polo.core.dao;

import com.polo.core.entity.PoloFile;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 20:58
 */
@Repository
public interface PoloFileDao {

    String insert(PoloFile poloFile);

    int count();
}
