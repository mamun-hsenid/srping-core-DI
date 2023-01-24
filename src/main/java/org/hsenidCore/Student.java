package org.hsenidCore;

public class Student {
    private int studentID;
    private int studentAge;
    private String studentName;
    private String studentAddress;

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(int studentID, int studentAge, String studentName, String studentAddress) {
        this.studentID = studentID;
        this.studentAge = studentAge;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentAge=" + studentAge +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
