package com.kevin.spring.bean.injection.service;

import com.kevin.spring.bean.injection.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {

    /**
     * Method of Injection 1
     * Field Style
     */
    @Autowired
    private InjectionDAO injectionDAO;

    /**
     * Method of Injection 2
     * Setter Style
     * @param injectionDAO Data Access Object
     */
    @Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    /**
     * Method of Injection 3
     * Constructor Style
     * @param injectionDAO Data Access Object
     */
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String string) {
        System.out.println("InjectionServiceImpl.save: received parameter - " + string);
        string += this.hashCode();
        injectionDAO.save(string);
    }
}
