package com.polo.core.service.file.aop;

import com.polo.core.entity.PoloFile;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 18:31
 */
@Aspect
@Component
@Slf4j
public class FileInterfaceAop {

    private static final Logger logger = LoggerFactory.getLogger(FileInterfaceAop.class);

    @Around(value = "execution(* com.polo.core.service.file.FileInterface.addFile(..))")
    public Object aroundAddFile(ProceedingJoinPoint joinPoint) throws Throwable{
        PoloFile poloFile = getPoloFile(joinPoint);
        logger.debug("添加文件", poloFile.toString());
        log.info("添加文件", poloFile.toString());
        log.error("添加文件", poloFile.toString());
        //todo something
        joinPoint.proceed();
        return poloFile;
    }

    @Around(value = "execution(* com.polo.core.service.file.FileInterface.updateFile(..))")
    public PoloFile aroundUpdateFile(ProceedingJoinPoint joinPoint) throws Throwable{
        PoloFile poloFile = getPoloFile(joinPoint);
        log.debug("删除文件", poloFile.toString());
        //todo something
        joinPoint.proceed();
        return poloFile;
    }

    @Around(value = "execution(* com.polo.core.service.file.FileInterface.deleteFile(..))")
    public PoloFile aroundDeleteFile(ProceedingJoinPoint joinPoint) throws Throwable{
        PoloFile poloFile = getPoloFile(joinPoint);
        log.debug("删除文件", poloFile.toString());
        //todo something
        joinPoint.proceed();
        return poloFile;
    }

    /**
     * 从ProceedingJoinPoint中获取PoloFile
     * @param joinPoint
     * @return
     */
    private PoloFile getPoloFile(ProceedingJoinPoint joinPoint) {
        if (joinPoint != null && joinPoint.getArgs() != null && joinPoint.getArgs().length == 1) {
            return (PoloFile) joinPoint.getArgs()[0];
        }
        throw new NullPointerException();
    }
}
