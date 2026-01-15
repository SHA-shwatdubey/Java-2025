package Capgemini.training.DayNine.methodChaning.TASK;

public class mainTask1 {

    public static void main(String[] args) {

        // task1 class ka object banaya
        task1 ob1 = new task1();

        // =======================
        // Method Chaining
        // =======================
        // Ek hi object par multiple setter methods call ho rahe hain
        // Kyunki har setter "return this" kar raha hai

        ob1.setP_name("shashwat")   // product name set
                .setPrice(100)           // price set
                .setQuantity(1)          // quantity set
                .setDiscount(10);        // discount set

        // =======================
        // Getter methods se values print
        // =======================

        System.out.println(ob1.getDiscount()); // 10
        System.out.println(ob1.getP_name());   // shashwat
        System.out.println(ob1.getPrice());    // 100
    }
}
