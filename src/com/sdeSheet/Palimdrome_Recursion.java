package com.sdeSheet;

import java.util.Scanner;

public class Palimdrome_Recursion {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        int n = str.length()-1;
        boolean isPal = checkPalindrome(0,n,str);
        System.out.println(isPal);
    }
    static boolean checkPalindrome(int start, int end, String s){
        if(start >= end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return checkPalindrome(start+1, end-1, s);
    }
}
