package com.ok.javaInOneVideo.arrays;

public class Test {

    public static void main(String[] args) {
//            int[] arr = new int[20];
//        arr[3] = 56;
//        System.out.println(arr[3]);
//        for(int i =0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }


//        int[] arr = {1,2,5,6,3,7,9};
//        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        //System.out.println(arr);

//     int[] arr1 = {4,5,8,59,9,47,8,661,87,92,46};
//     for(int i: arr1){
//         System.out.println(i);
//     }


 // Search an element in an array
//        int arr[] = {9,47,8,661,87,92};
//        for(int i: arr){
//            if(i==661){
//                System.out.println("Found");
//            }
//            else{
//                System.out.println("not found");
//            }
//        }



        //Find Maximum element

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2000;
        arr[2] = 855;
        arr[3] = -4;
        arr[4] = 85;
        int res = Integer.MIN_VALUE;

       for (int i=0; i<arr.length; i++){
           if(arr[i]>res){
               res = arr[i];
           }

       }
        System.out.println(res);



    }

}
