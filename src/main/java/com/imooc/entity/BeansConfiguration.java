package com.imooc.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 */
@Configuration
public class BeansConfiguration {

    @Bean
    public Student student(){
        Student student = new Student();
        student.setName("张三");
        student.setTeacher(teacher());
        return student;
    }
    @Bean
    public Teacher teacher(){
        Teacher teacher = new Teacher();
        teacher.setName("李老师");
        return teacher;
    }
}
