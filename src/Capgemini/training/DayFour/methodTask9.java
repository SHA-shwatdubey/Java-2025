/**
 * A system should:
 * •	Accept marks(atleast 3 subject marks)
 * •	Calculate total
 * •	Return grade
 */

package Capgemini.training.DayFour;

public class taskMethod9 {
    public static String calculateGrade(int eng, int math, int science) {
        int total = eng + math + science;
        System.out.println("Total Marks: " + total);

        if (eng < 40 || math < 40 || science < 40) {
            return "Fail";
        } else if (total >= 250) {
            return "Grade A";
        } else if (total >= 180) {
            return "Grade B";
        } else {
            return "Grade C";
        }
    }
    public static void main(String[] args) {
        String grade = calculateGrade(80, 70, 90);
        System.out.println("Result: " + grade);
    }
}
