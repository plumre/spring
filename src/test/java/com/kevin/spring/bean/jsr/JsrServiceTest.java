package com.kevin.spring.bean.jsr;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

public class JsrServiceTest extends UnitTestBase {

    @Test
    public void save() {
        JsrService jsrService = super.getBean("jsrService");
        jsrService.save();
    }
}