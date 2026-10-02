package chaicodeLeet.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,4,4,4};
        int result = solution(arr);
        System.out.println(result);
    }

//    Two pointer
//  i , j => increment j=> compare arr[i] and arr[j]
//    when i j equal increment j
//  i != j , incre i and arr[i] = arr[j]
//    unique elements got collected at start of the array where i is pointing
//    we return i +1 => that'll be count of unique elements

    public static int solution(int[] arr){
        int j=1;
        int i=0;
        while(j <= arr.length){
            if(j >= arr.length) break;
//            System.out.println(j);

            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            };

            j++;
        }

        for(int k : arr){
            System.out.println(k);
        }
        return i+1;
    }

}
