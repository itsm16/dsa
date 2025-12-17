package dsaTopics.stepTwo.lecOneSorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsorted = {6, 5, 4, 3, 2, 1};
        int[] sorted = insertionSort(unsorted);
        for (int i : sorted){
            System.out.println(i);
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr.length-1){
                return arr;
            }
                for (int j = 0; j < i; j++) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
        }
        return arr;
    }
}
