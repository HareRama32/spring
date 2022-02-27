package com.express.ioc.service;

import com.express.ioc.model.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Sim simObj = context.getBean("beanObj", Sim.class);
        simObj.calling();
    }
}
