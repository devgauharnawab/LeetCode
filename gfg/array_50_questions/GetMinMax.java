package gfg.array_50_questions;
//Question Link : https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

public class GetMinMax {
    static class Pair {
        long min;
        long max;

        Pair(long min, long max) {
            this.min = min;
            this.max = max;
        }
    }

    public Pair getMinMax(long[] arr, long n) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new Pair(min, max);
    }

    public static void main(String[] args) {
        GetMinMax solution = new GetMinMax();

        // Example 1
        long[] arr1 = {3, 2, 1, 56, 10000, 167};
        int n1 = 6;
        Pair result1 = solution.getMinMax(arr1, n1);
        System.out.println("Minimum element: " + result1.min);
        System.out.println("Maximum element: " + result1.max);
    }
}
