package com.kevin.spring.bean.jsr;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class JsrServiceTest extends UnitTestBase {

    @Test
    public void save() {
        JsrService jsrService = super.getBean("jsrService");
        jsrService.save();
    }
}