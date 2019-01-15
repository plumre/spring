package com.kevin.spring.aop.aspectj.biz;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Created by renhongjiang on 2019/1/15.
 */
public class MoocBizTest extends UnitTestBase {

    public MoocBizTest() {
        super("classpath:spring-aop-aspectj.xml");
    }

    @Test
    public void save() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("watermelon is one kind of fruit.");
    }
}