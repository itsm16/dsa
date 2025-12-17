package dsaTopics.stepOne.lecSixHashing;

public class CountNumberFreq {
    public static void main(String[] args) {
//        int[] arr={0, 1, 2, 2};
        int frequency = countFreq(2, new int[] {0, 2, 2, 1, 2});
        System.out.println(frequency);
    }

//    2
    public static int countFreq(int num, int[] arr){
        int[] hash = new int[13];

//        arrays in Java are 0-indexed, so valid indices are 0 to arr.length - 1.
//        use arr.length - 1
/*         for example if we have an array having 4 elements so indexes will be
            0 , 1 , 2 , 3 i.e last element is 3 which is 1 less than arr length
            so i can only be till 3 i.e < or 1 less than arr.length
            i.e i < arr.length or  i <= arr.length - 1
            or error IndexOutOfBound
*/
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
//            System.out.println(element);
            hash[element] += 1;
//            System.out.println("hash:" + hash[element]);
        }

        return hash[num];
    }
}
