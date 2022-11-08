package SimpleTasks;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc1.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc1.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc1.nextInt();
        double resAver1 = (num1 + num2 + num3)/3;
        System.out.println("Average is: " + resAver1);

    }
}
