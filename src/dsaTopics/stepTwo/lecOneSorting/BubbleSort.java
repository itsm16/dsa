package dsaTopics.stepTwo.lecOneSorting;

// Bubble sort
// push maximum to the last

// start with 0th element and start swapping , comparing next elements
// greater element goes in the end, now in the
// next pass : start from 0th again but only iterate till element before last greater elements
// excludes last greater elements

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsorted = {12, 55, 21, 8, 33};
        int[] sorted = doBubbleSort(unsorted);
        for (int i : sorted){
            System.out.println(i);
        }
    }

//    correct one
    public static int[] doBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            // for the next loop
            // arr.length - 1 to not go till last element (which will be the greatest number after swaps, so not iteration there)
            // also j + 1 when on last element won't be possible , error - IndexOutOfBound

            // and we do -i from that to not iterate over greater numbers that are placed at last
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

/*
    public static int[] doBubbleSort(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
//                System.out.println(arr[j]);
//                System.out.println(arr[j + 1]);

                if (arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
//                System.out.println("---------");
            }
        }

        return arr;
    }
*/
    
}
