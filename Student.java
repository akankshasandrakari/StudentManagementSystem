/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

/**
 *
 * @author akank
 */
public class Student {
    private String name;
    private int rollNumber;
    private int age;

    // Constructor
    public Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    // Overriding toString method to display student details
    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Age: " + age;
    }
    
}
