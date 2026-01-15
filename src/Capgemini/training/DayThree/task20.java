package Capgemini.training.DayThree;
import java.util.Scanner;

public class rask20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Number");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
