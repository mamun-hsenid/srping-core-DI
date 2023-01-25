package org.constructInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConInject {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/home/mamun/java test project/Spring Core/src/main/java/org/constructInject/ConstructConfig.xml");
        Student studentInfo = (Student) context.getBean("studentCon");

        System.out.println(studentInfo);
    }
}
