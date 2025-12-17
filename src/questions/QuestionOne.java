package questions;

// 2169
public class QuestionOne {
    public static void main(String[] args) {
        int num = countOperations(2,3);
        System.out.println(num);
    }


    //    3 , 2
    public static int countOperations(int num1, int num2){
        int ops = 0;

        while (num1 != 0 && num2 != 0){
           if(num1 >= num2){
               num1 -= num2;
           }else{
               num2 -= num1;
           }
           ops++;
        }
        return ops;
    }






//    using recursion
/*
    public static int countOperations(int num1, int num2) {
        // base case
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        // recursive case
        if (num1 >= num2) {
            return 1 + countOperations(num1 - num2, num2);
        } else {
            return 1 + countOperations(num1, num2 - num1);
        }
    }
 */
}
