package chaicodeLeet.arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6, 0, 0, 0};
        int[] arr2 = {1, 3, 8};

        int[] result = solution(arr1, arr2, 3);

        for (int i : result) {
            System.out.print(i + ", ");
        }
    }

    public static int[] solution(int[] a, int[] b, int m) {

        int i = m - 1;          // last REAL element in a
        int j = b.length - 1;   // last element in b
        int k = a.length - 1;   // last position in a

        while (i >= 0 && j >= 0) {

            if (a[i] > b[j]) {
                a[k] = a[i];
                i--;
            } else {
                a[k] = b[j];
                j--;
            }

            k--;
        }

        // If elements are still left in b
        while (j >= 0) {
            a[k] = b[j];
            j--;
            k--;
        }

        return a;
    }
}