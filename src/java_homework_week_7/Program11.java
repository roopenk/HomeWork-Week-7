package java_homework_week_7;

/**
 * A java program to print the numbers between 1 and 100 which can be divided by 3
 * and 5 separately.
 */
public class Program11 {
    public static void main(String[] args) {
        System.out.println("The Number Which Can Be Divided By 3 : ");
        div3();
        System.out.println(" ");
        System.out.println("The Number Which Can Be Divided By 5 : ");
        div5();
    }

    public static void div3() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");

            }
        }
    }

    public static void div5() {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ",");

            }
        }
    }

}