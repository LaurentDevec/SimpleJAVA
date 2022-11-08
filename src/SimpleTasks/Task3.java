package SimpleTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a = 74;
        int b = 36;
        int res = a + b;
        System.out.println(res);

        int c = 13;
        int d = 16;
        int res1 = a * b;
        System.out.println(res1);

        System.out.println("Enter first number: ");
        Scanner x = new Scanner(System.in);
        int var1 = x.nextInt();
        System.out.println("Enter second number: ");
        int var2 = x.nextInt();
        System.out.println(var1*var2);
        System.out.println(var1/var2);
        System.out.println(var1%var2);
        System.out.println(var1-var2);
        System.out.println(var1+var2);
        System.out.println(var1++);
    }
}
