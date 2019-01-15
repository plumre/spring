package com.kevin.spring.aop.aspectj;

/*
 * Created by renhongjiang on 2019/1/15.
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 15:33
 */
@Component
@Aspect
public class MoocAspect {

    @Pointcut("execution(* com.kevin.spring.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut() {
    }

    @Pointcut("within(com.kevin.spring.aop.aspectj.biz.*)")
    public void bizPointcut() {
    }

    //@Before("execution(* com.kevin.spring.aop.aspectj.biz.*Biz.*(..))")
    @Before("pointcut()")
    public void before() {
        System.out.println("MoocAspect.before");
    }

    @Before("pointcut() && args(arg)")
    public void beforeWithParam(String arg) {
        System.out.println("MoocAspect.beforeWithParam : " + arg);
    }

    @Before("pointcut() && @annotation(moocMethod)")
    public void beforeWithAnnotation(MoocMethod moocMethod) {
        System.out.println("MoocAspect.beforeWithAnnotation : " + moocMethod.value());
    }

    @AfterReturning(value = "bizPointcut()", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("MoocAspect.afterReturning: " + returnValue);
    }

    @AfterThrowing(value = "pointcut()", throwing = "e")
    public void afterThrowing(RuntimeException e) {
        System.out.println("MoocAspect.afterThrowing: " + e);
    }

    @After("pointcut()")
    public void after() {
        System.out.println("MoocAspect.after");
    }

    @Around("bizPointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("MoocAspect.around start..");
        // start stopwatch
        Object proceed = pjp.proceed();
        System.out.println("MoocAspect.around is going to stop, now return goes.");
        System.out.println("MoocAspect.around's returnValue is " + proceed);
        // stop stopwatch
        return proceed;
    }
}