package com.kevin.spring.bean;

public class BeanScope {

    public void say() {
        System.out.println("this is bean say: " + this.hashCode());
    }
}
