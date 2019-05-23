package com.imooc;

import com.imooc.entity.BeansConfiguration;
import com.imooc.entity.Student;
import com.imooc.entity.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        Student student = (Student) context.getBean("student");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println("学生的姓名是：" + student.getName() + ", 老师是：" + student.getTeacher().getName());
        System.out.println("老师的姓名是：" + teacher.getName());
    }
}
