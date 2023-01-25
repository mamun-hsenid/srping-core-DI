package org.annotationUse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationPractice {
    private String empName;
    private int empId;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public AnnotationPractice(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "empName='" + empName + '\'' +
                ", empId=" + empId;
    }

    public AnnotationPractice() {
        super();
    }

    @PostConstruct
    public void start(){
        System.out.println("Annotation execution starts");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Annotation execution ended");
    }

}
