package org.hsenidnCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String empID;
    private List <String> empPhone;
    private Set <String> empFamily;
    private Map<String, String> empCourse;
    private Properties props;

    public Employee(Properties props) {
        this.props = props;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpID() {
        return empID;
    }

    public List<String> getEmpPhone() {
        return empPhone;
    }

    public Set<String> getEmpFamily() {
        return empFamily;
    }

    public Map<String, String> getEmpCourse() {
        return empCourse;
    }

    public void setEmpPhone(List<String> empPhone) {
        System.out.println("Setter injection List");
        this.empPhone = empPhone;
    }

    public void setEmpFamily(Set<String> empFamily) {
        System.out.println("Setter injection Set");
        this.empFamily = empFamily;
    }

    public void setEmpCourse(Map<String, String> empCourse) {
        System.out.println("Setter injection Map");
        this.empCourse = empCourse;
    }

    public Employee(String empID, List<String> empPhone, Set<String> empFamily, Map<String, String> empCourse) {
        System.out.println("Constructor inject");
        this.empID = empID;
        this.empPhone = empPhone;
        this.empFamily = empFamily;
        this.empCourse = empCourse;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", empPhone=" + empPhone +
                ", empFamily=" + empFamily +
                ", empCourse=" + empCourse +
                '}';
    }

}
