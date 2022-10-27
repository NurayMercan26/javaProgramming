package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();

        employeeMap.put("Ddene","F");
        employeeMap.put("Winfred","M");
        employeeMap.put("Jereme","M");
        employeeMap.put("Glad","F");
        employeeMap.put("Desirae","F");
        employeeMap.put("Kakalina","F");
        employeeMap.put("Bertrando","M");
        employeeMap.put("Ajay","F");
        employeeMap.put("Brigette","F");
        employeeMap.put("Derk","M");
        employeeMap.put("Orlondo","M");
        employeeMap.put("Selle","F");
        employeeMap.put("Marika","F");

        //1. update the "M" to male and "F" to Femaie

        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key,"Male");
            }

            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key,"Female");
            }
        }
        System.out.println(employeeMap);

        //Display the names of all female employees

    }
}
