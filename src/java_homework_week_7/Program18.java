package java_homework_week_7;

import java.util.stream.IntStream;

/** A Java program to sum values of an array
 *
 */
public class Program18 {
    public static void main(String[] args) {
        int a [] = {10,20,30,40,50,60};
        Program18 obj = new Program18();
        obj.SumArr(a);
    }
    public void SumArr(int a []){
        int sum = IntStream.of(a).sum();
        System.out.println("The Sum Of Array Elements : " + sum);
    }
}
