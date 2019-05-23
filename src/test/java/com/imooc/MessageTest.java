package com.imooc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        HelloWorld bean = (HelloWorld) context.getBean("HelloWorld");
//        bean.getMessage1();
//        bean.getMessage2();
//        HelloChina china = (HelloChina) context.getBean("HelloChina");
//        china.getMessage1();
//        china.getMessage2();
//        china.getMessage3();
        TextEditor editor = (TextEditor) context.getBean("TextEditor");
        editor.spellChecker();
    }
}
