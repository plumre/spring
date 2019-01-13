package com.kevin.spring.bean.interfaces;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Order works for List only, not for Set or Map
 */
@Order(2)
@Component
public class BeanInterfaceImplOne implements BeanInterface {
}
