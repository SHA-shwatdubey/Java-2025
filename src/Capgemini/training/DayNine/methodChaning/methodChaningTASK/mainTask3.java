// Package declaration
package Capgemini.training.DayNine.methodChaning.TASK;

public class mainTask3 {

    public static void main(String[] args) {

        // task3 class ka object banaya
        task3 ob3 = new task3();

        // =========================
        // Method Chaining
        // =========================
        // Ek hi object par multiple setter methods
        // Kyunki har setter "return this" kar raha hai

        ob3.setColor("blue")   // color set
                .setPrice(100)      // price set
                .setWarranty(5);    // warranty set

        // =========================
        // Getter methods se values print
        // =========================

        System.out.println(ob3.getColor());     // Output: blue
        System.out.println(ob3.getWarranty());  // Output: 5
        System.out.println(ob3.getPrice());     // Output: 100
    }
}
