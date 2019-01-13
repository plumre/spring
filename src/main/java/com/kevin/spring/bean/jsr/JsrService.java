package com.kevin.spring.bean.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrService {

    @Resource
    private JsrDAO jsrDAO;

    /*@Resource
    public void setJsrDAO(JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }*/

    @PostConstruct
    public void init() {
        System.out.println("JsrService.init is running.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JsrService.destroy is running.");
    }

    public void save() {
        System.out.println("JsrService.save is running. And..");
        jsrDAO.save();
    }
}
