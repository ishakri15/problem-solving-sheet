package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    static void main() {
        Map<String , Integer> map = new HashMap<>();
        map.put("Isha",99);
        map.put("Dev",98);

        System.out.println(map.size());
        System.out.println(map.containsKey("Isha"));
        System.out.println(map.containsKey("Janvi"));

        //how to iterate over maop
        for(String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}
