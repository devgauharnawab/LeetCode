package array_questions;

public class FirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;

    }
    int search(int[] nums, int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else{
                //answer found
                ans = mid;
                if (findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        FirstAndLast solution = new FirstAndLast();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = solution.searchRange(nums, target);

        System.out.println("Range of target " + target + " is: [" + result[0] + ", " + result[1] + "]");
    }
}
