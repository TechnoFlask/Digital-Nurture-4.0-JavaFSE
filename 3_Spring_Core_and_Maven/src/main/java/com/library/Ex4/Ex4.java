package com.library.Ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SomeClass sc = context.getBean("someClass", SomeClass.class);
        System.out.println("sc = " + sc);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
