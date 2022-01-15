package com.stringsDemo;

import java.util.Locale;

/**
 * Created By : Vinay Shetty
 * on : 07/01/22  at 11:33 AM
 **/
public class ToUpperCaseString {
    public static void main(String[] args) {
        String s = "vinay is cool";
        System.out.println(captializeAllFirstLetter(s));

    }
    public static String captializeAllFirstLetter(String name)
    {
        char[] array = name.toCharArray();
        array[0] = Character.toUpperCase(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }

        return new String(array);
    }
}
