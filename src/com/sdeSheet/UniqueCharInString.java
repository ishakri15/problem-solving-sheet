package com.sdeSheet;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharInString {
    static void main() {
        String str = "characters";
        Set<Character> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                count++;
            }else{
                count--;
            }
        }

        System.out.println(count);
    }
}
