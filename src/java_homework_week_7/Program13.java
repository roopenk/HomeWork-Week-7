package java_homework_week_7;
/**
 * A Java program which input any number between 1 and 7 ,and it prints The Days
 * name MONDAY, TUESDAY….SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Number Between 1 And 7 : ");
        int a = scan.nextInt();
        scan.close();
        PrnDay(a);

    }

    public static void PrnDay(int a) {
        switch (a) {
            case 1:
                System.out.println("The Entered Day Is Monday");
                break;
            case 2:
                System.out.println("The Entered Day Is Tuesday");
                break;
            case 3:
                System.out.println("The Entered Day Is Wednesday");
                break;
            case 4:
                System.out.println("The Entered Day Is Thursday");
                break;
            case 5:
                System.out.println("The Entered Day Is Friday");
                break;
            case 6:
                System.out.println("The Entered Day Is Saturday");
                break;
            case 7:
                System.out.println("The Entered Day Is Sunday");
                break;
            default:
                System.out.println("Week Contains 1 To 7 Days Only ");
        }
    }

}