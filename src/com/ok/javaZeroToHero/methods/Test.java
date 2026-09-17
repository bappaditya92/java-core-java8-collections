package com.ok.javaZeroToHero.methods;

public class Test {

    public static void main(String[] args) {
        sumOfArray();
    }

//    public static void addNum(int a, int b) {
//        int c = a + b;
//        System.out.println("sum of two num: " + c);

    public static int sumOfArray() {
        int arr[] = {1,2,3,4,5};
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        System.out.println(res);
        return res;
    }
    }

