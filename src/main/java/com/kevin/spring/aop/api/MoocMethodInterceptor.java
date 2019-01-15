package com.kevin.spring.aop.api;

/*
 * Created by renhongjiang on 2019/1/15.
 */

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 11:37
 */
public class MoocMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MoocMethodInterceptor.invoke");
        System.out.println("invocation = [" + invocation + "]");
        Object proceed = invocation.proceed();
        System.out.println("proceed = " + proceed);
        return proceed;
    }
}