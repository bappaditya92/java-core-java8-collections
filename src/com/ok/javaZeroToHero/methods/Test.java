package com.ok.javaZeroToHero.methods;

public class Test {

    public static void main(String[] args) {


        System.out.println(isPrime(17));
        System.out.println(isPrime(20));
        System.out.println(isPrime(19));
    }

    public static boolean isPrime(int num){
        int res = 0;

        for(int i=1; i<num/2; i++){
            if(num %i == 0){
                res++;
            }

        }

        return res == 1;

    }


    }

