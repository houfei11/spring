package com.imooc;

import com.imooc.entity.Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class anotherTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("anotherapplication.xml");
        Bean bean = (Bean) context.getBean("bean");
        System.out.println("Bean" + bean.getAnotherBean());
        System.out.println("userName: " + bean.getUserName());
        System.out.println("Bean.getStringList()" + bean.getStringList());
        System.out.println("Bean.getStringSet()" + bean.getStringSet());
        System.out.println("Bean.getStringMap()" + bean.getStringMap());
        System.out.println("Bean.getAnotherBeanList()" + bean.getAnotherBeanList());
        System.out.println("Bean.getAnotherBeanSet()" + bean.getAnotherBeanSet());
        System.out.println("Bean.getAnotherBeanMap()" + bean.getAnotherBeanMap());
        System.out.println("Bean.getProperties()" + bean.getProperties());
        System.out.println("Bean.getAnotherBean2()" + bean.getAnotherBean2());
    }
}
