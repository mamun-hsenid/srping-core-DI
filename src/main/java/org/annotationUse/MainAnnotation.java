package org.annotationUse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {


        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:/home/mamun/java test project/Spring Core/src/main/java/org/annotationUse/AnnotationConfig.xml");

        AnnotationPractice annot = (AnnotationPractice) context.getBean("annotation");
        context.registerShutdownHook();
        System.out.println(annot);

    }
}
