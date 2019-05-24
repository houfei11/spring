package com.imooc;

import com.imooc.entity.BeanScope1;
import com.imooc.entity.BeanScope2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeText {

    @Test
    public void text(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringScope.xml");
        BeanScope1 beanScope1 = (BeanScope1) context.getBean("BeanScope1");
        System.out.println("beanScope1:" + beanScope1);
        BeanScope2 beanScope2 = (BeanScope2) context.getBean("BeanScope2");
        System.out.println("beanScope2:" + beanScope2);
        BeanScope2 beanScope21 = (BeanScope2) context.getBean("BeanScope2");
        System.out.println("beanScope2:" + beanScope21);

    }
}
