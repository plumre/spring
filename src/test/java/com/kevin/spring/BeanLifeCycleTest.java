package com.kevin.spring;

import com.kevin.spring.lifecycle.BeanLifeCycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BeanLifeCycleTest extends UnitTestBase {

    public BeanLifeCycleTest() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testStart() {
        BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");
//        System.out.println("------TO START------");
//        beanLifeCycle.start();
//        beanLifeCycle.stop();
//        System.out.println("-------STOPPED------");


        /*BeanLifeCycle beanLifeCycle1 = super.getBean("beanLifeCycle");
        beanLifeCycle1.stop();*/
    }


}
