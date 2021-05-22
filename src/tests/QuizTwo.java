package tests;

import java.util.Scanner;

public class QuizTwo {
    public static void main(String[] args) {

        //https://www.codesdope.com/practice/java-decide-if-or-else/

        /**
         * Take two int values from user and print greatest among them
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Value first");
        int a = scan.nextInt();
        System.out.print("Value second");
        int b = scan.nextInt();

        if (a>b) {
            System.out.println(a);
        } else if (a<b) {
            System.out.println(b);
        } else {
            System.out.println("equal");
        }
    }
}
