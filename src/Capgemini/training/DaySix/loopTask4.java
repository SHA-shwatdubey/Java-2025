/*
4. WAJP to find the sum of first 10 Odd numbers
*/
package Capgemini.training.DaySix;
import java.util.Scanner;
public class arrayTask4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first number :");
        int start=input.nextInt();

        System.out.print("Enter the first number :");
        int end=input.nextInt();

        int result=sumOfOddNumber(start, end);

        System.out.println("Sum of all the odd number : form "+start+" to "+end+" = "+result);
    }
    public static int sumOfOddNumber(int start,int end ){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                sum=sum=i;
            }
        }
        return sum;
    }


}
