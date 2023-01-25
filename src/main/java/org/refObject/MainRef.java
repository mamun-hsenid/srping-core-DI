package org.refObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRef {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/home/mamun/java test project/Spring Core/src/main/java/org/refObject/RefConfig.xml");
        A tempA = (A) context.getBean("aref");
        B tempB = (B) context.getBean("bref");

        System.out.println(tempB.getY());
        System.out.println(tempA.getX());
        System.out.println(tempA.getOb().getY());

    }
}
