package org.example.lesson7;

public class PalindromeChecker {
    public static boolean isPalindrome(String s){
        String[] arr = s.split("");
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (!arr[start].equals(arr[end])) return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }
}
