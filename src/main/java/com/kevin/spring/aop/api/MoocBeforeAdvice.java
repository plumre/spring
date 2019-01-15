package com.kevin.spring.aop.api;

/*
 * Created by renhongjiang on 2019/1/15.
 */

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 11:26
 */
public class MoocBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("MoocBeforeAdvice.before is running...");
        System.out.println("method = [" + method + "], args = [" + args + "], target = [" + target + "]");
    }
}