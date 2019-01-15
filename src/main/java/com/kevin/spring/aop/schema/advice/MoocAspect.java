package com.kevin.spring.aop.schema.advice;

/*
 * Created by renhongjiang on 2019/1/14.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/14 20:17
 */
public class MoocAspect {

    public void before(org.aspectj.lang.JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect.before is running.");
    }

    public void afterReturning(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect.afterReturning is running.");
    }

    public void afterThrowing(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect.afterThrowing is running.");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect.after is running.");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("MoocAspect.around-01 is running.");
        Object object = pjp.proceed();
        System.out.println("MoocAspect.around-02 is running.");
        return object;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) throws Throwable {
        System.out.println("pjp = [" + pjp + "], bizName = [" + bizName + "], times = [" + times + "]");
        System.out.println("MoocAspect.aroundInit-01 is running.");
        Object object = pjp.proceed();
        System.out.println("MoocAspect.aroundInit-02 is running.");
        return object;
    }
}