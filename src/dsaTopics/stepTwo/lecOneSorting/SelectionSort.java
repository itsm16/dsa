package dsaTopics.stepTwo.lecOneSorting;

/*
    Selection sort
    find minimum and swap

    we assume a minimum number i.e first number
    start loop from 0th
    then we iterate over all numbers , if we find numbers greater than our assumed minimum
    we swap
    - now we iterate again leaving the element from start that we swapped
    now loop starts from 1st
*/


public class SelectionSort {
    public static void main(String[] args) {
        int[] unsorted = {12, 30, 22, 22, 8, 38};
        int[] sorted = doSelectionSort(unsorted);
        for (int i : sorted){
            System.out.println(i);
        }
    }
    //    Detailed version of function below this function
    public static int[] doSelectionSort(int[] arr){
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            int min=arr[i];

            for (int j = i; j < arr.length; j++) {
                if (arr[j]<min){

                    arr[i] = arr[j]; // new min i.e < prevMin
                    arr[j] = min; // current element replaced by prevMin

                    // i.e we swapped
                    // min (min. num) in range replaced by new found minimum
                    // and new found is given previous min. number

                    // update min - min is = arr[i] in outer loop
                    // arr[i] got changed , so again we have to change min accordingly
                    min = arr[i];
                }
            }
        }

        return arr;
    }

//    Detailed

    /*
    public static int[] doSelectionSort(int[] arr){
        int[] sorted = new int[arr.length];
//        System.out.println(arr.length); // 5
        for (int i = 0; i < arr.length ; i++) {
            int min=arr[i];
            System.out.println("min:" + min); // 12

            for (int j = i; j < arr.length; j++) {
                if (arr[j]<min){
                    System.out.println("current:" + arr[j]);
                    System.out.println("new min:" + arr[j]);

                    // int prevMin = min; // holding previous minimum in prevMin
                    // prevMin is a redundant var , directly replace arr[j] with min (previous minimum number)

                    arr[i] = arr[j]; // new min i.e < prevMin
                    arr[j] = min; // current element replaced by prevMin

                    System.out.println("current num now:" + arr[j]);

                    // i.e we swapped
                    // min (min. num) in range replaced by new found minimum
                    // and new found is given previous min. number

                    // update min - min is = arr[i] in outer loop
                    // arr[i] got changed , so again we have to change min accordingly
                    min = arr[i];
                }
            }
                System.out.println("-------");
        }

        return arr;
    }
    */
}
