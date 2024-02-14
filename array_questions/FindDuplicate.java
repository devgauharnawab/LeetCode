package array_questions;

import java.util.Arrays;

public class FindDuplicate {
    public int findDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindDuplicate fd = new FindDuplicate();
        int[] arr = {1,2,3,1,4};
        int ans = fd.findDuplicate(arr);
        System.out.println(ans);
    }
}
