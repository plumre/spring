package com.kevin.spring.bean;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

public class BeanAnnotationTest extends UnitTestBase {

    @Test
    public void say() {
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.say("this is a test...");
    }

    @Test
    public void showScope() {
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.showScope();

        BeanAnnotation bean1 = super.getBean("beanAnnotation");
        bean1.showScope();
    }
}