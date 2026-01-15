/**
 * 1.An e-commerce company is developing a shopping cart system. Customers should be able to add multiple attributes such as product name, price , discount and quantity
 */

// Package ka naam – yeh batata hai class kis folder ke andar hai
package Capgemini.training.DayNine.methodChaning.TASK;

// Product / Shopping Cart ki class
public class task1 {

    // =======================
    // Instance variables
    // =======================

    private String p_name;   // product ka naam
    private int price;       // product ki price
    private int quantity;    // kitni quantity li gayi hai
    private int discount;    // discount percentage

    // =======================
    // Setter methods (Method Chaining ke liye)
    // =======================

    // Product name set karne ka method
    public task1 setP_name(String p_name) {
        this.p_name = p_name;   // current object ke p_name me value store
        return this;            // ⭐ same object return → method chaining
    }

    // Price set karne ka method
    public task1 setPrice(int price) {
        this.price = price;     // current object ki price set
        return this;            // ⭐ same object return
    }

    // Quantity set karne ka method
    public task1 setQuantity(int quantity) {
        this.quantity = quantity; // quantity set
        return this;              // ⭐ same object return
    }

    // Discount set karne ka method
    public task1 setDiscount(int discount) {
        this.discount = discount; // discount set
        return this;              // ⭐ same object return
    }

    // =======================
    // Getter methods (values read karne ke liye)
    // =======================

    // Product name return karega
    public String getP_name() {
        return p_name;
    }

    // Price return karega
    public int getPrice() {
        return price;
    }

    // Quantity return karega
    public int getQuantity() {
        return quantity;
    }

    // Discount return karega
    public int getDiscount() {
        return discount;
    }
}
