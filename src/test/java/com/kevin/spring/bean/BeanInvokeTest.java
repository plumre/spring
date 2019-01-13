package com.kevin.spring.bean;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BeanInvokeTest extends UnitTestBase {

    @Test
    public void say() {

        List list = super.listBeans();
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        /*BeanInvoke beanInvoke = super.getBean("beanInvoke");
        beanInvoke.say();*/
    }
}