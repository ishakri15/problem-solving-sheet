package com.company;

public class Strings {
    static void main(String[] args) {
        //String str = new String("Isha");
        String str = "Ishaaaaaa";
        System.out.println(str);

        //String methods
        int value = str.length();
        System.out.println(value);

        String lString = str.toLowerCase();
        System.out.println(lString);

        String uString = str.toUpperCase();
        System.out.println(uString);

        String nonTrimmed = "  hsy  ";
        String trimmed = nonTrimmed.trim();
        System.out.println(trimmed);

        System.out.println(str.substring(2));
        System.out.println(str.substring(1,6));
        System.out.println(str.replace('a','h'));
        System.out.println(str.startsWith("Ish"));
        System.out.println(str.endsWith("sh"));
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('a'));
    }
}
