package com.kevin.spring.bean.injection.dao;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String string) {
        System.out.println("InjectionDAOImpl.save: " + string);
    }
}
