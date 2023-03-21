package java_homework_week_7;
/**
 * A Java program to Input any alphabet from A to F and print their city name accordingly (use if else), if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter Any Alphabet Between A and F : ");
        char a = scan.next().charAt(0);
        scan.close();
        Program8 obj = new Program8();
        obj.PrnCity(a);
    }

    public void PrnCity(char a) {
        if (a == 'A') {
            System.out.println("The Relevant City : Anand");
        } else if (a == 'B') {
            System.out.println("The Relevant City : Boston");
        } else if (a == 'C') {
            System.out.println("The Relevant City : Chicago");
        } else if (a == 'D') {
            System.out.println("The Relevant City : Dallas");
        } else if (a == 'E') {
            System.out.println("The Relevant City : Edinburgh");
        } else if (a == 'F') {
            System.out.println("The Relevant City : Frankfurt");
        } else
            System.out.println("Invalid Entry");
    }
}
