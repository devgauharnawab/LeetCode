package gfg.array_50_questions;

import java.util.Arrays;
//The approach used in the provided code is the Dutch National Flag algorithm.
// This algorithm is used to sort an array containing only 0s, 1s, and 2s, often
// referred to as the Dutch National Flag problem.
public class SortAnArray {
    static void sort012(int[] arr,int n){
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (mid <= high){
            if (arr[mid] == 0){
                swap(arr,mid,low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
    }
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        int n = arr.length;
        sort012(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
