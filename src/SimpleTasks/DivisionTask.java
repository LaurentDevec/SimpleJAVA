package SimpleTasks;

import java.util.Scanner;

public class DivisionTask {
    public static void main(String[] args) {
        int a = 50;
        int b = 3;
        int res1 = a/b;
        System.out.println(res1);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int c = sc1.nextInt();
        System.out.println("Enter second number:");
        int d = sc1.nextInt();
        int res2 = c/d;
        System.out.println(res2);
    }
}
