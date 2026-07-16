
package questions.arrays.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * LongestSubarray
 * longest subarray with at most k distinct elements
 * 
 * sum should = k
 * longest subarray
 */


// WORK ON RETURNING LONGEST ARRAY PART
// temp => new arr
public class LongestSubarray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        int[] result = bruteLongestSubarray(arr, k);

    }
    
    static int[] bruteLongestSubarray(int[] arr, int k){
        int[] temp = new int[arr.length];
        int[] newArr = new int[arr.length];
        int max = 0;
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

        // 1, 2, 3, 1, 1, 1, 1, 4, 2, 3
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            int p=0;
            System.out.println("i: "+ i);
            for (int j = i; j < arr.length; j++) {
                if (sum >= k) {
                    System.out.println("breaking..");
                    if(sum == k && p+1 > max){
                        System.out.println("sum :" + sum + " p: " + p + " ele: " + arr[j] + " j :" + j);
                        max = p;
                    }
                    break;
                }
                // Without this break, the loop can continue until j reaches arr.length - 1.
                // Each iteration increments p before writing into temp, so p may become arr.length
                // and temp[p] would then throw ArrayIndexOutOfBoundsException.

                // System.out.println("sum :" + sum + " p: " + p + " ele: " + arr[j] + " j :" + j);
                // above log doesn't show current because latest value updates come after this log
                // can place it after p++
                sum = sum + arr[j];
                System.out.println("p:"+p + "temp:"+ temp[p] + "ele:"+ arr[j]);
                // temp[p] = arr[j]; // p =  less then value logged below
                p++;

                System.out.println("sum :" + sum + " p: " + p + " ele: " + arr[j] + " j :" + j); // p here is incremented value

            }
        }
        
        // add in new arr

        // for(int i : temp){
        //     if(temp[i] != 0){
        //         newArr[i] = temp[i];
        //     }
        // }

        // for(int i : temp){
        //     System.out.println("temp: ");
        //     System.out.println(temp[i]);
        // }

        System.out.println("max: "+ max);
        return newArr;
    }
}