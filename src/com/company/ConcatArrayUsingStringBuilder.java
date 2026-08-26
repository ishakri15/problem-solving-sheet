package com.company;

public class ConcatArrayUsingStringBuilder {
    static void main() {
        String[] arr = {"tum ","ho ","mera ","pyar "};
        StringBuilder result = new StringBuilder();
        for(String word : arr){
            result.append(word);
        }

        System.out.println(result);
    }
}
