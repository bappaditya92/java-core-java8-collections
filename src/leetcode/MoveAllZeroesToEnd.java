package leetcode;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {

        int[] arr = {5,96,1,38,9,3,7,2,3,8,0,2,2};

        int index = 0;

        for(int num : arr) {
            if(num != 0) {
                arr[index++] = num;
            }
        }

        while(index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}