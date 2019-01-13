package com.kevin.spring;

import com.kevin.spring.bean.BeanScope;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BeanScopeTest extends UnitTestBase {

    public BeanScopeTest() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay() {
       BeanScope beanScope = super.getBean("beanScope");
       beanScope.say();

       BeanScope beanScope2 = super.getBean("beanScope");
       beanScope2.say();
    }
}
