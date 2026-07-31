package com.ok.javaInOneVideo.conditional;

public class Test {
    public static void main(String[] args) {
//        System.out.println(1>2 && 1!=2);
//        System.out.println(1>2 || 1!=2);
//        boolean a = true;
//        System.out.println(!a);

        boolean isSunny = true;
        boolean isWarm = true;

        if(isSunny || isWarm){
            System.out.println("Go to outside...");
        }
        else{
            System.out.println("Ghar me raho vai...");
        }

    }
}
