/*
5. WAJP for Swapping of Two Numbers using Temp Variable
*/
package Capgemini.training.DaySix;
import java.util.Scanner;

public class arrayTask5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the First number :");
        int num1=input.nextInt();

        System.out.print("Enter the First number :");
        int num2=input.nextInt();

        swapNumber(num1,num2);
    }
    public static void swapNumber(int num1,int num2){
        int temp;

        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Enter the First number :"+num1);
        System.out.println("Enter the First number :"+num2);


    }

}
