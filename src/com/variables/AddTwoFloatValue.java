package com.variables;

import java.util.Scanner;

/**
 * Created By : Vinay Shetty
 * on : 03/01/22  at 5:35 PM
 **/
public class AddTwoFloatValue {
    // Q. Java Program to Multiply two Floating Point Numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Float number :");
        float a = scanner.nextFloat(); // if you declare float value  -  float a = 1.5f;
        System.out.print("Enter 2nd Float number :");
        float b = scanner.nextFloat();
        float ans = a*b;
        System.out.println("Multiplication of twp float number is :" +ans);

    }
}
