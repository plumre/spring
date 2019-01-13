package com.kevin.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MoocApplicationContextTest extends UnitTestBase {

    public MoocApplicationContextTest() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSetApplicationContext() {
        System.out.println("testMoocApplicationContext: " + super.getBean("moocApplicationContext") + " - " + super.getBean("moocApplicationContext").hashCode());
    }
}
