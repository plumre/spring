package com.kevin.spring.bean.injection.service;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class InjectionServiceImplTest extends UnitTestBase {

    @Test
    public void save() {
        InjectionService injectionService = super.getBean("injectionServiceImpl");
        injectionService.save("we miss bayee so much.");
    }
}