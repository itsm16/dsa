package chaicodeLeet.arrays;

/*
Concept - Binary Search

- its easy to search in a sorted array
if sorted - binary search can be a considerable method
- log n complexity - logn in searching is only in binary search

in binary search
array is divided into two parts
left that tells us about the left end
right that tells about the right end
mid that tells about the low plus high divided by 2

In this question, we can check the target given to us.
Check if target is equal to mid if not
then if target Greater than or smaller than mid.
In a sorted array, we will decide whether we have to
search between left to mid or whether we have to search between mid to right.

and accordingly whether we choose left array or right array
we'll have new left or right replaced by middle

Also we have to only work on a single arr after deciding the array.
* */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,9,12};
        int result = solution(arr, 10);
        System.out.println(result);
    }

    public static int solution(int[] arr, int target){
        int left = 0;
        int right = arr.length;

        while(left < right){
            int mid = left + (right-left) /2;

            if(arr[mid] == target) return mid;

            if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            return left+1;
        }

        return 0;
    }
}
