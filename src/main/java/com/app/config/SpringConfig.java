package com.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.app.action.HelloWorldAction;

@Configuration
@ComponentScan(basePackages = {"com.app"}) // Spring akan mencari @Service di sini
public class SpringConfig {

    @Bean(name = "/hello") 
    public HelloWorldAction helloWorldActionBean() {
        return new HelloWorldAction();
    }
}