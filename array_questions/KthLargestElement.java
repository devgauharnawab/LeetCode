package array_questions;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargerstElement(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            if(pq.size() < k){
                pq.offer(num);
            }else if(num > pq.peek()){
                pq.poll();
                pq.offer(num);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args){
        KthLargestElement kk = new KthLargestElement();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = findKthLargerstElement(nums,k);
        System.out.println(res);
    }
}
