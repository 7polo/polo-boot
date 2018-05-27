package com.polo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: polobao
 * Date: 2018-05-27
 * Time: 15:21
 */
@EnableAutoConfiguration
@Slf4j
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        log.info("start.....");
        SpringApplication.run(Application.class, args);
        log.info("finish.....");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
