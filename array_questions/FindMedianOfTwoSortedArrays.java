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



//    If m + n % 2 != 0, it means the total number of elements in the merged array is odd. In this case, the code calculates the middle element index using (m + n) / 2, and then retrieves the element at that index from the merge array.
//
//        Let's say m + n equals 3, and the indices of the merge array are 0, 1, and 2. So, (m + n) / 2 will be (3) / 2 = 1.5. However, since array indices are integers, the fractional part is truncated, resulting in index 1.
//
//        Therefore, the code returns the element at index 1 of the merge array, which corresponds to the middle element in the merged array. In your case, the element at index 1 of the merge array has a value of 2.0.
//
//        Hence, the answer is 2.0.

  //for debugging

//  if (m + n % 2 != 0) {
//          // Odd case
//          System.out.println("Odd case:");
//          System.out.println("m + n / 2 = " + (m + n) / 2);
//          return merge[(m + n) / 2];
//          } else {
//          // Even case
//          System.out.println("Even case:");
//          int x = m + n / 2;
//          System.out.println("x = " + x);
//          double p = merge[x];
//          double q = merge[x - 1];
//          System.out.println("merge[x] = " + p);
//          System.out.println("merge[x-1] = " + q);
//          return p + q / 2;