/*
8. WAJP to print ‘A’ to ‘Z’ ASCII values
*/
package Capgemini.training.DaySix;
import java.util.Scanner;

public class arrayTask8 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first character =");
        char start_char=input.next().charAt(0);

        System.out.print("Enter the first character =");
        char end_char=input.next().charAt(0);

        int total_character=asciiValue(start_char,end_char);

        System.out.println("Total number of character is "+total_character);

    }

    public static int asciiValue(char start_char,char end_char){
        int count=0;

        for(int i=start_char;i<end_char;i++){
            System.out.println("ASCII value Between "+start_char+" to "+end_char+" ="+i);
            count++;
        }
        return count;
    }
}
