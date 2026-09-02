package com.sdeSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQues {
    static void main() {
        Map<String, String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("Nepal","Kathmandu");
        map.put("China","Beijing");
        map.put("Pakistan","Lahore");
        map.put("Japan","Tokyo");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a country : ");
        String input = sc.nextLine();
        if(map.containsKey(input)){
            System.out.println("Its capital is "+map.get(input));
        }else{
            System.out.println("No such country found");
        }
    }
}
