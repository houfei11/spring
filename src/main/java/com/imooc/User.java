package com.imooc;

public class User {

    private String name;
    private String age;
    private String sex;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    /**
     * 介绍
     */
    public void introduce(){
        System.out.println("您好！我叫" + this.name + "今年" + this.age + "岁!");
    }
    public void init(){
        System.out.println("我是初始化方法");
    }
    public void destroy(){
        System.out.println("我是销毁方法");
    }

}
