package com.vgrigoriev.logsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Starter spring boot class.
 *
 * Created by vgrigore on 02.09.2016.
 */
@SpringBootApplication
public class ApplicationStarter extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationStarter.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}
