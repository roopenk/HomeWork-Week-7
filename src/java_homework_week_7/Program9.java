package java_homework_week_7;
/**
 * A Java program to Input any alphabet from A to F and print their city name accordingly (by using Switch), if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease Enter Any Alphabet Between A and F : ");
        char a = scan.next().charAt(0);
        scan.close();
        Program9 obj = new Program9();
        obj.PrnCity(a);

    }

    public void PrnCity(char a) {
        switch (a) {
            case 'A':
                System.out.println("The Relevant City : Anand");
                break;
            case 'B':
                System.out.println("The Relevant City : Boston");
                break;
            case 'C':
                System.out.println("The Relevant City : Chicago");
                break;
            case 'D':
                System.out.println("The Relevant City : Dallas");
                break;
            case 'E':
                System.out.println("The Relevant City : Edinburgh");
                break;
            case 'F':
                System.out.println("The Relevant City : Frankfurt");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
