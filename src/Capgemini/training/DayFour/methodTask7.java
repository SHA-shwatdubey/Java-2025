/**
 * ATM should:
 * •	Accept balance & withdrawal amount
 * •	Return updated balance
 * •	Use methods properly
 */
package Capgemini.training.DayFour;
public class taskMethod7 {
    public static int acceptBalance(int balance) {
        return balance;
    }
    public static int withdrawBalance(int balance, int withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }
    public static void main(String[] args) {

        int balance = acceptBalance(1000);
        System.out.println("Initial Balance: " + balance);

        balance = withdrawBalance(balance, 300);
        System.out.println("Updated Balance: " + balance);
    }
}
