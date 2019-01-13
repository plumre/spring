package com.kevin.spring.bean.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("classpath:spring-beanscope.xml")
public class AppConfig {

    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public MyDriverManager myDriverManager() {
        return new MyDriverManager(url,username,password);
    }

    /*@Bean(name = "myStore", initMethod = "init", destroyMethod = "destroy")
    public Store stringStore() {
        return new StringStore();
    }*/

}
