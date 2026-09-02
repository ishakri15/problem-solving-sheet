package com.sdeSheet;

public class ConcatenateStringVarArgs {
    public static String concatStrings(String ...str){
        String result = "";
        for(String s : str){
            result += s + " ";
        }
        return result;
    }

    static void main() {
        System.out.println(concatStrings("Hello",",","how","are","you","?"));
    }
}
