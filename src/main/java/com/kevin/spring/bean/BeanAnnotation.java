package com.kevin.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("Bayee")
//@Scope("singleton")
@Component
public class BeanAnnotation {
    public void say(String str) {
        System.out.println("BeanAnnotation: " + str);
    }

    public void showScope() {
        System.out.println("BeanAnnotation: " + this.hashCode());
    }
}
