package array_questions;
//11. Container With Most Water

public class MaxArea {
    public int maxArea(int[] height) {
        //using two pointer
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int area = Math.min(height[left] , height[right]) * (right-left);
            max = Math.max(max,area);
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        MaxArea mx = new MaxArea();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans = mx.maxArea(height);
        System.out.println("Maximum area is : " + ans);
    }
}


//--------------------------------------------------------------------------------
//For Debugging
/*Sure, let's debug the code with the given example input `[1,8,6,2,5,4,8,3,7]`.

        1. **Initialization**:
        - `left` is set to 0.
        - `right` is set to `height.length - 1`, which is 8.
        - `max` is initialized to 0.

        2. **While loop**:
        - Since `left` (0) is less than `right` (8), the loop begins.
   - Calculate `area` using the formula: `min(height[left], height[right]) * (right - left)`:
        - `min(height[0], height[8]) = min(1, 7) = 1 * (8 - 0) = 8`.
        - Update `max` to 8.
        - Since `height[left] < height[right]`, increment `left`.

        3. **Next iteration**:
        - Now, `left` is 1 and `right` is still 8.
        - Calculate `area`:
        - `min(height[1], height[8]) = min(8, 7) = 7 * (8 - 1) = 7 * 7 = 49`.
        - Update `max` to 49.
        - Since `height[left] < height[right]`, increment `left` again.

4. **Next iteration**:
        - Now, `left` is 2 and `right` is still 8.
        - Calculate `area`:
        - `min(height[2], height[8]) = min(6, 7) = 6 * (8 - 2) = 6 * 6 = 36`.
        - `max` remains unchanged (49).
        - Since `height[left] < height[right]`, increment `left` again.

5. **Next iteration**:
        - Now, `left` is 3 and `right` is still 8.
        - Calculate `area`:
        - `min(height[3], height[8]) = min(2, 7) = 2 * (8 - 3) = 2 * 5 = 10`.
        - `max` remains unchanged (49).
        - Since `height[left] < height[right]`, increment `left` again.

6. **Next iteration**:
        - Now, `left` is 4 and `right` is still 8.
        - Calculate `area`:
        - `min(height[4], height[8]) = min(5, 7) = 5 * (8 - 4) = 5 * 4 = 20`.
        - `max` remains unchanged (49).
        - Since `height[left] < height[right]`, increment `left` again.

7. **Next iteration**:
        - Now, `left` is 5 and `right` is still 8.
        - Calculate `area`:
        - `min(height[5], height[8]) = min(4, 7) = 4 * (8 - 5) = 4 * 3 = 12`.
        - `max` remains unchanged (49).
        - Since `height[left] < height[right]`, increment `left` again.

8. **Next iteration**:
        - Now, `left` is 6 and `right` is still 8.
        - Calculate `area`:
        - `min(height[6], height[8]) = min(8, 7) = 7 * (8 - 6) = 7 * 2 = 14`.
        - `max` remains unchanged (49).
        - Since `height[left] > height[right]`, decrement `right`.

        9. **Next iteration**:
        - Now, `left` is 6 and `right` is 7.
        - Calculate `area`:
        - `min(height[6], height[7]) = min(8, 3) = 3 * (7 - 6) = 3 * 1 = 3`.
        - `max` remains unchanged (49).
        - Since `height[left] > height[right]`, decrement `right` again.

10. **Next iteration**:
        - Now, `left` is 6 and `right` is 6.
        - Since `left` is equal to `right`, the loop ends.

11. **Return**:
        - The function returns `max`, which is 49.

The output of the function matches the expected output (49) for the given input `[1,8,6,2,5,4,8,3,7]`, so the code appears to be correct.*/
