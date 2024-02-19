package array_questions;

// Question based on Binary Search
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartIndex(nums, target);
        result[1] = findLastIndex(nums, target);
        return result;
    }

    public int findStartIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    public int findLastIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    public static void main(String[] args) {
        SearchRange sr = new SearchRange();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = sr.searchRange(nums, target);
        System.out.println("Start Index: " + result[0]);
        System.out.println("End Index: " + result[1]);
    }
}
