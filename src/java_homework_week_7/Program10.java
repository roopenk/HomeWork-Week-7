package java_homework_week_7;
/**
 * A java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 * find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Number : ");
        int a = scan.nextInt();
        System.out.println("Please Enter Second NUmber :");
        int b = scan.nextInt();
        System.out.println("Please Enter Operational Symbol (+, -, /, *) : ");
        char c = scan.next().charAt(0);
        scan.close();
        Program10 obj = new Program10();
        obj.Oper(a, b, c);
    }

    public void Oper(int a, int b, char c) {
        if (c == '+') {
            System.out.println("The Summation of " + a + " And " + b + " Is " + (a + b));
        } else if (c == '-') {
            System.out.println("The Subtraction of " + a + " And " + b + " Is " + (a - b));
        } else if (c == '/') {
            System.out.println("The Division of " + a + " And " + b + " Is " + (a / b));
        } else if (c == '*') {
            System.out.println("The Multiplication of " + a + " And " + b + " Is " + (a * b));
        } else
            System.out.println("Invalid Selection");
    }
}
