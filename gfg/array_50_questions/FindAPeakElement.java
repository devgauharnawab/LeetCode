package gfg.array_50_questions;

public class FindAPeakElement {
    static int findPeakElement(int[] arr,int n){
        int start = 0;
        int end = n - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        System.out.println(findPeakElement(arr,n));
    }
}
