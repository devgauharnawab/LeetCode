package gfg.array_50_questions;

import java.util.Arrays;

public class KthSmallestNumber {
    static int kthSmallestNumber(Integer[] arr , int K){
        Arrays.sort(arr);
        //4 7 10 15 20
        return arr[K-1];
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 7,10,4,20,15 };
        int K = 3;
        System.out.println(kthSmallestNumber(arr,K));
    }
}
