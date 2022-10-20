package org.example.Problem9;

import java.util.ArrayList;
import java.util.Objects;

public class PalindromeNumber {

    private static boolean isPalindrome(int number) {

        if(number < 0){
            return false;
        }

        ArrayList<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }

        for (int i = 0; i < digits.size() / 2; i++) {
            if (!Objects.equals(digits.get(i), digits.get(digits.size() - 1 - i))) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        boolean palindrome = isPalindrome(-121);
        System.out.println(palindrome);

    }


}
