package binarysearchalgorithm;

public class OrderAgnosticBinarySearch {
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //first we check whether element is in ascending or descending order
        //create variable boolean
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //for ascending order
//        int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        //for descending order
        int arr[] = {90,50,40,24,20,19,13,10,8};
        int target = 50;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }
}
