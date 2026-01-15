/*
 WAJP to find the Greatest of 3 numbers using Ternary Operator
*/
package Capgemini.training.DaySix;
import java.util.Scanner;

public class arrayTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number :");
        int num1 = input.nextInt();

        System.out.print("Enter the first number :");
        int num2 = input.nextInt();

        System.out.print("Enter the first number :");
        int num3 = input.nextInt();
        int result=greatestOfNumber(num1,num2,num3);
        System.out.println("So the greatest number is "+result);
    }
    public static int greatestOfNumber(int num1,int num2,int num3){
        int greatestNumber=num1>num2 && num1>num2? num1:(num2>num3 && num2>num1?num2:num3);
        System.out.println(greatestNumber);
        return greatestNumber;
    }
}
