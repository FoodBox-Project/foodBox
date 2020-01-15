package com.github.foodbox_project.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.TimeZone;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan({"com.github.foodbox_project.dal"})
@EntityScan("com.github.foodbox_project.model")
public class Application {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(Application.class, args);
    }
}
