package com.imooc.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Component("student")
public class Student {
    @Value("张三")
    private String name;
    @Value("18")
    private Integer age;
    @Resource
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
