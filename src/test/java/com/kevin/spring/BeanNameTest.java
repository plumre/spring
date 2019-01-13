package com.kevin.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BeanNameTest extends UnitTestBase {

    public BeanNameTest() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSetBeanName() {
        System.out.println("testSetBeanName: " + super.getBean("nameAware") + " - " + super.getBean("nameAware").hashCode());
    }
}
