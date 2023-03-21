package java_homework_week_7;
/** A Java program to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 Print in following format
 _____________________________
 | Salary Slip               |
 |___________________________|
 | Employee Id : 2564        |
 | Employee Name : Jay       |
 |___________________________|
 | Basic Salary : 25000.0    |
 | HRA 10% : 2500.0          |
 | TA 8% : 2250.0            |
 | DA 9% : 2000.0            |
 | PF - 20& : 5000.0         |
 |___________________________|
 | Gross Salary : 26750.0    |
 |===========================|
 */
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Employee Name : ");
        String name = scan.nextLine();
        System.out.println("Please Enter Employee ID : ");
        int empId = scan.nextInt();
        System.out.println("Please Enter Employee's Basic Salary : ");
        int empSal = scan.nextInt();
        scan.close();
        Program5 obj = new Program5();
        obj.cal(name, empId, empSal);
    }
    public void cal(String name, int empId, int empSal){
        int hra, ta, da, pf, gs;
        hra = ( (empSal * 10) / 100);
        ta = ((empSal * 9 ) / 100);
        da = ((empSal * 8 ) / 100);
        pf = ((empSal * 20 ) / 100);
        gs = empSal + hra + ta + da + pf;
        System.out.println("------------------------------------------");
        System.out.println("|              Salary Slip               |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Employee Id     : " + empId + "                  |");
        System.out.println("| Employee Name   : " + name  + "               |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Basic Salary    : " + empSal + "                |");
        System.out.println("| HRA 10%         : " + hra + "                 |");
        System.out.println("| TA 9%           : " + ta + "                 |");
        System.out.println("| DA 8%           : " + da + "                 |");
        System.out.println("| PF - 20%        : " + pf + "                |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Gross Salary    : " + gs + "               |");
        System.out.println("|========================================|");
    }
}
