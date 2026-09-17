package com.ok.javaZeroToHero.recursion;

public class Test {
    public static void main(String[] args) {
       // System.out.println(factorial(5));

        //5 + 4 + 3 + 2 + 1

        System.out.println(sumOfNaturalNumbers(5));

    }
   // public static int factorial(int x){
//        if(x==1){
//            return 1;
//        }
//        return x *factorial(x-1);

  //  }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
            return n + sumOfNaturalNumbers(n - 1);

    }


}