package com.kevin.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class NameAware implements BeanNameAware, ApplicationContextAware {

    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
        System.out.println("setBeanName: " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext: " + applicationContext.getBean(beanName) + " - " + applicationContext.getBean(beanName).hashCode());
    }
}
