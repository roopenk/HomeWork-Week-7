package java_homework_week_7;
/**
 * A Java program to verify whether the number entered by the user is odd or even
 * by using logic
 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Any Number Without Decimal Points or Special Characters : ");
        int num = scan.nextInt();
        scan.close();
        Program6 obj = new Program6();
        obj.EvenOdd(num);
    }

    public void EvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is An Even Number");
        } else {
            System.out.println(num + " is An Odd Number");
        }
    }
}
