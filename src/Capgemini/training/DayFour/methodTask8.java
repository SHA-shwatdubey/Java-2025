/**
 * A calculator performs(return calculations)
 * •	Add 2 numbers
 * •	Add 3 numbers
 * •	Add decimals
 */
package Capgemini.training.DayFour;
public class taskMethod8 {

    public static int add(int num1, int num2) {
 return num1 + num2;
 }
    public static int add(int num1, int num2, int num3) {
 return num1 + num2 + num3;
 }
    public static float add(float num1, float num2, float num3) {
 return num1 + num2 + num3;
 }
    public static void main(String[] args) {

 int sum2 = add(2, 3);
 System.out.println("Sum of 2 numbers: " + sum2);

 int sum3 = add(2, 3, 4);
 System.out.println("Sum of 3 numbers: " + sum3);

 float sumDecimal = add(2.5f, 3.5f, 1.0f);
 System.out.println("Sum of decimal numbers: " + sumDecimal);
 }

}