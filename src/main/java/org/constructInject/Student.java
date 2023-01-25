package org.constructInject;

public class Student {
    private String studentName;
    private int studentId;
    private String studentEmail;

    public Student(String studentName, int studentId, String studentEmail) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentEmail = studentEmail;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
