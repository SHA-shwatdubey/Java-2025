/**
10. WAJP to extract the last digit
*/
package Capgemini.training.DaySix;
import java.util.Scanner;
public class arrayTask10 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=input.nextInt();
        int result=lastDigit(num);
        System.out.println("Enter the last digit of the number :"+result);
    }

    public static int lastDigit(int num){
        int digit=num%10;
        return digit;
    }
}
