package SimpleTasks;

import java.util.Scanner;

public class SecondHello {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scr1 = new Scanner(System.in);
        String name1 = scr1.nextLine();
        System.out.println("Hello, " + name1 + "!");
    }
}
