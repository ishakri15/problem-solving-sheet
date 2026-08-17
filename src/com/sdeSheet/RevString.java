package com.sdeSheet;

public class RevString {
    public static String reverseString(String s){
        String revString = "";
        for(int i=s.length()-1; i>=0; i--){
            revString += s.charAt(i);
        }
        return revString;
    }
    static void main(String[] args) {
        String str = "Geeks";
        String rev = reverseString(str);
        System.out.println(rev);
    }
}
