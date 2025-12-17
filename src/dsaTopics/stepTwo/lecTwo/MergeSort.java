package dsaTopics.stepTwo.lecTwo;

// divide and merge
// on code divide is playing with indexes
// lastly merge
public class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = {6, 5, 4, 3, 2, 1, 2};
//        int[] sorted = mergeSort(unsorted, 0, unsorted.length - 1);
        mergeSort(unsorted, 0, unsorted.length -1);

    }

    public static void mergeSort(int[] arr, int low, int high) {
        merge();
        System.out.println(high);
        System.out.println(mid(high));
        mergeSort(arr, low, high);
    }

    public static void merge() {

    }

    public static int mid(int high){
        int mid = 0;
        if (high % 2 == 0 ){
            mid = high / 2;
        }else{
            mid = (high + 1)/2;
        }
        return mid;
    }
}
