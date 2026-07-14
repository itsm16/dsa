package dsaTopics.stepTwo.lecTwo;

public class testMergeSort {
    public static void main(String[] args) {
        int[] unsorted = {6, 5, 4, 3, 2, 1, 2};
        mergeSort(unsorted, 0, unsorted.length - 1);
        for(int i  : unsorted) System.out.print(i + " ");
    }
    
    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;             
        }
        // for(int i  : arr) System.out.print(i + " ");
        int mid = low + (high - low) / 2;

        // System.out.println("low: " + low + " mid: " + mid + " high: " + high);
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int l = low;
        int r = mid + 1;

        int k = 0; // original array pointer for temp array

        // pointer l, r move 
        // compared using l, r and smaller one is put at temp[k] and k is incremented
        while(l <= mid && r <= high){
            if(arr[l] <= arr[r]){
                temp[k] = arr[l];
                l++;
            }
            else{
                temp[k] = arr[r];
                r++;
            }

            k++;
        }

        // left over first or pointer reached end
        // copy right over as it is
        if(l >= mid){ // > only will do
            while(r <= high){
                temp[k] = arr[r];
                r++;
                k++;
            }
        }
        
        // right over first or pointer reached end
        // copy left over as it is 
        if(r >= high){
            while(l <= mid){
                temp[k] = arr[l];
                l++;
                k++;
            }
        }
        //temp array is ready now we need to copy it back to the original array

        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

        System.out.println(" ");

        //copying the temp array back to the original array
        for(int i = 0; i < temp.length; i++){
            arr[low + i] = temp[i];
        }

        // int temp[] = new int[]
        // for(int i  : arr) System.out.print(i + " ");
    }
}
