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
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2000;
//        arr[2] = 855;
//        arr[3] = -4;
//        arr[4] = 85;
//        int res = Integer.MIN_VALUE;
//       for (int i=0; i<arr.length; i++){
//           if(arr[i]>res){
//               res = arr[i];
//           }
//       }
//        System.out.println(res);


//        //reverse an array
//        int arr[] = {5,8,9,6,7,6,2};
//        for(int i=arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
//        }

        //sum of array
//       int arr[] = {5,9,6,7,5,9,-8,-95,558};
//       int sum = 0;
//       for(int i: arr){
//           sum+=i;
//       }
//        System.out.println(sum);

//        int[][] arr = new int[5][5];
//        int[][] nums = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15},
//                {16, 17, 18, 19, 20},
//                {21, 22, 23, 24, 25}
//        };
//       System.out.println(nums[2][3]);
//      for(int i=0; i<nums.length;i++){
//          for(int j=0; j<nums.length; j++){
//              System.out.print(nums[i][j] + " ");
//          }
//          System.out.println();
//      }

        char[][] arr = new char[3][2];
        arr[0][0]='a';
        arr[0][1]='b';
        arr[1][0]='c';
        arr[1][1]='d';
        arr[2][0]='e';
        arr[2][1]='f';
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
//jagged array --> array iof different length of array

    }
}


