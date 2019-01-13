package com.kevin.spring.bean;

import com.kevin.spring.bean.interfaces.BeanInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class BeanInvoke {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Set<BeanInterface> set;

    @Autowired
    private Map<String, BeanInterface> map;

    @Qualifier("beanInterfaceImplOne")
    @Autowired
    private BeanInterface beanInterface;

    public void say() {
        System.out.println("field...");
        if (beanInterface == null) {
            System.out.println("BeanInterface is null.");
        } else {
            System.out.println("BeanInvoke.say: " + beanInterface.getClass().getName());
        }

        System.out.println("list...");
        if (list == null || list.size() == 0) {
            System.out.println("List<BeanInterface> list is null or size is zero");
        } else {
            for (BeanInterface beanInterface : list) {
                System.out.println("BeanInvoke.say: " + beanInterface.getClass().getName());
            }
        }

        System.out.println("set...");
        if (set == null || set.size() == 0) {
            System.out.println("Set<BeanInterface> set is null or size is zero");
        } else {
            for (BeanInterface beanInterface : set) {
                System.out.println("BeanInvoke.say: " + beanInterface.getClass().getName());
            }
        }

        System.out.println("map...");
        if (map == null || map.size() == 0) {
            System.out.println("Map<String, BeanInterface> map is null or size is zero");
        } else {
            for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println("BeanInvoke.say: " + entry.getKey() + " - " + entry.getValue().getClass().getName());
            }
        }
    }

}
