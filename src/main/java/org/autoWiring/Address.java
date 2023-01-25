package org.autoWiring;

public class Address {
    private int salary;
    private String designation;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Address(int salary, String designation) {
        this.salary = salary;
        this.designation = designation;
    }

    public Address() {
        super();
    }

    @Override
    public String toString() {
        return "Address{" +
                "salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
