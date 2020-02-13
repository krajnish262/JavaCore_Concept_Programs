package com.example.javacore_concept_programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapSortingDemo {
    public static void main(String[] args) {
        Map<Integer, String> sortingMap = new HashMap<Integer, String>();
        sortingMap.put(101, "RAJNISH");
        sortingMap.put(501, "VIVEK");
        sortingMap.put(601, "GULSHAN");
        sortingMap.put(201, "LALIT");
        System.out.println("Before Sorting");
        Set set = sortingMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.print(pair.getKey() + " ");
            System.out.println(pair.getValue() + " ");
        }

        Map<Integer, String> hashMap = sortByValue((HashMap) sortingMap);
        System.out.println("After Sorting    ");
        Set set1 = hashMap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator1.next();
            System.out.print(pair.getKey()+" ");
            System.out.println(pair.getValue());
        }
       /* Map<Integer, String> usingTreeMap = new TreeMap<>();
        usingTreeMap.put(101, "RAJNISH");
        usingTreeMap.put(501, "VIVEK");
        usingTreeMap.put(601, "GULSHAN");
        usingTreeMap.put(201, "LALIT");
        System.out.println("--------------------------");
        System.out.println("After Sorting");
        Set set1 = usingTreeMap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator1.next();
            System.out.print(pair.getKey() + " ");
            System.out.println(pair.getValue() + " ");
        }
*/
    }


    public static HashMap sortByValue(HashMap hashMap) {
        //custom comparator
        List list = new LinkedList(hashMap.entrySet());
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());

            }
        });
        HashMap sortedHashMap = new LinkedHashMap();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            sortedHashMap.put(pair.getKey(), pair.getValue());

        }
        return sortedHashMap;
    }


}
