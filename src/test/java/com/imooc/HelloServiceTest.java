package com.imooc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloServiceTest {

    @Test
    public void test1() throws Exception{
        /**
         * 1.加载Spring配置文件
         * 2.取出Bean容器中的实例
         * 3.调用Bean方法
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.hello();
//        User user = (User) context.getBean("User");
//        System.out.println(user.getName());
//        User bean = (User) context.getBean("User");
//        System.out.println(bean);
        User bean1 = context.getBean("User", User.class);
        bean1.setName("乳酸菌");
        bean1.setAge("20");
        bean1.introduce();
        // 销毁bean实例对象
        bean1.destroy();

    }
}
