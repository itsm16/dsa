package questions;

// 9. Palindrome

public class Two {
    public static void main(String[] args) {
        boolean check = checkPalindrome(1881);
        System.out.println(check);
    }

    public static boolean checkPalindrome(int num) {
        int givenNum = num;
        int reversed = 0;
        while (givenNum > 0){
            int lastDigit = givenNum % 10;
            givenNum /=  10;
            reversed = reversed * 10 + lastDigit;
        }

        return num == reversed;
    }
}
