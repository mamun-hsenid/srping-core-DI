package org.constructorAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAbiguity {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/home/mamun/java test project/Spring Core/src/main/java/org/constructorAmbiguity/AmbiguityConfig.xml");

        AmbiguityPractice amb = (AmbiguityPractice) context.getBean("ambPractice");
        amb.doSum();
//        System.out.println(amb.doSum());
    }
}
