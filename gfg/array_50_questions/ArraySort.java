package gfg.array_50_questions;

import java.util.Arrays;

public class ArraySort {
    static int[] sortArr(int[] arr , int n){
        Arrays.sort(arr,0,n);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        int n = 4;
        int[] ans = sortArr(arr, n);
       for (int i = 0; i < arr.length; i++){
           System.out.print(arr[i]);
       }
        System.out.println();
    }
}
