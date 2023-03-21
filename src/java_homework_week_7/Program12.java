package java_homework_week_7;

/**
 * A program that tells us input value is number or an alphabet or symbol
 */

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Special Character, Digit or An Alphabet : ");
        char a = scan.next().charAt(0);
        scan.close();
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            System.out.println(a + " Is An Alphabet ");
        } else if (a >= '0' && a <= '9') {
            System.out.println(a + " Is A Number ");
        } else {
            System.out.println(a + " Is An Special Character ");
        }
    }
}
