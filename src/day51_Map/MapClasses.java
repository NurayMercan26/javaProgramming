package day51_Map;


import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        Map<Integer, String> Hashmap = new HashMap<>();
        Hashmap.put(10,"Arthur");
        Hashmap.put(20,"George");
        Hashmap.put(3,"Jack");
        Hashmap.put(40,"Emma");
        Hashmap.put(5,"Can");
        Hashmap.put(3,"Jack");
        Hashmap.put(40,"Emma");
        Hashmap.put(5,"Isebella");
        Hashmap.put(5,"Ali");
        Hashmap.put(null,"ali");
        Hashmap.put(null,"Ahmet");
        Hashmap.put(null,"Hasan");
        Hashmap.put(null,"Isel");

        System.out.println(Hashmap);


        Map<Integer, String> LinkedHashMap= new LinkedHashMap<>();
        LinkedHashMap.put(10,"Arthur");
        LinkedHashMap.put(20,"George");
        LinkedHashMap.put(3,"Jack");
        LinkedHashMap.put(40,"Emma");
        LinkedHashMap.put(5,"Can");
        LinkedHashMap.put(3,"Jack");
        LinkedHashMap.put(40,"Emma");
        LinkedHashMap.put(5,"Isebella");
        LinkedHashMap.put(5,"Ali");
        LinkedHashMap.put(null,"ali");
        LinkedHashMap.put(null,"Ahmet");

        System.out.println(LinkedHashMap);

        Map<Integer, String> TreeMap = new TreeMap<>();
        TreeMap.put(10,"Arthur");
        TreeMap.put(20,"George");
        TreeMap.put(3,"Jack");
        TreeMap.put(40,"Emma");
        TreeMap.put(5,"Can");
        TreeMap.put(3,"Jack");
        TreeMap.put(40,"Emma");
        TreeMap.put(5,"Isebella");
        TreeMap.put(5,"Ali");
       // Treemap.put(null,"ali");
       // Treemap.put(null,"Ahmet");

        System.out.println(TreeMap);

        Map<Integer, String> Hashtable = new Hashtable<>();
        Hashtable.put(10,"Arthur");
        Hashtable.put(20,"George");
        Hashtable.put(3,"Jack");
        Hashtable.put(40,"Emma");
        Hashtable.put(5,"Can");
        Hashtable.put(3,"Jack");
        Hashtable.put(40,"Emma");
        Hashtable.put(5,"Isebella");
        Hashtable.put(5,"Ali");
      //  Hashtable.put(null,"Veli");

        System.out.println(Hashtable);
    }

}
