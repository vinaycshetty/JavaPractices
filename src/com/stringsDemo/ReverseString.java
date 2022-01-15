package com.stringsDemo;

/**
 * Created By : Vinay Shetty
 * on : 07/01/22  at 12:34 PM
 **/
public class ReverseString {

        public static void main(String args[]){
            String name = "vinay";
            char[] a = name.toCharArray();
            for(int i=name.length()-1; i>=0;i--){
                System.out.print(a[i]);
            }

        }

}
