package com.kevin.spring.aop.aspectj;

/*
 * Created by renhongjiang on 2019/1/15.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 16:19
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MoocMethod {

    String value();

}