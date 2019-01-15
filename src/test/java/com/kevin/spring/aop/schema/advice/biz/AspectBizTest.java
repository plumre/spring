package com.kevin.spring.aop.schema.advice.biz;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Created by renhongjiang on 2019/1/14.
 */
public class AspectBizTest extends UnitTestBase {

    public AspectBizTest() {
        super("classpath:spring-aop-schema-advice.xml");
    }

    @Test
    public void biz() {
        AspectBiz aspectBiz = super.getBean("aspectBiz");
        aspectBiz.biz();
    }

    @Test
    public void init() {
        AspectBiz aspectBiz = super.getBean("aspectBiz");
        aspectBiz.init("rollBanana", 6);
    }
}