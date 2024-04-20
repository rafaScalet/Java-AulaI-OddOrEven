package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.print("Enter a number: ");
        num = in.nextInt();
        System.out.print("Enter another number: ");
        num += in.nextInt();
        System.out.println("\nResult: " + num);
        in.close();
    }
}
