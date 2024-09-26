/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akank
 */
public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to add a new student
    public void addStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter roll number:");
        int rollNumber = scanner.nextInt();
        
        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Student newStudent = new Student(name, rollNumber, age);
        students.add(newStudent);
        System.out.println("Student added successfully.");
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("Student Records:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Method to delete a student by roll number
    public void deleteStudent() {
        System.out.println("Enter the roll number of the student to delete:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Student studentToRemove = null;
        
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                studentToRemove = student;
                break;
            }
        }
        
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student with roll number " + rollNumber + " not found.");
        }
    }
}
