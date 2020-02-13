package com.example.javacore_concept_programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> countryCode = new HashMap<>();
        countryCode.put("AUSTRALIA", "AUS");
        countryCode.put("INDIA", "IND");
        countryCode.put("PAKISTAN", "PAK");
        countryCode.put("AMERICA", "USA");
        // System.out.println(countryCode);
        Set<Map.Entry<String, String>> countryList = countryCode.entrySet();
        System.out.println("Country List is:" + countryList);
        Set<String> countries = countryCode.keySet();
        System.out.println("Country Name is " + countries);
        Collection<String> isoCodes = countryCode.values();
        System.out.println("Country iso code " + isoCodes);


    }
}
