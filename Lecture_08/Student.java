package Lecture_08;

import java.util.Date;

public class Student {
    private String studentId;
    private String fullName;
    private Date dateOfBirth;
    private String major;
    private float gpa;

    public Student(String studentId, String fullName, Date dateOfBirth, String major, float gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }

    public void enterStudentInfo() {
        
    }

    public void displayStudentInfo() {
     
        System.out.println("");
        System.out.println("=============[Info]=============");
        System.out.println("Student ID: " + studentId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }

    public String getStudentId() {
        return studentId;
    }
}

