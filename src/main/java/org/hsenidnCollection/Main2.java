package org.hsenidnCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello main 2!");

        ApplicationContext context = new ClassPathXmlApplicationContext("file:/home/mamun/java test project/Spring Core/src/main/java/org/hsenidnCollection/EmployeeConfig.xml");

        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee.getEmpID());
        System.out.println(employee.getEmpPhone());
        System.out.println(employee.getEmpCourse());
        System.out.println(employee.getEmpFamily());
        System.out.println(employee.getProps());
    }
}
