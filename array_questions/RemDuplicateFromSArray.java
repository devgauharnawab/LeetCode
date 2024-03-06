package array_questions;

import java.util.Arrays;

public class RemDuplicateFromSArray {
    //Inside codes  we use print statement for debugging
        //check base condition
        public int removeDuplicates ( int[] nums){
            if (nums.length == 0) {
                return 0;
            }

            int result = 0;
            for(int i = 1; i < nums.length; i++){
                if(nums[result] != nums[i]){
                    result++;
                    nums[result] = nums[i];
                }
            }
            return result + 1;
        }
        public static void main(String[] args) {
        RemDuplicateFromSArray rs = new RemDuplicateFromSArray();
        int[] nums = {1,1,2};
        System.out.println("Input array: " + Arrays.toString(nums)); // Print input array
        int res = rs.removeDuplicates(nums);
        System.out.println("Duplicate is : " + res);
        System.out.println("Modified array: " + Arrays.toString(nums)); // Print modified array
    }
}


