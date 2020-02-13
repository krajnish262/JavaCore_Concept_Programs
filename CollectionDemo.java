package com.example.javacore_concept_programs;


import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static String vehicles[] = {"ambulance", "car", "helicopter", "bus", "train"};
    public static String drivers[][] =
            {{"Ramu", "Shyam", "vijay", "ajay", "manish"},
                    {"gori", "kali", "harami", "chichora", "pagla"},
                    {"hero", "hello", "hi", "oho", "kiki"},
                    {"Ramu", "Shyam", "vijay", "ajay", "manish"}};


    public static void main(String[] args) {
        Map<String, Set<String>> setMap = new HashMap<String, Set<String>>();
        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driverList = drivers[i];
            Set<String> driverset = new LinkedHashSet<String>();
            for (String driver : driverList) {

                driverset.add(driver);
                setMap.put(vehicle, driverset);
                // System.out.println(driver);


            }
            Set<String> driverListitem = setMap.get("helicopter");
            for (String driver : driverListitem) {

                System.out.print(driver);

            }

        }
        for (String vehicle : setMap.keySet()) {
            System.out.print(vehicle);
            System.out.println(" , ");
            Set<String> driverListname = setMap.get(vehicle);
            for (String driver : driverListname) {
                System.out.print(driver);
                System.out.println(" ");


            }
            System.out.println();

        }


    }
}
