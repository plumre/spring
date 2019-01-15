package com.kevin.spring.aop.schema.advice;

/*
 * Created by renhongjiang on 2019/1/15.
 */

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 10:56
 */
public class FitImpl implements Fit {

    @Override
    public void filter() {
        System.out.println("FitImpl.filter is running.");
    }
}