package array_questions;
//11. Container With Most Water

public class MaxArea {
    public int maxArea(int[] height) {
        //using two pointer
        int left = 0;
        int right = height.length-1;
        int max = 0;//which calculate the area and save int max variable and at the end we return max

        while(left < right){
            if(height[left] < height[right]){
                max = Math.max(max,height[left] * (right-left));
                left+=1;
            }else{
                max = Math.max(max,height[right] * (right-left));
                right-=1;
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
