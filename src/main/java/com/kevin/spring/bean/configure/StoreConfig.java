package com.kevin.spring.bean.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@Configuration
@ImportResource("classpath:spring-beanscope.xml")
public class StoreConfig {


    /*@Bean(name = "myStore", initMethod = "init", destroyMethod = "destroy")
    @Scope(value = "prototype" *//*proxyMode = ScopedProxyMode.TARGET_CLASS*//*)
    public Store stringStore() {
        return new StringStore();
    }*/

    @Autowired
    private Store<String> stringStore;

    @Autowired
    private Store<Integer> integerStore;

    public void say() {
        System.out.println("StoreConfig.say: " + stringStore + " ** " + stringStore.hashCode());
        System.out.println("StoreConfig.say: " + integerStore + " ** " + integerStore.hashCode());
    }


    @Bean
    public Store<String> stringStore() {
        return new StringStore();
    }

    @Bean
    public Store<Integer> integerStore() {
        return new IntegerStore();
    }

}
