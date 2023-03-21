package java_homework_week_7;

/**
 * A Java program to test if an array contains a specific value
 */

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        int i;
        boolean check = false;
        int array[] = {5, 10, 15, 20, 25, 30}; // array declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter value to see if it is stored in the array:");
        int u = scan.nextInt(); // user inserted number assigned to variable
        scan.close();
        for (i = 0; i < array.length; i++) { // for loop going through array to check user inserted number exists in array
            if (u == array[i]) {
                check = true;
            }
            if (check) {
                System.out.println("The array contains the given value");
                break;
            } else {
                System.out.println("The array does not contain the given value");
                break;
            }
        }
    }
}