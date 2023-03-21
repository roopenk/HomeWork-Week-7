package java_homework_week_7;
/**
 * A java program input sales id, seller's name, sales amount, and salary basic and
 * then find this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Seller Name : ");
        String name = scan.nextLine();
        System.out.println("Please Enter Seller ID : ");
        int sId = scan.nextInt();
        System.out.println("Please Enter Sales Amount :");
        int sAmt = scan.nextInt();
        System.out.println("PLease Enter Basic Salary  : ");
        int bSal = scan.nextInt();
        scan.close();
        Program7 obj = new Program7();
        obj.Comm(name, sId, sAmt, bSal);
    }

    public void Comm(String name, int sId, int sAmt, int bSal) {
        int commn;
        if (sAmt >= 50000) {
            commn = ((sAmt * 35) / 100);
        } else if (sAmt >= 30000) {
            commn = ((sAmt * 20) / 100);
        } else if (sAmt >= 20000) {
            commn = ((sAmt * 10) / 100);
        } else if (sAmt >= 10000) {
            commn = ((sAmt * 5) / 100);
        } else
            commn = ((sAmt * 2) / 100);
        System.out.println("Seller's Name : " + name);
        System.out.println("Seller's ID   : " + sId);
        System.out.println("Sales Amount  : " + sAmt);
        System.out.println("Basic Salary  : " + bSal);
        System.out.println("Commission    : " + commn);
    }
}
