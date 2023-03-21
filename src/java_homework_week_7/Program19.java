package java_homework_week_7;

import java.util.stream.IntStream;

/**
 * A Java program to calculate the average value of array elements
 */
public class Program19 {
    public static void main(String[] args) {
        int c[] = {10, 20, 30, 40, 50, 60};
        Program19 obj = new Program19();
        obj.AvgArr(c);

    }

    public void AvgArr(int c[]) {
        int sum = IntStream.of(c).sum();
        int aver = sum / 6;
        System.out.println("The Average Of Array Elements : " + aver);
    }
}