
package Lecture_08;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice;

        do {
            System.out.println("");
            System.out.println("=========================");
            System.out.println("Menu:");
            System.out.println("1. Enter information for n students");
            System.out.println("2. Display all students");
            System.out.println("3. Find student by ID");
            System.out.println("4. Delete student by ID");
            System.out.println("5. Edit student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.println("=========================");
                    System.out.print("Enter number of students: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();  
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter details for student " + (i + 1) + ": ");
                        System.out.print("Student ID: ");
                        String studentId = scanner.nextLine();
                        System.out.print("Full Name: ");
                        String fullName = scanner.nextLine();
                        System.out.print("Date of Birth (YYYY-MM-DD): ");
                        String dob = scanner.nextLine();  
                        System.out.print("Major: ");
                        String major = scanner.nextLine();
                        System.out.print("GPA: ");
                       
                        float gpa = scanner.nextFloat();
                        scanner.nextLine();  

                        Student student = new Student(studentId, fullName, new Date(), major, gpa); 
                        studentList.addStudent(student);
                    }
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("=========================");
                    System.out.print("Enter student ID to search: ");
                    String idToFind = scanner.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                            System.out.println("");
        System.out.println("=========================");
                    System.out.print("Enter student ID to delete: ");
                    String idToDelete = scanner.nextLine();
                    boolean deleted = studentList.deleteStudentById(idToDelete);
                    if (deleted) {
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                            System.out.println("");
        System.out.println("=========================");
                    System.out.print("Enter student ID to edit: ");
                    String idToEdit = scanner.nextLine();
                    boolean edited = studentList.editStudentById(idToEdit);
                    if (edited) {
                        System.out.println("Student info updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
