package com.kevin.spring.bean.configure;

public class IntegerStore implements Store<Integer> {
    @Override
    public void init() {
        System.out.println("IntegerStore.init is running.");
    }

    @Override
    public void destroy() {
        System.out.println("IntegerStore.destroy is running.");
    }
}
