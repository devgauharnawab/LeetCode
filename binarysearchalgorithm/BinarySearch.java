package binarysearchalgorithm;

public class BinarySearch {
    //Binary Search Algorithm work on Sorted Array
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            //find middle element
//            int mid = (start+end)/2; this may exceed integer range
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;//means answer found
            }
        }
        //if target element is not exist in the array so we have to return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
//Time complexity = O(log n)