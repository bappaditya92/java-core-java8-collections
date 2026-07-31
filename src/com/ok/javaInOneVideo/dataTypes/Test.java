package com.ok.javaInOneVideo.dataTypes;

import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {
        //System.out.printf("OK...");

//        int a = 1;
//        byte b = 2;
//        short c = 3;
//        long d = 9223372036854775807l;
//
//        System.out.println(d+c);
//
//        //System.out.println("Byte Range"+Byte.MIN_VALUE+Byte.MAX_VALUE);
//        System.out.println("Long range: "+Long.MAX_VALUE);

//        boolean isAdult = true;
//        isAdult = false;
//        System.out.println(isAdult);
        char b = 'b';

        System.out.println((int) b);

        System.out.println("Minimum Val: " + (int) Character.MIN_VALUE);
        System.out.println("maximum val: " + (int) Character.MAX_VALUE);
//common ASCII example (0-127 range)
        System.out.println((char) 10084);

    }
}
