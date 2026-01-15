/**
 * /*
 * 1. WAJP to print the Even Numbers Between The Range (user input) and count the even number
 * */

package Capgemini.training.DaySix;
import java.util.Scanner;
public class arrayTask1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first number :");
        int start=input.nextInt();

        System.out.print("Enter the Second number :");
        int end=input.nextInt();
        evenNumber(start,end);
    }
    public static void evenNumber(int start,int end){
        int count=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println("Even number between"+start+" And "+end+" "+i);
                count++;
            }
        }
        System.out.println("Total number of even number is : "+count);
    }

}
