package com.variables;

/**
 * Created By : Vinay Shetty
 * on : 15/01/22  at 12:43 PM
 **/
public class TypeCastingDemo {
    public static void main(String[] args) {
//        byte byteMaxValue = Byte.MAX_VALUE;
//        short shortMaxValue = Short.MAX_VALUE;
//        int intMaxValue = Integer.MAX_VALUE;
//        long longMaxValue = Long.MAX_VALUE;
//        System.out.println("Byte -> "+byteMaxValue);
//        System.out.println("Short -> "+shortMaxValue);
//        System.out.println("Int -> "+intMaxValue);
//        System.out.println("Long -> "+longMaxValue);
//
//        byte otherByteValue = (byte) (byteMaxValue/2); // (byte) used to cast the byte value by default it will be int
//        short otherShortValue = (short) (shortMaxValue/2);
//        int otherIntValue = intMaxValue/2;
//        long otherLongValue = longMaxValue /2L;
//
//        System.out.println("OtherByteValue -> "+otherByteValue);
//        System.out.println("OtherShortValue -> "+otherShortValue);
//        System.out.println("OtherIntValue -> "+otherIntValue);
//        System.out.println("OtherLongValue -> "+otherLongValue);

        byte b = 10;
        short s = 30;
        int i = 40;
        long l = 50000L + 10L * (b+s+i);

        System.out.println("Long value is ="+ l);

    }




}
