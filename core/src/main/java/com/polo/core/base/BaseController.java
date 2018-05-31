package com.polo.core.base;

import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 22:19
 */
public class BaseController {

    public Object handlerSuccess(String msg) {
        return handlerSuccess(msg, "");
    }

    public Object handlerSuccess(String msg, Object result) {
        return buildResponse(SystemField.SUCCESS_CODE, msg, result);
    }

    public Object handlerFail(String msg) {
        return buildResponse(SystemField.FAILE_CODE, msg, "");
    }

    public Object handlerExcep(String msg) {
        return buildResponse(SystemField.EXCEP_CODE, msg, "");
    }

    public Object handlerExcep(Exception ex) {
        Map map = buildResponse(SystemField.EXCEP_CODE, ex.getMessage(), ex.getCause());
        map.put("exception", ex.getClass().getSimpleName());
        return map;
    }

    private Map buildResponse(int code, String msg, Object result) {
        HashMap<String, Object> map = new HashMap<>(4);
        map.put("code", code);
        map.put("state", code == SystemField.SUCCESS_CODE ? "success" : "fail");
        map.put("msg", msg);
        map.put("result", result);
        return map;
    }

    /**
     * 文件输出流方法
     */
    MessageFormat msf = new MessageFormat("attachment;filename={0}.xls");

    public void writeExcel(HttpServletResponse resp, InputStream in,  String fileName) throws Exception {

        writeStream(resp, in, fileName, "application/vnd.ms-excel");
    }

    public void writeStream(HttpServletResponse resp, InputStream in, String fileName, String contentType) throws Exception{
        resp.setContentType(contentType);
        resp.setHeader("Content-disposition", msf.format(fileName.getBytes("utf-8")));
        IOUtils.copy(in, resp.getOutputStream());
        in.close();
        resp.getOutputStream().close();
    }
}
