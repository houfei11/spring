package com.imooc;

import com.imooc.entity.Student;
import com.imooc.entity.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-test.xml");
        Student bean = (Student) context.getBean("student");
        Teacher bean1 = (Teacher) context.getBean("teacher");
        System.out.println("学生的姓名是：" + bean.getName() + ", 老师是：" + bean.getTeacher().getName());
        System.out.println("老师的姓名是：" + bean1.getName());
    }
}
