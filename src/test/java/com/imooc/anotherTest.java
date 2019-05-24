package com.imooc;

import com.imooc.entity.Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class anotherTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("anotherapplication.xml");
        Bean bean = (Bean) context.getBean("bean");
        System.out.println("Bean" + bean.getAnotherBean());
        System.out.println("userName: " + bean.getUserName());
    }
}
