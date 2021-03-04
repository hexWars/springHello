package com.Cai.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author Cai
 * @Date 2021-03-03 16:48
 */
public class MyTest {
    public static void main(String[] args) {
//        获取Spring的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        取出对象
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.getString());

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");
        User user1 = context.getBean("user2", User.class);
        System.out.println(user);
        System.out.println(user1);
    }
}

