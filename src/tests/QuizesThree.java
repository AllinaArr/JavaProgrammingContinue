package tests;

import java.util.Scanner;

public class QuizesThree {
    public static void main(String[] args) {

        //https://www.codesdope.com/practice/java-decide-if-or-else/

        /**
         * TA shop will give discount of 10% if the cost of purchased quantity is more than 1000.
         * Ask user for quantity
         * Suppose, one unit will cost 100.
         * Judge and print total cost for user.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantity: ");
        int quntity = scan.nextInt();
        int costOfUnit = 100;

        if (quntity > 100) {
            int total = (int) ((costOfUnit * quntity) * 0.1);
            System.out.println(total);
        } else {
            System.out.println(costOfUnit * quntity);
        }
    }
}
