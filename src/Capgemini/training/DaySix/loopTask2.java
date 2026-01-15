/**
 * /*
 * 2. WAJP to find the sum of even numbers from 1 to 10
 * */
package Capgemini.training.DaySix;
import java.util.Scanner;
public class arrayTask2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int start=input.nextInt();

        System.out.print("Enter the first number : ");
        int end=input.nextInt();

        int result = sumOfEvenNumber(start,end);

        System.out.println("The sum of all the even number between the range : "+start+"-"+end+"="+result);

    }
    public static int sumOfEvenNumber(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0) {
                sum = sum + i;
            }
        }
        return sum;

    }

}
