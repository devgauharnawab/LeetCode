package binarysearchalgorithm;

public class InfiniteArray {

  static int infiniteArray(int[] arr, int target){
      int start = 0;
      int end = 1;


// Check if target is greater than arr[end]
      while (target > arr[end]) {
          int newStart = end + 1; // newStart is 2
          end = end + (end - start + 1) * 2; // doubling the box size
          start = newStart; // updating start to the new start of the box
      }
        return binarySearch(arr,target,start,end);
    }
    static  int binarySearch(int[] arr , int target , int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,190,200,230};
        int target = 10;
        System.out.println(infiniteArray(arr,target));
    }
}


//for debugging and explanation
/*Let's evaluate what happens in the loop:

        The target (15) is greater than arr[end] (3), so we enter the loop.
        newStart is set to 2, which represents the start of the next potential box.
        The size of the box (end - start + 1) is 1 (since end is 1 and start is 0), which is then multiplied by 2 and added to end.
        So, end becomes end + (1 * 2) = 3.
        start is updated to newStart, which is 2.
        After this iteration, the box now covers the range [arr[2], arr[3]], which is [5, 7]. We keep expanding the box until the target value is within the current range.*/