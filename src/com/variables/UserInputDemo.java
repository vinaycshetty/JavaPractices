package com.variables;

import java.util.Scanner;

/**
 * Created By : Vinay Shetty
 * on : 03/01/22  at 5:23 PM
 **/
public class UserInputDemo {
    public static void main(String[] args) {
        // Scanner class helps to read command line argument
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int num = scanner.nextInt(); // for int we use nextInt, for String we use nextLine etc. etc.
        System.out.println("You have Entered "+num+" number, Great!!!");
    }
}
