package com.sdeSheet;

import java.util.Collection;

public class PrintCollections {
    public static <E> void printCollection(Collection<E> collection){
        for(E coll : collection){
            System.out.print(coll+" ");
        }
        System.out.println();
    }
}
