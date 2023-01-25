package org.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutoWiring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/home/mamun/java test project/Spring Core/src/main/java/org/autoWiring/AutoWiringConfig.xml");

        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp);

    }
}
