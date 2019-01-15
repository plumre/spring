package com.kevin.spring.aop.api;

/*
 * Created by renhongjiang on 2019/1/15.
 */

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 11:21
 */
public class BizLogicImpl implements BizLogic {

    @Override
    public String save() {
        System.out.println("BizLogicImpl.save is running.");
//        throw new RuntimeException("my ex is not serious.");
        return "BizLogicImpl.save is returning.";
    }
}