package com.kevin.spring.bean.configure;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreConfigTest extends UnitTestBase {

    /*@Test
    public void stringStore() {
        Store stringStore = super.getBean("myStore");
        System.out.println("StringStore Class Hashcode = " + stringStore.getClass().hashCode());
        System.out.println("stringStore = " + stringStore + " : " + stringStore.hashCode());

        Store stringStore2 = super.getBean("myStore");
        System.out.println("StringStore Class Hashcode = " + stringStore.getClass().hashCode());
        System.out.println("stringStore2 = " + stringStore2 + " : " + stringStore2.hashCode());
    }*/

    @Test
    public void stringNIntegerStore() {
        StoreConfig storeConfig = super.getBean("storeConfig");
        storeConfig.say();
    }
}