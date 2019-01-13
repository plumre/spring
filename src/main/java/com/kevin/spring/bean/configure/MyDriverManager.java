package com.kevin.spring.bean.configure;

public class MyDriverManager {
    public MyDriverManager(String url, String username, String password) {
        System.out.println("url = [" + url + "], username = [" + username + "], password = [" + password + "]");
    }
}
