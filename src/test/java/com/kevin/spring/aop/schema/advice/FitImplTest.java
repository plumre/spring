package com.kevin.spring.aop.schema.advice;

import com.kevin.spring.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Created by renhongjiang on 2019/1/15.
 */
public class FitImplTest extends UnitTestBase {

    @Test
    public void filter() {
        Fit fit = super.getBean("aspectBiz");
        fit.filter();
    }
}