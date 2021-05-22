package tests;

import java.util.Scanner;

public class QuizesOne {
    public static void main(String[] args) {
        //https://www.codesdope.com/practice/java-decide-if-or-else/

        /**
         * Take values of length and breadth of a rectangle from user and check if it is square or not.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print(" Print value of length:");
        int a = scan.nextInt();
        System.out.print(" Print value of breadth:");
        int b = scan.nextInt();

        if (a!=b) {
            System.out.println("Rectangle");

        } else {
            System.out.println("Square");
        }


    }
}
