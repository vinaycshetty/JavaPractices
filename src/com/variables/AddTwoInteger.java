package com.variables;

import java.util.Scanner;

/**
 * Created By : Vinay Shetty
 * on : 03/01/22  at 5:32 PM
 **/
public class AddTwoInteger {
    // Q. Java Program to Add Two Integers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        int ans = num1+num2;
        System.out.println("Addition of two numbers is :" +ans);
    }
}
