package com.kevin.spring.aop.api;

/*
 * Created by renhongjiang on 2019/1/15.
 */

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 11:30
 */
public class MoocThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e) throws Throwable {
        System.out.println("MoocThrowsAdvice.afterThrowing 01");
        System.out.println("e = [" + e + "]");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception e) throws Throwable {
        System.out.println("MoocThrowsAdvice.afterThrowing 02");
        System.out.println("method = [" + method + "], args = [" + args + "], target = [" + target + "], e = [" + e + "]");
    }

}