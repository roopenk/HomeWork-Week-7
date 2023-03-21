package java_homework_week_7;

/**
 * A java program to check if the entered number is “POSITIVE”, “NEGATIVE” or "ZERO"
 */

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Number : ");
        int a = scan.nextInt();
        scan.close();
        Program16 obj = new Program16();
        obj.check(a);
    }

    public void check(int a) {
        if (a < 0) {
            System.out.println("The Entered Number Is A NEGATIVE Number");
        } else if (a > 0) {
            System.out.println("The Entered Number Is A POSITIVE Number");
        } else
            System.out.println("The Entered Number Is ZERO");
    }
}
