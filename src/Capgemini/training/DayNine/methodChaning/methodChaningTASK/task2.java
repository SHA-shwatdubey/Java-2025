/**
 * .A school management system allows administrators to create student profiles by setting multiple attributes such as name, age, and class.
 */

// Package declaration
package Capgemini.training.DayNine.methodChaning.TASK;

// Student profile class
public class task2 {

    // =========================
    // Instance variables
    // =========================
    private String name;        // student ka naam
    private int age;            // student ki age
    private int studentClass;   // student kis class me hai

    // =========================
    // Setter methods (Method Chaining)
    // =========================

    // Name set karne ka method
    public task2 setName(String name) {
        this.name = name;   // current object ka name set
        return this;        // ⭐ same object return (method chaining)
    }

    // Age set karne ka method
    public task2 setAge(int age) {
        this.age = age;
        return this;        // ⭐ same object return
    }

    // Class set karne ka method
    public task2 setStudentClass(int studentClass) {
        this.studentClass = studentClass;
        return this;        // ⭐ same object return
    }

    // =========================
    // Getter methods
    // =========================

    // Name return karega
    public String getName() {
        return name;
    }

    // Age return karega
    public int getAge() {
        return age;
    }

    // Class return karega
    public int getStudentClass() {
        return studentClass;
    }
}
