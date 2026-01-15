/**
 * A mobile company allows customers to customize phones before purchasing by choosing brand,price , color, and warranty.
 */

// Package declaration
// Yeh batata hai ki class kis package (folder) ke andar hai
package Capgemini.training.DayNine.methodChaning.TASK;

// Mobile customization class
public class task3 {

    // =========================
    // Instance variables
    // =========================

    private int price;        // mobile ki price
    private String color;     // mobile ka color
    private int warranty;     // warranty (years me)

    // =========================
    // Setter methods
    // Har setter "this" return karega
    // Isse method chaining possible hoti hai
    // =========================

    // Price set karne ka method
    public task3 setPrice(int price) {
        this.price = price;   // current object ka price set
        return this;          // ⭐ same object return (method chaining)
    }

    // Color set karne ka method
    public task3 setColor(String color) {
        this.color = color;   // current object ka color set
        return this;          // ⭐ same object return
    }

    // Warranty set karne ka method
    public task3 setWarranty(int warranty) {
        this.warranty = warranty; // current object ki warranty set
        return this;              // ⭐ same object return
    }

    // =========================
    // Getter methods
    // Getter ka kaam sirf value return karna hota hai
    // Getter kabhi parameter nahi leta
    // =========================

    // Price return karega
    public int getPrice() {
        return price;
    }

    // Color return karega
    public String getColor() {
        return color;
    }

    // Warranty return karega
    public int getWarranty() {
        return warranty;
    }
}

