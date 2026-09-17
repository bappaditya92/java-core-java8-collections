package com.ok.javaZeroToHero.methods;

public class Test {

    public static void main(String[] args) {
//        int[] a = {10,52,1,2,3,6,9,8};
//        sumOfArray(a);
//        int z = sumOfArray(a);
//        System.out.println(z);

//        String result = upperFunc("                    bappaditya                        ");
//        System.out.println(result);

int res = addNum(5,3);
        System.out.println(res);
 int res1 = addNum(5,8,9);
        System.out.println(res1);

    }




//    public static void addNum(int a, int b) {
//        int c = a + b;
//        System.out.println("sum of two num: " + c);

//    public static int sumOfArray(int[] arr) {
//        //int arr[] = {1,2,3,4,5};
//        int res = 0;
//        for (int i : arr) {
//            res += i;
//        }
//        //System.out.println(res);
//        return res;
    //}
//    private static String upperFunc(String str){
//       return str.trim().toUpperCase()
//    }
//

    public static int addNum(int a, int b){
        return a+b;
    }

    public static int addNum(int a, int b, int c){
        return a+b+c;
    }

    }

