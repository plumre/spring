package com.kevin.spring.aop.schema.advice.biz;

/*
 * Created by renhongjiang on 2019/1/14.
 */

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/14 20:18
 */
public class AspectBiz {

    public void biz() {
        System.out.println("AspectBiz.biz is running.");
//        throw new RuntimeException("haha...Exception..");
    }

    public void init(String bizName, int times) {
        System.out.println("AspectBiz.init: " + bizName + " " + times);
    }

}