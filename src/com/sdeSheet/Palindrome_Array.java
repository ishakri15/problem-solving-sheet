package com.sdeSheet;

public class Palindrome_Array {
    static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        int n = arr.length;
        boolean isPalindrome = false;
        for(int i=0; i<n/2; i++){
            if(arr[i] == arr[n-1-i]){
                isPalindrome = true;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
