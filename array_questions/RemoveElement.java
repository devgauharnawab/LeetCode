package array_questions;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
      int k = nums.length;
        Arrays.sort(nums,0,k);
        int occurence = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[occurence] = nums[i];
                occurence++;
            }
        }
        return occurence;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {3,2,2,3};
        int val = 3;
        int ans = re.removeElement(nums,val);
        System.out.println(ans);
    }
}









 /*   int index = 0;
        for (int i = 0; i < nums.length; i++){
        if (nums[i] != val){
        nums[index] = nums[i];
        index++;
        }
        }
        return index;*/