package array_questions;

import java.util.Arrays;

public class RemDuplicateFromSArray {
    //Inside code we use print statement for debugging
    public int removeDuplicates(int[] nums){
        //check base condition
        if (nums.length == 0) return -1;
        int curr = nums[0];
        int count = 0; //in which we store count of the element
        for (int i = 0; i < nums.length; i++){
            System.out.println("Current element: " + nums[i]); // Print current element
            if(curr == nums[i]){
                continue;
            }else{
                System.out.println("Adding element: " + nums[i] + " at index: " + count); // Print element being added
                nums[count] = nums[i];
                curr = nums[i];
                count+=1;
            }
        }
        return count;
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
