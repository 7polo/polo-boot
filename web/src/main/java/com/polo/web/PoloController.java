package com.polo.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * @Description:
 * @author: bqy
 * @date: 2018-05-27 15:16
 */
@Slf4j
@RestController
public class PoloController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
