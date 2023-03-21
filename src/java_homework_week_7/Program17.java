package java_homework_week_7;

import java.util.Arrays;

/**
 * A Java program to sort a numeric array and a string array.
 */
public class Program17 {
    public static void main(String[] args) {
        int a[] = {10, 50, 60, 20, 30, 40};
        String b[] = {"Apple","Blackberry","Samsung","Nokia","HTC"};
        Program17 obj = new Program17();
        obj.SrtArr(a);
        obj.SrtArr1(b);
    }

    public void SrtArr(int a[]) {
        Arrays.sort(a);
        System.out.println("The Sorted Numerical Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public void SrtArr1(String b[]){
        System.out.println("The Sorted String Array : ");
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
