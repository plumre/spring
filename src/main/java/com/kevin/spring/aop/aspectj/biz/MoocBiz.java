package com.kevin.spring.aop.aspectj.biz;

/*
 * Created by renhongjiang on 2019/1/15.
 */

import com.kevin.spring.aop.aspectj.MoocMethod;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/15 15:43
 */
@Service
public class MoocBiz {

    @MoocMethod("MoocBiz save with MoocMethod")
    public String save(String string) {
        System.out.println("MoocBiz.save： " + string);
//        throw new RuntimeException("Save failed.");
        return "Save successful!";
    }

}