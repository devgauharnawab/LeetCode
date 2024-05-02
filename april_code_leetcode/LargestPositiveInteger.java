package april_code_leetcode;

import java.util.Arrays;

public class LargestPositiveInteger {
    public static int findMaxK(int[] nums){
        Arrays.sort(nums);
        int n = nums.length-1;
        for(int i = n; i >= 0; i--){
            if(nums[i] > 0 && Arrays.binarySearch(nums , -nums[i]) >= 0){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {-1,2,-3,3};
        int res = findMaxK(nums);
        System.out.println(res);
    }
}
