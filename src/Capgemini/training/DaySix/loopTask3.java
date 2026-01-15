/**
 * /*
 * 3. WAJP to print the Odd Numbers Between The Range (user input)
 * */

package Capgemini.training.DaySix;
import java.util.Scanner;
public class arrayTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first Number : ");
        int start = input.nextInt();

        System.out.print("Enter the first Number : ");
        int end = input.nextInt();

        int result = OddNumberBetweenRange(start, end);
        System.out.println("The total number of odd number is = "+result);
    }
    public static int OddNumberBetweenRange(int num1,int num2){
        int count=0;
        for(int i=num1;i<=num2;i++){
            if(i%2 !=0 ){
                System.out.println("Odd Number between the range :"+num1+"-"+num2+"="+i);
                count++;
            }
        }
        return count;
    }

}
