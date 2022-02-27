package com.express.di.setter.service;

import com.express.di.setter.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
        Person person = (Person) context.getBean("krishnaObject");
        System.out.println(person.name + " : " + person.houseNo + " : " + person.family + " : "+
                person.job + " : " + person.importantNumbers);
    }
}
