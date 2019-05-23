package com.imooc;

import com.imooc.entity.Student;
import com.imooc.entity.Teacher;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TeacherText {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/resources/application.xml");
        Student student = (Student) context.getBean("student");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println("学生的姓名是：" + student.getName() + "，年龄是：" + student.getAge() + "。老师是：" + student.getTeacher());
        System.out.println("老师的姓名是：" + teacher.getName() + ", 年龄是：" + teacher.getAge());
    }
}
