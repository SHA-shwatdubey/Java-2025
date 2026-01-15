package shashwat.java.basic;

public class patterntwo {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {          // rows
            for (int j = 1; j <=i; j++) {      // stars
                System.out.print("* ");
            }
            System.out.println();               // new line
        }

    }
}
