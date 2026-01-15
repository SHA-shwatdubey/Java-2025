package Capgemini.training.DayThree;

import java.util.Scanner;
public class DecisionMakingStatement {

        public static void main(String[] args) {


            Scanner input=new Scanner(System.in);

            String str=input.next();

            switch (str){
                case "mon":
                    System.out.println("Dosa");
                    break;
                case  "tue":
                    System.out.println("Idly");
                    break;
                case "wed":
                    System.out.println("sambhar");
                    break;
                case "thu":
                    System.out.println("pav");
                    break;
                case "fri":
                    System.out.println("bhaji");
                    break;
                case "sat":
                    System.out.println("samosa");
                    break;
                case "sun":
                    System.out.println("jalebi");
                    break;
            }


        }
    }


