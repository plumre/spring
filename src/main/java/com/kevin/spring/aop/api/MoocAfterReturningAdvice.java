package com.kevin.spring.aop.api;

/*
 * Created by renhongjiang on 2019/1/15.
 */

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 11:33
 */
public class MoocAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("MoocAfterReturningAdvice.afterReturning");
        System.out.println("returnValue = [" + returnValue + "], method = [" + method + "], args = [" + args + "], target = [" + target + "]");
    }
}