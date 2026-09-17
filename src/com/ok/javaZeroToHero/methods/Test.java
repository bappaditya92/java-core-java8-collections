package com.ok.javaZeroToHero.methods;

public class Test {

    public static void main(String[] args) {
        System.out.println(sum(10,52,66,96,88));
    }

    public static int sum(int ...num){
        int res = 0;
        for(int i: num){
            res+= i;
        }
        return res;
    }
    }

