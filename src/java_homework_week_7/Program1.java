package java_homework_week_7;

/**
 * A Java program to verify whether the number entered by the user is odd or even
 * by using ternary operator (?:)
 */

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Number Without Decimal Points or Special Characters : ");
        int num = scan.nextInt();
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is An " + evenOdd + " Number");
        scan.close();
    }
}
