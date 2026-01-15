/*
9. WAJP to print multiplication table of 5
*/
package Capgemini.training.DaySix;
import java.util.Scanner;
public class arrayTask9 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num1=input.nextInt();
        System.out.println("Multiplication Table of "+num1);

        multiplecationTable(num1);

    }
    public static void multiplecationTable(int num1){
        for(int i=1;i<11;i++){
            System.out.println("Multiplication Table of "+num1+"x"+i+"="+num1*i);
        }
    }

}

