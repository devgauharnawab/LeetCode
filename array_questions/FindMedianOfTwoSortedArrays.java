package array_questions;

public class FindMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merge = new int[m+n];
        //take three variables
        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
            if (nums1[i] < nums2[j]){
                merge[k] = nums1[i];
                i++;
            }else{
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }
        //for overflow
        while (i < m){
            merge[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n){
            merge[k] = nums2[j];
            j++;
            k++;
        }
        if (m + n % 2 != 0){ // 3 % 2 = 1
            //ye odd find karega
            return merge[(m+n)/2]; // 2 + 1 /2 = 1.5
        }else{
            int x = m + n / 2;
            double p = merge[x];
            double q = merge[x-1];
            return p + q /2;
        }
    }

    public static void main(String[] args) {
        FindMedianOfTwoSortedArrays fm = new FindMedianOfTwoSortedArrays();
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        double ans = fm.findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
}
