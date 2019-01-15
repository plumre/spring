package com.kevin.spring.aop.api;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Created by renhongjiang on 2019/1/15.
 */
public class BizLogicImplTest extends UnitTestBase {

    public BizLogicImplTest() {
        super("classpath:spring-aop-api.xml");
    }

    @Test
    public void save() {
        BizLogic bizLogic = super.getBean("bizLogicImpl");
        bizLogic.save();
    }
}