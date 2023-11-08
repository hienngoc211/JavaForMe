package Bai8_Collections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollections_Map {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        // Add value key = value
        map.put("name","Jolie");
        map.put("age", "30");
        map.put("address","Da Nang");

        // Truy xuat gia tri

        System.out.println(map.get("name"));

        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + "," + "Value = " + entry.getValue());
        }

    }
}
