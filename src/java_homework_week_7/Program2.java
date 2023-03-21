package java_homework_week_7;

/**
 * A Program to accept any year value from user and print whether the that is a leap year or not
 */

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Valid Year :");
        int year = scan.nextInt();
        Program2 obj = new Program2();
        obj.LpYear(year);
        scan.close();
    }

    public void LpYear(int year) {
        if ((year % 4 == 0) && (year % 100 == 0))
        {
            System.out.println("The Year " + year + " Is A Leap Year ");
        }else{
            System.out.println("The Year " + year + " Is Not A Leap Year ");
        }
    }
}
