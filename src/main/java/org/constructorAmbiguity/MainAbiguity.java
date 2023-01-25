package org.constructorAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAbiguity {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:/home/mamun/java test project/Spring Core/src/main/java/org/constructorAmbiguity/AmbiguityConfig.xml");

        AmbiguityPractice amb = (AmbiguityPractice) context.getBean("ambPractice");
        amb.doSum();
        context.registerShutdownHook();
//        System.out.println(amb.doSum());
    }
}


