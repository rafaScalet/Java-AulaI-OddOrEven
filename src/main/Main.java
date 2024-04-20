package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("--ODD OR EVEN--");
        System.out.print("Enter a number: ");
        num = in.nextInt();
        in.close();
        
        if(num % 2 == 0){
            System.out.println("Number " + num + " is Even");
        }
        else{
            System.out.println("Number " + num + " is Odd");
        }
    }
}
