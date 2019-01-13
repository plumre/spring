package com.kevin.spring.bean.configure;

public class StringStore implements Store<String> {
    @Override
    public void init() {
        System.out.println("StringStore.init is running.");
    }

    @Override
    public void destroy() {
        System.out.println("StringStore.destroy is running.");
    }
}
