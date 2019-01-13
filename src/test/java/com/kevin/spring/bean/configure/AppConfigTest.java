package com.kevin.spring.bean.configure;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppConfigTest extends UnitTestBase {
    @Test
    public void myDriverManager() {
        MyDriverManager manager = super.getBean("myDriverManager");
        System.out.println("manager = " + manager.getClass().getName());
    }

    @Test
    public void stringStore() {
        Store store = super.getBean("myStore");
        System.out.println("store = " + store.getClass().getName());
    }
}